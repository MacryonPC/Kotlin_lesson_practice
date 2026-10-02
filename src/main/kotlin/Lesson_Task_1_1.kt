package org.example


fun main() {


//    Task 1
//    Дано число. Проверьте, отрицательное оно или нет. Выведите об этом информацию в консоль.
    val num1 = -23
    if (num1 < 0) println("отрицательное число: $num1") else println("положительное число: $num1")


//    Task 2
//    Дана строка. Выведите в консоль длину этой строки.
    val str1 = "I have a gaming table and it's red color"
    println("Кол-во символов:${str1.length}")


//    Task 3
//    Дана строка. Выведите в консоль последний символ строки.
    val str2 = "My name is maksim"
    println("${str2.last()}")


//    Task 4
//    Дано число. Проверьте, четное оно или нет.
    val num2 = 33
    if (num2  % 2  == 0) println("четное число: $num2") else println("нечетное число: $num2")


//    Task 5
//    Даны два слова. Проверьте, что первые буквы этих слов совпадают.
    val str3 = "Car"
    val str4 = "card"
    println("${str3.startsWith(str4.first(), ignoreCase = true)}")

}