/*
別のソフトウェア エンジニアがすでにアプリの大まかな作業を完了していて、あなたはその詳細を実装するタスクを任されたとします。
あなたは、Event クラスを実装する必要があります。このクラスは、ユーザーが入力したイベントの詳細を保持するために使用されます
（ヒント: このクラスではメソッドの定義やアクションの実行は不要です）。
このタスクでは、Event という名前のデータクラスを作成する必要があります。

このクラスのインスタンスは以下を保存できます。
イベントのtitle（タイトル、文字列）。
イベントのdescription（説明、文字列 で null でもよい）。
イベントのdaypart（時間帯、文字列）。トラッキングするのは、イベントが始まった時間帯（Morning、Afternoon、Evening のいずれか）のみです。
イベントのduration（分単位の時間、整数）。
続行する前に、自分でコードを記述してみてください。

そのコードを使用して、次の情報でインスタンスを作成します。
タイトル: Study Kotlin（Kotlin の学習）
説明: Commit to studying Kotlin at least 15 minutes per day.（1 日に 15 分以上 Kotlin を学習することを約束します。）
時間帯: Evening（夜）
期間: 15

 */

 data class Event(
    val title: String,
    val description: String? = null,
    val daypart: String,
    val durationInMinutes: Int
 )

 fun main() {
    val event1 = Event(title="Study Kitlin", description="Commit to studying Kotlin at least 15minutes per day.", daypart="Evening",durationInMinutes=15)
    println(event1)
 }

