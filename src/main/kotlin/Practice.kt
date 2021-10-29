val secondName : String ? = null
val age =30
var name = "Cristian"

fun sayHello(){
    println(getGreeting())
}

fun getGreeting() : String{
    return "Hello Kotlin"
}
fun main() {

    if (secondName != null)
    {
        println("Hello Kotlin $age")
        println("$name $secondName")
    }else{
        println("Hello someone else $secondName")
    }

    print(getGreeting())
    sayHello()


}