package training

import java.util.*

fun main() {
    println("Enter text: ")
    val txt = readLine() ?: ""
    println("You entered: $txt, length 0 ${txt.length}")

    println("\nEnter an Integer value: ")
    val string1 = readLine() ?: ""
    val iValue : Int = string1.toIntOrNull() ?: 0
    println("You entered: $iValue")

    println("\nEnter an double value: ")
    val string2 = readLine() ?: ""
    val dValue : Double = string2.toDoubleOrNull() ?: 0.0
    println("You entered: $dValue")

    scanner()

}

fun scanner(){
    println()

    val scan = Scanner(System.`in`)
    print("Enter an integer number: ")
    val num1 = scan.nextInt()

    print("Enter an double number: ")
    val num2 = scan.nextDouble()

    println()
    println("First input number = $num1")
    println("Second input number = $num2")
}