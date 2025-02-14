fun main(){
    val names = listOf("Deepak", "Kumar", "Rohit")
    println(names[0])
    //========================
    for(name in names)
        print(name+" ")
    println()
    //========================
    names.forEach{
        print(it+" ")
    }
    println()
    //=========================
    val a1 = listOf("a")
    val a2 = listOf("a")
    val y = a1==a2
    println(y)
    val z = a1.equals(a2)
    println(z)

    val num = listOf(1, 2, 3, "hello")

}