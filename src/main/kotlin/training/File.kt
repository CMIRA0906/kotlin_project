package training

import java.io.File

fun main() {
    val resources ="./src/main/resources"
    val pets = "pets.txt"
    val pFile = File("$resources/$pets")

    val file = File("${resources}/text.txt")
    file.forEachLine { println(it) }

    val writeFile = File("${resources}/write.txt")
    writeFile.writeText("Kotlin = happiness")

    val pList = listOf("cat", "dog", "bird")
    pFile.writeText("")
    pList.forEach { pFile.appendText("$it\n") }

    val newPets = mutableListOf<String>()
    pFile.forEachLine { newPets.add(it) }
    println()
    println(newPets)

    val exists = pFile.exists()
    println("\n pet exits? $exists")



}