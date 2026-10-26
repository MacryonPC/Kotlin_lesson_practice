package org.example



fun main() {


//    Task 1
//    Дан массив с целыми числами:
//    val arr = arrayOf(1, 2, 3, 4, 5)
//    Выведите в консоль элементы этого массива.
    println("=================================")
    val arr1 = arrayOf(1, 2, 3, 4, 5)
//    1 Option
    println("Answer: ${arr1.contentToString()}")
    println()
//    2 Option
    println("Answer: ${arr1.joinToString(", ")}")


//    Task 2
//    Дан массив со строками:
//    val arr = arrayOf("ab", "cd", "ef")
//    Выведите в консоль первые символы элементов этого массива.
    println("=================================")
    val arr2 = arrayOf("ab", "cd", "ef")
//    1 Option
    for (ix in arr2) {
        println("Answer: ${ix.first()}")
    }
    println()
//    2 Option
    arr2.forEach { println("Answer: ${it.first()}") }


//    Task 3
//    Дано некоторое целое число:
//    val num = 12345
//    Найдите сумму всех его четных цифр.
    println("=================================")
    val num = 12345
    var sum = 0
    val str = num.toString()
    for (iu in str) {
        val numb = iu.digitToInt()
        if (numb % 2 == 0) sum += numb

    }
    println()
    println("Answer: $sum")
    println()


//    Task 4
//    Дано некоторое целое число:
//    val num = 12
//    Найдите факториал этого числа.
    println("=================================")
    val num2 = 12
//    1 Option
    val resultFactorial = 1*2*3*4*5*6*7*8*9*10*11*12
    println("Answer: $resultFactorial")
// 2 Option
    var numFactorial = 1L
    for ( farther in 1 ..  num2 ){
        numFactorial *= farther
    }
    println("Answer: $numFactorial")
    println()


//    Task 5
//    Явно укажите тип переменной в следующем коде:
//    val xxx = listOf(1, 2, 3, 4, 5)
    println("=================================")
    val xxx:List<Int> = listOf(1, 2, 3, 4, 5)
    println("Answer: ${xxx.javaClass.simpleName}")
}