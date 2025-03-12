/*  タスク6
現在、同僚はインデックスを使用してその日の最後の項目（イベント）を特定および出力しています。使用されているコードは println("Last event of the day: ${events[events.size - 1].title}") です。
マネージャーは、Kotlin のドキュメントを確認して、このコードを単純化できる関数を探すことを提案しています。
どのような関数を思いつきますか？
それを使用し、同じ結果が出力されることを確認してください。
 */

fun main() {
    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)

    val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)

    val groupedEvents = events.groupBy {it.daypart}
    // println(groupedEvents)
    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} event")
    }

    println("Last event of the day: ${events[events.size -1 ].title}")
    val lastEvent = events.last()
    println(lastEvent)
    println(lastEvent.title)
    
    println("Last event of the day: ${events.last().title}")
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