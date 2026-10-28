package org.example



fun main() {


//     Task 1
//     Найдите среднее арифметическое всех целых чисел от 1 до 100.
    println("=================================")
    var sumFirst = 0
    for (first in 1..100) {
        sumFirst += first
    }
    val divide = sumFirst.toDouble() / 100
    println("Answer: $divide")


//    Task 2
//    Дано число:
//    val num = 12345
//    Найдите сумму первой и последней цифры этого числа.
    println("=================================")
//    1 Option
    val numFirst = 12345
    val convertingStr = numFirst.toString()
    val firstDigit = convertingStr.first().digitToInt()
    val secondDigit = convertingStr.last().digitToInt()
    val result = firstDigit + secondDigit
    println("Answer: $result")
//    2 Option
    val lastDigit = numFirst % 10
    var teratingNumber = numFirst
    while (teratingNumber >= 10) {
        teratingNumber /= 10
    }
    println("Answer: ${lastDigit + teratingNumber}")


//    Task 3
//    Дан массив с целыми числами:
//    val arr = arrayOf(1, 2, 3, 4, 5)
//    Найдите сумму элементов этого массива.
    println("=================================")
    val arr = arrayOf(1, 2, 3, 4, 5)
//    1 Option
    var sum = 0
    for (i in arr) {
        sum += i
    }
    println("Answer: $sum")
//    2 Option
    var sumPlus = 0
    arr.forEach { sumPlus += it }
    println("Answer: $sumPlus")
//    3 Option
    println("Answer: ${arr.sum()}")


    //    Task 4
    //    Дано некоторое целое число:
    //    val num = 12345
    //    Выведите в консоль все его цифры с конца.
    println("=================================")
        val num = 12345
        val convertingStr2 = num.toString()
    //    1 Option
        println("Answer: ${num.toString().reversed().toIntOrNull()}")
    //    2 Option
        print("Answer: ")
        for (reversed in   convertingStr2.lastIndex downTo 0 ) {
            print("${convertingStr2[reversed]}")

        }


//    Task 5
//    Явно укажите тип переменной в следующем коде:
//    val xxx = listOf(1, 2, 3, 4, 5)
    println("=================================")
    val xxx:List<Int> = listOf(1, 2, 3, 4, 5)
    println("Answer: ${xxx.javaClass.simpleName}")
}