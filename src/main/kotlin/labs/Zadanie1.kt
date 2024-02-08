
import kotlin.random.Random

fun main() {
    val random = Random(System.currentTimeMillis())
    val perv = random.nextInt(0, 11)
    val vtor = random.nextInt(0, 11)
    val tri = random.nextInt(0, 11)
    val gotovils1 = if (random.nextBoolean()) "плохо" else "хорошо"
    val gotovils2 = if (random.nextBoolean()) "плохо" else "хорошо"
    val gotovils3 = if (random.nextBoolean()) "плохо" else "хорошо"
    println("Оценки за экзамены: $perv, $vtor, $tri")
    println("Подготовка к экзаменам: $gotovils1, $gotovils2, $gotovils3")
}
