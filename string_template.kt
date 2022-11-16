fun main(){
    var a = 1
    var string =  " a is $a"
    println("the value of a is $a")
    a = 2
    val s2 = "a ${string.replace("is","was")} but now a is $a"
    println(s2)
    fun maxOf(a: Int, b: Int) = if (a > b) a else b
    println("the max is ${maxOf(3,8)}")
}