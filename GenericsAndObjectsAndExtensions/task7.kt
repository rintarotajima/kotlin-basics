/* タスク7
チームは、あなたが設計したデータクラスを好んで使用していますが、文字列のイベント期間を必要とするたびにコードを記述し直すことが手間であると感じています。
val durationOfEvent = if (events[0].durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }
println("Duration of first event of the day: $durationOfEvent")

この繰り返しはメソッドをクラスに直接追加することで修正できますが、他のチームがそれぞれのアプリであなたのイベントクラスをすでに使い始めているため、この方法は理想的でありません。クラスを変更すれば、その変更により破損が発生しないことを検証するために、すべてのコードをテストし直す必要があるからです。
データクラスを直接変更せずに上記のコードと同じ値を返す拡張プロパティを作成するには、どうすればよいでしょうか？
正しく実装すると次の次のコードを使用できるようになり、このタスクの開始時に表示されたコードと同じメッセージが出力されます。
println("Duration of first event of the day: $durationOfEvent")
 */



fun main() {
    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)

    val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)
    println("Duration of first event of the day: ${events[0].durationOfEvent}") 

    /*　メモ
    拡張関数は独立させる?
     */
}

data class Event(
   val title: String,
   val description: String? = null,
   val daypart: Daypart,
   val durationInMinutes: Int
)

enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

 /* 実装メモ
 拡張関数が使えそう⇒拡張プロパティを使い方
  */

val Event.durationOfEvent: String
get() = if (this.durationInMinutes < 60) {
    "short"
} else {
    "long"
}


