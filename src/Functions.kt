fun sum(x: Int, y: Int){
    val result = x+y
    println("$x + $y = $result")
}

fun power(base: Int, exponent: Int): Int{
    var result = 1
    for (i in 1..exponent){
        result *= base
    }
    return result
}

//One line function
fun multiply(a: Int, b: Int) = a * b

// to pass a list as an argument
fun printList(list: List<Int>){
    for (i in list.indices) {
        println(list[i])
    }
}

fun main(){
    sum(4,5)
    val result1 = power(2,3)
    val result2 = power(9,4)
    println("2 to the power 3 is $result1")
    println("9 to the power 4 is $result2")
    println("4 * 5 = " + multiply(4,5))
    val list = listOf(1,2,3,4,5)
    printList(list)
}