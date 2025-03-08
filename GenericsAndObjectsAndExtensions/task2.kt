/*
マネージャーは、データクラス用に私たちが構築したコードを使用してプロジェクトを進めることにしました。
チームメンバーがしばらく Event クラスを使用した後、シニア チームメイトが、時間帯として文字列を使用することが望ましくないことに気付きました。
「Morning」という値を保存する開発者もいれば、「morning」、「MORNING」などの値を使用する開発者もいます。
これが、多くの問題につながりました。
ここでのタスクは、リファクタリングを行ってこの問題を修正することです。リファクタリングは、その機能を変更せずにコードを改善する処理です。これには、ロジックの簡素化や、繰り返しコードの別の関数への移動などがあります。
この問題を修正するため一部の個別の値をモデル化するには、どの型のクラスを使用すればよいでしょうか？
チームは、あなたに時間帯コードを enum（列挙型）クラスを使用するように変更してもらいたいと考えています。enum クラスを使用すれば、チームメイトが時間帯を指定する際に提示される時間帯値のいずれかを選択することとなるため、この種の問題は回避できます。
この enum クラスには Daypart という名前を付けます。含まれる値は次の 3 つです。
MORNING
AFTERNOON
EVENING
この enum クラスを、あなたならどのように作成しますか？
Event クラスをリファクタリングして使用できるようにするには、どうすればよいですか？
 */

fun main() {
    val event1 = Event(title="Study Kitlin", description="Commit to studying Kotlin at least 15minutes per day.", daypart=Daypart.EVENING,durationInMinutes=15)
    println(event1)
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int
)

enum class Daypart {
    MORNING, AFTERNOON, EVENING
}
