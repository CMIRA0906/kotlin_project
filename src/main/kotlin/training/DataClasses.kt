package training

data class Teen(val firstName : String, val lastName: String, val grade: Int ){}

fun main() {

    val teens = mutableListOf<Teen>(
        Teen("Cristian","Mira",25),
        Teen("Camilo","Perez",11),
        Teen("Andres","Caldas",10)
    )

    println()
    println(teens[0])
    println("Does ${teens[0]}==${teens[1]} : ${teens[0]==teens[1]}")

    val charlie =  teens[0].copy(firstName = "Charlie")
    teens.add(charlie)
    println()
    for (teen in teens){
        println(teen)
    }

}
