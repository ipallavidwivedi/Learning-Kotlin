//learning about strings
fun main(){
   var str: String = "I am a girl"
    //Basic string functions
   println("${str.toLowerCase()}")
   println("${str.toUpperCase()}")
    println("${str.subSequence(2,6)}")
    println("${str.equals("Pallavi")}")

    val x = 9
    val y = 3
    val z = 9
    val bool = true
    println(x == y) //comparing values of two variables
    println(!(x != z) && bool || z > (x + y) && (!bool || y < z))


}