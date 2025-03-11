/*
チームメイトはアプリの機能に満足しています。ただ、ユーザーがすべてのイベントと時間帯の概要を表示できるようにしたいと考えています。
次のような出力を想定しています。
Morning: 3 events
Afternoon: 4 events
Evening: 2 events
前のタスクでも使った events 変数コードを使用してこの結果を得るには、どうすればよいでしょうか？
*/

fun main() {
    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
    val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)

    val morningEvents = events.filter { it.daypart == Daypart.MORNING }
    // println(morningEvents)
    // println("Morning: ${morningEvents.size} events")

    val afternoonEvents = events.filter { it.daypart == Daypart.AFTERNOON }
    // println(afternoonEvents)
    // println("AfterNoon: ${afternoonEvents.size} events")

    val eveningEvents = events.filter { it.daypart == Daypart.EVENING }
    // println(eveningEvents)
    // println("Evening: ${eveningEvents.size} events")

    val groupedEvents = events.groupBy { it.daypart }
    groupedEvents.forEach { (daypart, events) -> 
        // println("$daypart")
        // println("$events")
        println("$daypart: ${events.size} event")
    }

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
events変数内にあるeventデータをDaypartプロパティを基準に3つに分ける必要がある．
2つに分けるときに使えるgroupBy()関数よりfilter()関数を使う？
 */