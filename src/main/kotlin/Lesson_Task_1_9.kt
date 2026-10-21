package org.example

fun main() {


//    Task 1
//    Даны два слова. Проверьте, что последняя буква первого слова совпадает с первой буквой второго слова.
    println("=================================")
    val wordStr1 = "Maks"
    val wordStr2 = "Spack"
//    1 Option
    if (wordStr1[wordStr1.lastIndex].lowercaseChar() == wordStr2[0].lowercaseChar()) println("Answer: совпадают последня буква в первом слове с первой буквой второго слова") else println(
        "Answer:Нет совпадения"
    )
//    2 Option
    val firstLetter = wordStr1[wordStr1.lastIndex].lowercase()
    if (wordStr2.lowercase().startsWith(firstLetter)) println("Answer: совпадают последня буква в первом слове с первой буквой второго слова") else println(false)
//    3 Option
    if (wordStr1.lastOrNull()?.lowercaseChar() == wordStr2.firstOrNull()?.lowercaseChar()) println("Answer: совпадают последня буква в первом слове с первой буквой второго слова") else println(
        false
    )


//    Task 2
//    Напишите программу, которая узнает, сколько секунд содержится в сутках.
    println("=================================")
//    1 Option
    val secondsInDays = SECONDS * 60 *  24
    println("Answer: $secondsInDays")
//    2 Option
    val result = secondsInDays(SECONDS,60, 24)
    println("Answer:$result")


//    Task 3
//    Выведите в консоль все целые числа от -100 до 0.
    println("=================================")
    for (un in -100 .. 0){
        println("Answer: $un")
    }


//    Task 4
//    Даны три символа:
//    val chr1: Char = '1'
//    val chr2: Char = '2'
//    val chr3: Char = '3'
//    Объедините эти символы в число:
//    123
    println("=================================")
    @Suppress("RedundantExplicitType")
    val chr1: Char = '1'
    @Suppress("RedundantExplicitType")
    val chr2: Char = '2'
    @Suppress("RedundantExplicitType")
    val chr3: Char = '3'
//  1 Option
    println("Answer: ${chr1.digitToInt().javaClass.simpleName}${chr2.digitToInt().javaClass.simpleName}${chr3.digitToInt().javaClass.simpleName}")
//  2 Option
    val result2 = chr1.digitToInt() * 100 + chr2.digitToInt() * 10 + chr3.digitToInt()
    println("Answer: $result2")


//    Task 5
//    Явно укажите тип переменной в следующем коде:
    @Suppress("RedundantExplicitType")
    val xxx: Float = 3.14f
    println("Answer: ${xxx.javaClass.simpleName}")
}

fun secondsInDays(seconds: Int, minutesHour:Int, hoursDay:Int): Int{
    return seconds * minutesHour * hoursDay
}

const val SECONDS = 60