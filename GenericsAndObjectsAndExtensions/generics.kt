// class FillinTheBlankQuestion(
//     val questionText: String,
//     val answer: String,
//     val difficulty: String
// )

// class TrueOrFalseQuestion(
//     val questionText: String,
//     val answer: Boolean,
//     val difficulty: String
// )

// class NumericQuestion(
//     val questionText: String,
//     val answer: Int,
//     val difficulty: String
// )

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty {
    EASY, MEDIUM, HARD
}

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar() 
}

class Quiz: ProgressPrintable {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is greeen. True or False", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
   
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }

    override val progressText: String
        get() = "${answered} of ${total} answered"

    override fun printProgressBar() {
        repeat(Quiz.answered) { print("□")}
        repeat(Quiz.total - Quiz.answered) { print("■")}
        println()
        println(progressText)
    }

    // fun printQuiz() {
    //     println(question1.questionText)
    //     println(question1.answer)
    //     println(question1.difficulty)
    //     println()
    //     println(question2.questionText)
    //     println(question2.answer)
    //     println(question2.difficulty)
    //     println()
    //     println(question3.questionText)
    //     println(question3.answer)
    //     println(question3.difficulty)
    //     println()
    // }

    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()    
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
    }
}

// val Quiz.StudentProgress.progressText: String
//     get() = "${answered} of ${total} answered"

// fun Quiz.StudentProgress.progressBar() {
//     repeat(Quiz.answered) { print("▓") }
//     repeat(Quiz.total - Quiz.answered) { print("▒") }
//     println()
//     println(Quiz.progressText)
// }


fun main() {
    Quiz().apply {
        printQuiz()
    }
}

