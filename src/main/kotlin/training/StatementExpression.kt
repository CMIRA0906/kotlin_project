package training

fun main() {
  //  demoIf()
   // val output = demoWhen()
   // println(output)
    //forDemo()
    demoWhenChallenge()

}

private fun demoIf(){

    val bigger = 1000
    val smaller = 1
    // won't compile
    // val max = bigger >smaller ? bigger: smaller
    val max = if(bigger>smaller) bigger else smaller

    println("Output value $max.")
}

//Demo in Kotlin is like a switch in java
private fun demoWhen() : String{

    val inValue = 100
     val output = when(inValue){
         in 500..1000 ->"That's perfect number"
         in 200..499 ->"That's a good number"
         else -> "That's a terrible number"
     }
    return output

}

private fun forDemo(){

    //for
    for (i in 1..10){
        println(i)
    }
    //Other for
    val students = listOf("Cristian", "Camilo", "Yesenia","Carlos")
    for (student in students){
        println("Current studen is $student")
    }

    for ((index, student) in students.withIndex()){
        println("Student #${index+1} is $student")
    }

}

private fun demoWhenChallenge(){

    val cardPoints =7_000

    val cardLevel :String = when(cardPoints){
        in 0..999->"pearl"
        in 1000..4999 ->"silver"
        in 5_000..9_999 -> "gold"
        else ->"platinum"
    }

    val plural = if (cardPoints >1 || cardPoints ==0) "s" else ""

    println("You have $cardPoints point$plural and are at the $cardLevel level.")



}

