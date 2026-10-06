//import com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length

fun main() {


//    Task 1
//    Выведите в консоль все целые числа от 1 до 100.
    for (ix in 1..100) {
        println("Answer:$ix")
    }


//    Task 2
//    Дана строка. Если в этой строке более одного символа, выведите в консоль предпоследний символ этой строки.
    println("===================================")
    val str1 = "I like play in soccer and tennis"
    if (str1.length > 1) println("Answer:${str1[str1.length - 2]}")


//    Task 3
//    Даны два целых числа. Найдите остаток от деления первого числа на второе.
    println("===================================")
    val num1 = 75
    val num2 = 48
    println("Answer:${num1 % num2}")


//    Task 4
//    Дано целое число, содержащее номер месяца от 1 до 12:
//    val num = 1
//    Определите, в какую пору года попадает этот месяц.
    println("===================================")
    val num3 = 1
    val result = when (num3) {
        1, 12, 2 -> "Winter"
        in 3..5 -> "Spring"
        in 6..8 -> "Summer"
        in 9..11 -> "Autumn"
        else -> "Unknown"
    }
    println("Answer:${result}")


//    Task 5
//    Явно укажите тип переменной в следующем коде:
    println("===================================")
    val xxx: Double = 12.5
    println("Answer:${xxx::class.simpleName}")
}