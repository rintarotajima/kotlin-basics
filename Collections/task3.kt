/* タスク3
同僚は、リファクタリングされた Daypart を好んで使用していますが、別の問題があります。
ユーザーのイベントの作成および保存には、現在以下のコードが使用されています。
val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
現時点のコードでは、大量のイベントが生成されるだけでなく、それぞれのイベントに独自の変数が必要になります。生成されるイベントが増えるに従い、すべてのイベントをトラッキングすることが困難になります。このアプローチでは、ユーザーの作成したイベントの数を確認することが非常に困難となるでしょう。
このように保存されたイベントを整理する方法として、より優れた方法はないでしょうか？
すべてのイベントを 1 つの変数に格納するにはどのような方法がありますか（注: イベントがさらに追加される可能性があるため、柔軟性が必要になります。また、変数に格納されているイベントの数を効率的に返す必要もあります）？
どのクラスまたはデータ型を使用しますか？イベントをさらに追加する方法として何がありますか？
では、この機能を自分で実装してみましょう。[次へ] をクリックして解決策を表示する前に、自分でコードを記述してみてください。
*/


fun main() {
    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
    
    val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)
    println(events)
    // println(events[6])
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



 