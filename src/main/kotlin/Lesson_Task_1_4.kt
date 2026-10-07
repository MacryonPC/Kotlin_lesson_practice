package org.example

fun main() {


//    Task 1
//    Выведите в консоль все четные числа из промежутка от 1 до 100.
    println("===================================")
    for (iv in 1..100) {
        if (iv % 2 == 0) {
            println("Answer: $iv")
        }

    }


//    Task 2
//    Дана некоторая строка:
//    val str = "abcde"
//    Переберите и выведите в консоль по очереди все символы с конца строки.
    println("===================================")
    val str = "abcde"
    for (istr in str.reversed()) {
        println(istr)
    }
    str.reversed().forEach { println(it) }


//    Task 3
//    Дано целое число, содержащее номер минуты от 0 до 60:
//    val num = 30
//    Определите, в какую четверть часа попадает это значение.
    println("===================================")
    val num = 30
    val result = when (num) {
        in 0..15 ->  "1 четверть"
        in 16..30 -> "2 четверть"
        in 31..45 -> "3 четверть"
        in 46..60 -> "4 четверть"
        else -> "unknown"
    }
    println("Answer: $result")


//     Task 4
//     Явно укажите тип переменной в следующем коде:
//     val xxx = 12.0
    println("===================================")
    val xxx: Double = 12.0
    println("Answer: ${xxx::class.simpleName} \nresult: $xxx")
}