package org.example

fun main() {


//    Task 1
//    Дан массив с числами:
//    val arr = arrayOf(1, 2, -3, 4, -5)
//    Найдите сумму положительных элементов этого массива.
    println("================================")
    val arr1 = arrayOf(1, 2, -3, 4, -5)
//    1 Option
    val transformationNumber = arr1.filter { it > 0 }
    println("Answer: ${transformationNumber.sum()}")
//    2 Option
    val result1 = arr1.sumOf { if (it > 0) it else 0 }
    println("Answer: $result1")
//    3 Option
    var sum1 = 0
    for (arr2 in arr1) {
        if (arr2 > 0) sum1 += arr2
    }
    println("Answer: $sum1")


//    Task 2
//    Дан массив с числами:
//    val arr = arrayOf(1, 2, 3, 4, 5)
//    Выведите в консоль элементы этого массива в обратном порядке.
    println("================================")
    val arr2 = arrayOf(1, 2, 3, 4, 5)
//    1 Option
    val reverseResult =
        arr2.reversedArray()//В Kotlin для создания нового массива в обратном порядке используется метод reversedArray()
    println("Answer:  ${reverseResult.joinToString()}")
//    2 Option
    print("Answer: ")
    for (i in arr2.lastIndex downTo 0) {
        print(" ${arr2[i]},")
    }


//    Task 3
//    Дан список:
//    val list = mutableListOf("a", "b", "c")
//    Вставьте строку "z" в начало списка (на позицию с индексом 0).
    println("================================")
    val list = mutableListOf("a", "b", "c")
//    1 Option
    list.addFirst("z")
    println(list)
    println(" ${list[0]}")
//    2 Option
    list.add(0, "z")
    println(list)
    println(" ${list[0]}")


//    Task 4
//    Дан массив:
//    val intArray = intArrayOf(1, 2, 3, 4, 5)
//    Преобразуйте массив в список.
    println("================================")
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    println("${intArray.javaClass.simpleName}")
//    1 Option
    val transformationList: List<Int> = intArray.toList()
    println("Answer: ${transformationList.joinToString()}")
    //.toList(): Создает абсолютно новый независимый неизменяемый список.
    // Под капотом Java выдаст ArrayList.
    // Если вы потом измените что-то в исходном intArray, этот список не изменится.
    println("How this tip: ${transformationList.javaClass.simpleName}")
//    2 Option
    val viewList: List<Int> = intArray.asList()
    println("Answer: ${viewList.joinToString()}")
    //asList(): Это очень хитрый метод!
    // Он не создает новый список в памяти, а просто делает «оболочку» (view) над вашим массивом.
    // Под капотом Java выдаст класс вроде Arrays$ArrayList.
    // Если вы измените элемент в исходном intArray, он автоматически изменится и внутри viewList!
    println("How this tip: ${viewList.javaClass.simpleName}")
//    3 Option
    val mutableList: MutableList<Int> = intArray.toMutableList()
    mutableList.add(6)
    //toMutableList():
    // Создает новый изменяемый список (ArrayList),
    // в который вы сможете спокойно добавлять новые элементы через .add().
    println("Answer: ${mutableList.joinToString()}")
    println("How this tip: ${mutableList.javaClass.simpleName}")


//    Task 5
//    Дан следующий список:
//    val lst = mutableListOf(1, 2, 3, 4, 5)
//    Дан следующий массив:
//    val arr = arrayOf(6, 7, 8)
//    Добавьте все элементы массива в конец нашего списка.
    println("================================")
    val lst = mutableListOf(1, 2, 3, 4, 5)
    val arr3 = arrayOf(6, 7, 8)
//  1 Option
    lst.addAll(arr3)
    println(lst.joinToString())
//    2 Option
    lst += arr3
    println(lst.joinToString())


//    Task 6
//    Дан список со строками, содержащими целые числа:
//    val lst: List<String> = listOf("123", "456", "789")
//    Преобразуйте этот список так, чтобы значениями нового списка стали целые числа:
//    [123, 456, 789]
    println("================================")
    val lst2:List<String> =  listOf("123", "4.5", "456", "789")
    val  intList = lst2.mapNotNull{it.toIntOrNull()}
    println(intList.joinToString())


//    Task 7
//    Явно укажите тип переменной в следующем коде:
//    val xxx = mutableSetOf(true, false)
    println("================================")
    val xxx:MutableSet<Boolean> = mutableSetOf(true, false)
    println("Answer: ${xxx.javaClass.simpleName}")
}