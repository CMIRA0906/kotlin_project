package training

fun main() {
    val map1 = mapOf(1 to "alpha", 2 to "beta", 3 to "gamma", 4 to "delta")
    val map2 = mapOf( 4 to "delta", 3 to "gamma", 2 to "beta",1 to "alpha")
    println("map1==map2 ? ${map1==map2}")
    println("map1[2] = ${map1[2]}")
    println("map1[5] = ${map1.getOrDefault(5,"No present")}")

    println()
    val cars = mutableMapOf(
        "ford" to 1903,
        "gm" to 1908,
        "dodge" to 1913,
        "tucker" to 1944)
    cars["tesla"] = 2003
    println("Removed tucker = ${cars.remove("tucker")}")
    for (key in cars.keys){
        println(key)
    }

    println("Does it have a ford? ${"ford" in cars}")
    println("Has a 1908 ${1908 in cars.values}")




}