fun main() {
    val rockPlanets = arrayOf<String>("Mercury", "Venus","Earth","Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets + gasPlanets
    // println(solarSystem[0])
    // println(solarSystem[1])
    // println(solarSystem[2])
    // println(solarSystem[3])
    // println(solarSystem[4])
    // println(solarSystem[5])
    // println(solarSystem[6])
    // println(solarSystem[7])

    // 配列の値を更新
    solarSystem[3] = "Little Earth"
    println(solarSystem[3])

    // 配列のサイズは変更できないためエラーになる 
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    // solarSystem[8] = "Pluto"

    // 新しい配列を作成
    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
    println(newSolarSystem[8])
}