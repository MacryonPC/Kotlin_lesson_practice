package org.example

import kotlin.collections.joinToString

fun main() {


//    Task 1
//    Дан массив с числами:
//    val arr = arrayOf(-1, 2, -3, 4, 5, 11)
//    Найдите сумму тех элементов этого массива, которые больше нуля и меньше десяти.
    println("================================")
    val arr = arrayOf(-1, 2, -3, 4, 5, 11)
//    1 Option
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    val result1Sum = arr.filter { it > 0 && it < 10 }
    println("Answer: ${result1Sum.sum()}")
//  2 Option
    val result2Sum = arr.sumOf { if (it > 0 && it in 1..10) it else 0 }
    println("Answer: $result2Sum")
//    3 Option
    var sum1 = 0
    for (arr2 in arr) {
        if (arr2 > 0 && arr2 in 1..10) sum1 += arr2
    }
    println("Answer: $sum1")


//    Task 2
//    Дан массив с целыми числами:
//    val arr = arrayOf(1, 2, 3, 4, 5)
//    Выведите в консоль элементы этого массива, которые являются четными числами.
    println("================================")
    val arr2 = arrayOf(1, 2, 3, 4, 5)
//    1 Option
    print("Answer: ")
    for (arr3 in arr2) {
        if (arr3 % 2 == 0) print("$arr3,")
    }
    println()
//    2 Option
    val result2 = arr2.filter { it % 2 == 0 }
    println("Answer: ${result2.joinToString(separator = ",")}")
//    3 Option
    print("Answer: ")
    arr2.forEach { if (it % 2 == 0) print("$it,") }
    println()


//    Task 3
//    Дан массив с целыми числами:
//    val arr = arrayOf(1, 2, 3, 0, 4, 5)
//    Выведите в консоль элементы этого массива до первого нуля.
    println("================================")
    val arr3 = arrayOf(1, 2, 3, 0, 4, 5)
//    1 Option
    val result4 = arr3.takeWhile { it != 0 }
    println("Answer: ${result4.joinToString(separator = ", ")}")
//    2 Option
    print("Answer: ")
    for (element in arr3) {
        if (element == 0) break else print(" $element")
    }
    println()


//    Task 4
//    Дан список:
//    val list = mutableListOf(10, 20, 30, 40, 50)
//    Удалите элемент с индексом 2.
    println("================================")
    val list = mutableListOf(10, 20, 30, 40, 50)
//    1 Option
    list.removeAt(2)
    println("Answer: ${list.joinToString(separator = ", ")}")
//    2 Option
    val list3 = mutableListOf(10, 20, 30, 40, 50)
    val index = 2
    if (index in list3.indices ) {
        list3.removeAt(index)
        println("Answer: ${list3.joinToString(separator = ", ")}")
    }


//    Task 5
//    Дан список:
//    val list = mutableListOf(1, 2, 3, 4)
//    Замените элемент с индексом 1 на значение 99.
    println("================================")
    val list2 = mutableListOf(1, 2, 3, 4)
//    1 Option
//    list2.set(1, 99)
//    println("Answer: ${list2.joinToString(separator = ", ")}")
//    2 Option
    list2[1] = 99
    println("Answer: ${list2.joinToString(separator = ", ")}")


//    Task 6
//    Явно укажите тип переменной в следующем коде:
//    val xxx = arrayOf('x', 'y', 'z')
    println("================================")
    val xxx: Array<Char> = arrayOf('x', 'y', 'z')
    println("Answer: ${xxx.javaClass.simpleName}")
}