package org.example

import  kotlin.math.sqrt

fun main() {


//    Task 1
//    Дан массив с числами:
//    val arr = arrayOf(1, 2, 3, 4, 5)
//    Найдите сумму квадратных корней элементов этого массива.
    println("================================")
    val arr1 = arrayOf(1, 2, 3, 4, 5)
//    1 Option
    val result = arr1.map { sqrt(it.toDouble()) }
    println("Answer: ${result.sum()}")
    println()
//    2 Option
    var sum1 = 0.0
    for (arr2 in arr1) {
        val result2 = sqrt(arr2.toDouble())
        sum1 += result2
    }
    println("Answer: $sum1")
    println()
//    3 Option
    val result3 = arr1.sumOf { sqrt(it.toDouble()) }
    println("Answer: $result3")


//    Task 2
//    Дан массив с числами:
//    val arr = arrayOf(1, 2, 3, 4)
//    Увеличьте каждый элемент этого массива в два раза:
//    [2, 4, 6, 8]
    println("================================")
    val arr3 = arrayOf(1, 2, 3, 4)
//    1 Option
    val result4 = arr3.map { it * 2 }.toTypedArray()
    println("Answer: ${result4.joinToString(", ")}")
    println()
//    2 Option
    for (arr4 in arr3.indices) {
        arr3[arr4] = arr3[arr4] * 2
    }
    println("Answer: ${arr3.joinToString(", ")}")


//    Task 3
//    Дан массив:
//    val arr: Array<Int?> = arrayOfNulls<Int>(10)
//    С помощью цикла заполните этот массив целыми числами от 10 до 1.
    println("================================")
    val arr5: Array<Int?> = arrayOfNulls(10)
//    var index = 0
//    for ( i in arr5.size downTo 1 ){
//        arr5[index] = i
//        index++
//    }
    for ((index, i) in (arr5.size downTo 1).withIndex()) {
        arr5[index] = i
    }
    println("Answer: ${arr5.joinToString()}")


//    Task 4
//    Дан следующий список:
//    val lst = mutableListOf(1, 2, 3, 4, 5)
//    Удалите из этого списка элемент со значением 3.
    println("================================")
    val lst = mutableListOf(1, 2, 3, 4, 5)
//    1 Option
    lst.remove(3)
    println("Answer: ${lst.joinToString()}")
    println()
//    2 Option
    lst.removeAt(2)
    println("Answer: ${lst.joinToString()}")
    println()
//    3 Option
    lst -= 3
    println("Answer: ${lst.joinToString()}")


    //    Task 5
    //    Явно укажите тип переменной в следующем коде:
    //    val xxx = setOf(1.1, 2.2, 3.3)
    println("================================")
    val xxx: Set<Double> = setOf(1.1, 2.2, 3.3)
    println("Answer: ${xxx.javaClass.simpleName}")
}