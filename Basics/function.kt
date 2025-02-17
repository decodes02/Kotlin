package Basics

fun main(){
    println(operation(2,5))
    println(operation2(2,5))
    println(greetings(name = "Deepak", greet = "Good Evening"))
    val output = operation3(a=4,b=6, operate = { a,b ->
        print("Squaring the first one and adding these two numbers ")
        val temp = a*a
        temp+b
    })
    println(output)
}

fun operation(a: Int, b: Int): Int {
    return a+b
}

fun operation2(a: Int, b: Int) : Int = a+b
fun greetings(greet: String="", name: String): String {
    return "Hello $name, $greet"
}

fun operation3(a: Int, operate: (Int, Int) -> Int, b: Int): Int{
    return operate(a,b)
}