package training

fun main() {
    val threes = setOf(3,3,3,3)
    println(threes)
    println("sice = ${threes.size}")
    println("has a 4? ${threes.contains(4)}")

    println()
    val fset = mutableSetOf(1,2,3,4,5)
    val bset = mutableSetOf(5,4,3,2,1)
    println("Firts equal? ${fset.first()==bset.first()}")
    println("fset ==bset? ${fset==bset}")

    // hasSet use less memory than set
    println()
    val fset2 = hashSetOf(1,2,3,4,5)
    val bset2 = hashSetOf(5,4,3,2,1)
    println("Firts equal? ${fset2.first()==bset2.first()}")
    println("fset2 ==bset2? ${fset2==bset2}")

    println()
    println("added 6? ${fset.add(6)}")
    println("removed 76? ${fset.remove(76)}")
    println()
    val aList = fset2.toList()
    println(aList)



}