package training

fun main() {
    val names= listOf("Cristian","Camilo","Eliecer")
    println("The firts name is ${names.get(0)}")
    println("The firts name is ${names[0]}")

    var subNames = names.subList(1,3)
    println(subNames)

    var items = mutableListOf(2,4,6,8,10,10,10,10,14)
    items[0]=1

    items.add(12)
    items.removeAt(3)
    items.remove(99)
    println(items)
    println("There are ${items.size} items")
    println("The firts items is ${items.first()} ")
}