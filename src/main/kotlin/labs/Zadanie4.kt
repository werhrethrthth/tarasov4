fun main() {
    print("Введите сумму вклада=")
    val depos = readLine()!!.toDouble()

    print("Введите количество месяцев=")
    val mesyas = readLine()!!.toInt()

    var sum = depos
    var month = 1
    while (month <= mesyas) {
        val interest = sum * 0.07
        sum += interest
        month++
    }
    println("Итоговая сумма через $mesyas месяцев =$sum")
}


