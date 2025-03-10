/*
マネージャーはアプリの機能に満足しています。ただ、イベントの期間に基づいて、ユーザーが短いイベントの概要を表示できるようにする必要があると判断しました。たとえば、「短いイベントが 5 件あります」などです。
「短い」イベントとは 60 分未満のイベントです。
前のタスクの解決策の events 変数コードを使用してこの結果を得るには、どうすればよいでしょうか？
 */

 fun main() {
    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
    
    val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)
    // println(events)

    val shortEvents = events.filter { it.durationInMinutes < 60 } 
    // println(shortEvents)
    println("ShortEvents Menu:")
    shortEvents.forEach {
        println(it)
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

/*
実装メモ
durationInMinutesプロパティに関してfilter()関数が使えそう．
 */ 