fun main() {
    val nasel = 10000000
    val smert = 8
    val rojd = 14

    val a = if (rojd < 7) 7 else rojd
    val b = if (smert < 6) 6 else smert

    val result = nasel + (nasel * a * 0.001 - nasel * b * 0.001 - 1)

    println("Численность через 10 лет: " + "$result")
}