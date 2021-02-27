fun main() {
    val likes = 2
    val result = if (likes % 100 !== 11 && likes % 10 == 1) {"человеку"} else {"людям"}
    println("Понравилось $likes $result")

}