fun main(){
    println(operation(2,5))
    println(operation2(2,5))
    print(greetings("Good Evening"))
}

fun operation(a: Int, b: Int): Int {
    return a+b
}
fun operation2(a: Int, b: Int) : Int = a+b
fun greetings(greet: String=""): String = "Hello, $greet"


