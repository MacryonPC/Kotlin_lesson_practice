package org.example

fun main() {


//    Task 1
//    Найдите сумму всех целых чисел от 1 до 100.
    println("===================================")
//    1 option
    val sumNumbers = 100
    val result1 = sumNumbers * (sumNumbers + 1) / 2
    println("Answer: $result1")
//    2 Option
    var sumNum = 0
    for (sm in 1..100) {
        sumNum += sm
    }
    println("Answer: $sumNum")


//    Task 2
//    Даны три символа:
//    val chr1: Char = '1'
//    val chr2: Char = '2'
//    val chr3: Char = '3'
//    Сложите значения этих символов как целые числа.
    println("===================================")
//    1 Option
    val chr1: Char = '1'
    val chr2: Char = '2'
    val chr3: Char = '3'
    println("Answer: ${chr1.digitToInt() + chr2.digitToInt() + chr3.digitToInt()}")
//    2 Option
    val chr11: Char = '1'
    val chr22: Char = '2'
    val chr33: Char = '3'
    val result = (chr11.digitToInt() + chr22.digitToInt() + chr33.digitToInt()).toString()
    println("Answer: $result")


//    Task 3
//    Дано целое число, содержащее количество мегабайт:
//    val mb = 35
//    Переведите это значение в байты.
    println("===================================")
//    1 Option
    val mb1 = 35
    val kb = mb1 * BYTES_IN_KILOBYTE
    val bytes1  =  kb * BYTES_IN_KILOBYTE
    println("Answer: $bytes1")
//    2 Option
    val mb2 = 35L
    val bytes2 = mb2 * BYTES_IN_KILOBYTE * BYTES_IN_KILOBYTE
    println("Answer: $bytes2")


//    Task 4
//    Явно укажите тип переменной в следующем коде:
//    val xxx = 'a'
    println("===================================")
    @Suppress("RedundantExplicitType")
    val xxx: Char = 'a'
    println("Answer: ${xxx.javaClass.simpleName}")
}
const val  BYTES_IN_KILOBYTE = 1024