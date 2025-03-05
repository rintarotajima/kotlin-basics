fun main() {
    // val trickFunction = trick *error: function invocation 'trick()' expected
    // val trickFunction = ::trick  *関数参照演算子「::」を用いることで関数を値として参照可能。
    // val trickFunction = trick *ラムダ式を使うと、変数として関数を参照可能。
    // trick() *関数呼び出し
    // trickFunction() *関数のように呼び出せる変数に関数を格納できる。
    // treat()

    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    val cupcake: (Int) -> String = { 
        "Have a cupcake!"
    }

    val treatFunction = trickOrTreat(false, coins)
    val trickFunction = trickOrTreat(true, null)
    treatFunction()
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
             println(extraTreat(5))
        }
        return treat
    }
}

val trick = {
    print("No treat!")
}


val treat: () -> Unit = {
    print("Have a treat!")
}