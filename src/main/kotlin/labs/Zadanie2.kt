import kotlin.random.Random
fun main() {
val numbervistrel = 3
val numbermishen = 3
var result = 0
for (target in 1..numbermishen) {
println("Мишень $target:")
        var Score = 0
        for (shot in 1..numbervistrel) {
    val isHit = Random.nextBoolean()
         if (isHit) {
         Score++
         result++
                println("Выстрел $shot: Попал!")
            } else {
                println("Выстрел $shot: Промах")
            }
        }
        println("Баллы за мишень: $Score\n")
    }
    println("ВСего балов: $result")
}