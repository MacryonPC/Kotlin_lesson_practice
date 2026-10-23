package org.example

fun main() {


//    Task 1
//    Найдите сумму всех целых четных чисел в промежутке от 1 до 100.
    println("=================================")
    var sum = 0
    var sum2 = 0
//    1 Option
    for (num in 2..100 step 2) {
        sum += num
    }
    println("Answer: $sum")
    println()
//    2 Option
    for (first in 1..100) {
        if (first % 2 == 0) sum2 += first

    }
    println("Answer: $sum2")


//    Task 2
//    Напишите программу, которая узнает, сколько секунд содержится в году.
    println("=================================")
    val secondsInYear = SECONDS1 * 60 * 24 * 365
    println("Seconds: $secondsInYear с")


//    Task 3
//    Дано некоторое целое число:
//    val num = 12
//    Выведите в консоль все делители этого числа.
    println("=================================")
    val num2 = 12
    for (divisor in 1..num2) {
        if (num2 % divisor == 0) println("Answer: $divisor")
    }


//    Task 4
//    Дано некоторое число:
//    var num = 12345.0
//    Делите его на два столько раз, пока результат не будет меньше 10.
//    Сколько итераций для этого потребуется?
    println("=================================")
    var num3 = 12345.0
    var iterations = 0
    do {
        iterations++
        num3 /= 2
    } while (num3 >= 10)

    println("Answer: $iterations")


//    Task 5
//    Явно укажите тип переменной в следующем коде:
//    val xxx = 1_000_000
    println("=================================")
    @Suppress("RedundantExplicitType")
    val xxx:Int = 1000000
    println("Answer: ${xxx.javaClass.simpleName}")
}

const val SECONDS1 = 60