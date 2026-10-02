package org.example
import kotlin.math.absoluteValue

fun main() {


    //    Task 1
    //    Дано целое число. Выведите в консоль первую цифру этого числа
    val num1 = -78
    println("Answer:${num1.absoluteValue.toString().first()}")


    //    Task 2
    //    Дано целое число. Выведите в консоль последнюю цифру этого числа.
    val num2 = 42
    println("Answer:${num2.absoluteValue.toString().last()}")


    //    Task 3
    //    Дано целое число. Выведите в консоль сумму первой и последней цифры этого числа.
    val num3 = 84
    println("Answer: ${num3.absoluteValue.toString().first().digitToInt() + num3.absoluteValue.toString().last().digitToInt()}")


    //    Task 4
    //    Дано целое число. Выведите количество цифр в этом числе.
    val num4 = 46
    println("Answer: ${num4.absoluteValue.toString().length}")


    //    Task 5
    //    Даны два целых числа. Проверьте, что первые цифры этих чисел совпадают.
    val num5 = 96
    val num6 = 92
    println("Answer:${num5.absoluteValue.toString().first() == num6.absoluteValue.toString().first()}")


    //    Task 6
    //    Явно укажите тип переменной в следующем коде:
    val xxx: Byte = 12
}