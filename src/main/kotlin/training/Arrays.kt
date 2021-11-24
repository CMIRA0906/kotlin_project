package training

data class Student(val firtsNameval : String, val grade: Int )

fun main() {

    val things = arrayOf(1,2,3,"one","two","three")
    for (thig in things){
        println(thig)
    }

    val students =  arrayOf<Student>(Student("Cristian",11),
    Student("Camilo",12),
        Student("David",14))
    students[0]=Student("New",15)
    for (student in students){
        println(student)
    }

    val fives = Array(5,::fiver)
    fives.forEach { println(it) }
    println("Fives has ${fives.size} elements")
    println("Indices = ${fives.indices}")
    println("LastIndex ${fives.lastIndex}")


}
fun fiver(index : Int) : Int{
    return index * 5
}