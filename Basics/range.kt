package Basics

fun main(){
    for (i in 0..3) print(i)
    println()
    for(i in 2..8 step 2) print(i)
    println()
    for(i in 5 downTo 0 step 2) print(i)
    println()

    val x=5
    if(x in 1..5) print("x is in range from 1 to 5 ")
    println()
}
