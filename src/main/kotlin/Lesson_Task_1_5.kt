package org.example

fun main() {


//    Task 1
//    Выведите в консоль все числа кратные трем в промежутке от 1 до 100.
    println("===================================")
    for (nt in 1..100) {
        if (nt % 3 == 0) println("Answer: $nt")
    }


//    Task 2
//    Даны два целых числа. Проверьте, что первое число без остатка делится на второе.
    println("===================================")
    val num1 = 25
    val num2 = 58
    val result1 = num1 % num2 == 0
    if (result1) println("Answer: делится!") else println("Answer:Не делится!")
    println("Answer: $result1")


//    Task 3
//    Даны три символа:
//    val char1 = 'A'
//    val char2 = 'B'
//    val char3 = 'C'
//    Объедините символы в одну строку.
    println("==================================")
    val char1 = 'A'
    val char2 = 'B'
    val char3 = 'C'
//  1) Option
    println("Answer: ${char1.toString() + char2.toString() + char3.toString()} 1 option")
// 2) Option
    println("Answer: $char1$char2$char3 2 option")


//    Task 4
//    Дано целое число, содержащее количество килобайт:
//    int kb = 35
//    Переведите это значение в байты.
    println("==================================")
    @Suppress("RedundantExplicitType")
    val kb: Int = 35
    val bytes = kb * 1024
    println("Answer: $bytes")


//    Task 5
//    Явно укажите тип переменной в следующем коде:
//    val xxx = "hello, world!"
    println("==================================")
    @Suppress("RedundantExplicitType")
    val xxx:String = "hello world"
    println("Answer: ${xxx.javaClass.simpleName}")
}