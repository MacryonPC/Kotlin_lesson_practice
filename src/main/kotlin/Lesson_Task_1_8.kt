package org.example


fun main() {


//    Task 1
//    Выведите в консоль все целые числа от 100 до 1.
    println("===================================")
    for (numD in 100 downTo 1) {
        println("Answer: $numD")
    }


//    Task 2
//    Дана некоторая строка:
//    "abcde"
//    Переберите и выведите в консоль по очереди все символы с конца строки
    println("===================================")
    val str1 = "abcde"
//    1 Option
    str1.reversed().forEach { println("Answer: $it") }
//    2 Option
    println("=================================")
    for (text in str1.reversed()) {
        println("Answer: $text")
    }
//    3 Option
    println("=================================")
    for (textFirst in str1.lastIndex downTo 0) {
        println("Answer: ${str1[textFirst]}")
    }


//    Task 3
//    Дано целое число, содержащее количество байт:
//    val b: ULong = 3535645778u
//    Переведите это значение в гигабайты, мегабайты и килобайты.
    println("=================================")
    val b: ULong = 3535645778u
    val kb = b / GB_MB_KB
    val mb = kb / GB_MB_KB
    val gb = mb / GB_MB_KB
    println("Answer: bytes: $b\nGB: $gb\nMB: $mb\nKB: $kb")


//    Task 4
//    Явно укажите тип переменной в следующем коде:
//    val xxx = 100L
    println("=================================")
    @Suppress("RedundantExplicitType")
    val xxx: Long = 100L
    println("Answer: ${xxx.javaClass.simpleName}")
}

const val GB_MB_KB: ULong = 1024u
