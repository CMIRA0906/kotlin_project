package training

import com.thoughtworks.selenium.webdriven.commands.GetElementHeight
import sun.security.util.Length

fun main() {
    greeter("Cristian")
    bestGreet("Camilo")
    println("Volumen is ${volume(10,5)}")
    println("Volumen is ${volumeX(width = 7 ,height = 13)}")
}

fun greeter(name : String) : String{
    return "Hello $name"


}

fun bestGreet(name : String) = "Hello $name"

fun volume(length: Int, width: Int, height: Int = 10) =length * width * height
fun volumeX(length: Int = 10, width: Int, height: Int) =length * width * height
