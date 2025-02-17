package Basics

fun main(){
    val value: Int = if(false){
        println("inside true")
        10
    }else{
        println("inside false")
        20
    }
    println(value)
}