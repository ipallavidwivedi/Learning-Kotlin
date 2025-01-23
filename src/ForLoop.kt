fun main(){
    println("Enter 5 numbers:")
    var newArray = Array<Int>(5){0}
    var i = 0;
    while (i < newArray.size){
        newArray[i] = readLine()!!.toInt()
        i++
    }
    var sum = 0
    for (j in 0..4){
        sum += newArray[j]
    }
    println("Sum of all the numbers: ${sum}")
}