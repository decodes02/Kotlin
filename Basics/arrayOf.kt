package Basics

fun main(){
    val names = arrayOf("Deepak", "Rohit", "Kumar")
    for(name in names) println(name)
    println()
    names.forEach{
        println(it)
    }

    val a1 = arrayOf("a")
    val a2 = arrayOf("a")
    val y = a1.contentEquals(a2) // => true
    print(y)
}