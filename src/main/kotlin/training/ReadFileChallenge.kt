package training

import java.io.File

fun main() {
    val resource = "./src/main/resources"
    val salesFile = File("$resource/sales.txt")

    val sales = mutableListOf<String>()

    salesFile.forEachLine {
        val dValue = it.toDoubleOrNull()
        if (dValue != null){
            sales.add(it)

        }
    }
    sales.forEach{println(it)}
}