package org.example


import kotlin.collections.joinToString

fun main() {


//    Task 1
//    Дан следующий список:
//    val lst = listOf(1, 2, 3, 4, 5)
//    Найдите сумму квадратов элементов этого массива.
    println("=================================")
    val lst1 = listOf(1, 2, 3, 4, 5)
//    1 Option
    val visionsSquare1 = lst1.map { it * it }
    println("Answer: ${visionsSquare1.sum()}")
    println()
//    2 Option
    val visionsSquare2 = lst1.sumOf { it * it }
    println("Answer: $visionsSquare2")
    println()
//    3 Option
    var sum = 0
    for (lst2 in lst1) {
        val result = lst2 * lst2
        sum += result
    }
    println(
        "Answer: $sum"
    )


//    Task 2
//    Дан массив с целыми числами:
//    val arr = arrayOf(1, 2, 3, 4, 5)
//    Найдите среднее арифметическое этого массива.
    println("================================")
    val arr = arrayOf(1, 2, 3, 4, 5)
//    1 Option
    var sum2 = 0
    for (arr2 in arr) {
        sum2 += arr2
    }
    println("Answer: ${sum2 / arr.size.toDouble()}")
    println()
//    2 Option
    val addition = arr.sum()
    val resultDivisions = addition / arr.size.toDouble()
    println("Answer: $resultDivisions")
    println()
//    3 Option
    println("Answer: ${arr.average()}")


//    Task 3
//    Дан следующий список:
//    val lst = mutableListOf(1, 2, 3, 4, 5)
//    Добавьте в него еще один элемент со значением 6.
    println("================================")
    val lst = mutableListOf(1,2,3,4,5)
//    1 Option classic
    lst.add(6)
//    2 Option new
    lst += 7
    println("Answer: ${lst.joinToString(", ")}")


//    Task 4
//    Явно укажите тип переменной в следующем коде:
//    val xxx = mutableListOf("a", "b", "c")
    println("================================")
    val xxx: MutableList<String> = mutableListOf("a", "b", "c")
    println("Answer: ${xxx.javaClass.simpleName}")

}

