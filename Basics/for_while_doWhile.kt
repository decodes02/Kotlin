package Basics

fun main() {
    for (i in 0..3) print(i)
    print(" ")
    for (i in 2..8 step 2) print(i)
    print(" ")
    for (i in 3 downTo 0) print(i)
    println()

    //for
    val names = arrayOf("Deepak", "Rohit", "Kumar")
    for (name in names) println(name)
    println()
    for((i,v) in names.withIndex()){
        print(names[i] + " ")
    }
    println()
    names.forEach {
        println(it)
    }

    //while
    var i = 0
    val cakes = listOf("carrot", "cheese", "chocolate")
    while(i<cakes.size){
        print(cakes[i]+" ")
        i++
    }
    println()


    //doWhile, while
    fun bakeACake() = println("Bake a cake")
    fun eatACake() = println("Eat a cake")
    var cakesBaked=0
    var cakesEaten=0
    do{
        bakeACake()
        cakesBaked++
    }while(cakesBaked<5)
    println("cakesBaked = $cakesBaked")
    while(cakesBaked>0){
        eatACake()
        cakesEaten++
        cakesBaked--
    }


}