package training

fun main() {
    val myList = listOf(1,2,3,4,5,5,6,7,7,8)
    val mySet = setOf(10,20,30,40,50)
    val myMap = mapOf(1 to 10, 2 to 20, 3 to 30)

    val otherList = myList.map { it * 2 }
    println("Transformed list = $otherList")

    val otherMap = myMap.map { Pair(it.key, it.value * 10) }.toMap()
    println("Transformed map = $otherMap")

    println()

    val filterList = myList.filter { it % 2 == 1 }
    println("Only odds = $filterList")

    val fSet = mySet.filter { it > 100 }
    println("Is fSet empty = ${fSet.isEmpty()}")

    println("Sorting descending set = ${mySet.sortedDescending()}")
    println()
    println("tlist last: ${otherList.last{it >2 }}")

    println()
    println("List to set = ${myList.toSet()}")
    println("Set to list = ${mySet.toList()}")

    val animals =
        listOf("apple", "biscuit", "apple", "cat","cat","cat",
        "dog", "elephant","fox", "goat","elephant")

    val setAnimals = animals.toSet()
    println(setAnimals)

}