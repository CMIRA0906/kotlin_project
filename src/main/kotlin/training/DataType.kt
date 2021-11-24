package training

import java.nio.DoubleBuffer

fun main() {


    //demoChar()
    //demoInteger()
    demoString()


}

private fun demoInteger(){
    // Integer types
    var number : Int =0
    val otherNumber : Int = 43
    val otherNumberT =43

    val myLong : Long = 300000000L
    val myByte : Byte  = 127
    val myShort : Short = 32767

    //Float types

    val myDouble : Double = 98.6
    val myFloat : Float = 12.2F
    val alsoDouble = 101.5

    val asInt =alsoDouble.toInt()
    val asFloat =  myLong.toFloat()

    val maxInt = 2_147_483_648


}

private fun demoChar(){
    val letter: Char = 'A'
    val tab ='\t'
    val infinity ='\u221E'

    println("letter = $letter")
    println("Tabbed $tab over")
    println("Infinity = $infinity")
}

private fun demoString() {
    val greeting: String = "Hello there"
    val owe = 50
    val debit = "I owe Crstian \$$owe dollar"
    println(debit)

    val infinity = "The infinity symbol is \u221E"
    println(infinity)

    println("[$greeting] is ${greeting.length} characters long")

    var bad = greeting.get(2)
    val letter =greeting[1]

    val compare1 ="beta"
    val compare2 ="alpha"

    println("${compare1.compareTo(compare2)}")

    val sub = greeting.subSequence(6,9)
    println("Sub = $sub")

    for (single in greeting){
        print("$single")
    }

    val myString = """
        Kotlin is fun.
        Kotlin is pragmatic.
    """
    println(myString)



}