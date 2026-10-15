package org.example

fun main() {


//    Task 1
//    Найдите сумму всех целых нечетных чисел в промежутке от 1 до 100.
    println("===================================")
    var sumNum = 0
    for (ns in 1 until 100 step 2) {
        sumNum += ns
    }
    println("Answer: $sumNum")


//    Task 2
//    Напишите код, который выведет первые N степеней двойки.
    println("===================================")
    val n = 2
    for (fnt in 0 until n) {
        println("Answer: ${1L shl fnt}")
    }


//    Task 3
//    Даны три строки:
//    val str1 = "123"
//    val str2 = "456"
//    val str3 = "789"
//    Сложите значения этих строк как целые числа.
    println("===================================")
    val str1 = "123"
    val str2 = "456"
    val str3 = "789"
    println("Answer: ${str1.toInt() + str2.toInt() + str3.toInt()}")


//    Task 4
//    Дано некоторое число:
//    12345
//    Переверните его:
//    54321
    println("===================================")
    val num = 12345
    println("Answer: ${num.toString().reversed().toInt()}")


//    Task 5
//    Дано некоторое число:
//    12345
//    Найдите сумму цифр этого числа.
    println("===================================")
    var num1 = 12345
    var sum = 0
    while (num1 > 0) {

        val digit = num1 % 10
        sum += digit
        num1 /= 10
    }
    println("Answer: $sum")


//    Task 6
//    Дано дробное число, содержащее количество гигабайт:
//    val gb = 35.24
//    Переведите это значение в мегабайты, килобайты и байты.
    println("===================================")
    val gb = 35.24
    val mb = gb * MB_KB_BATES
    val kb = mb * MB_KB_BATES
    val bytes = kb * MB_KB_BATES
    println("Answer: \nmb:${mb.toLong()}\nkb:${kb.toLong()}\nbytes:${bytes.toLong()}")


//    Task 7
//    Явно укажите тип переменной в следующем коде:
//    val xxx = true
    println("===================================")
    @Suppress("RedundantExplicitType")
    val xxx: Boolean = true
    println("Answer: ${xxx.javaClass.simpleName}")
}

const val MB_KB_BATES = 1024