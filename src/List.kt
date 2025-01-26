fun main(){
    var array = arrayOf(1,2,3,4,5)
    var list = listOf(1,2,3,4,5)
    //values of list are immutable

    //But we can make it mutable using another function
    val mutableList = mutableListOf(1,2,3)
    //now this is a mutable list, mean we can change its value
    mutableList[1] = 10

    //Some list function
    mutableList.add(2)
    mutableList.addFirst(18)

    //Solving a problem
    // get user input of 5 numbers and then print them in reverse order
    val userList = mutableListOf<Int>()
    println("Enter 5 numbers:")
    for (i in 1..5){
        val userInput = readLine()?.toInt()
        if(userInput != null){
            userList.add(userInput)
        }
    }
    //printing list in reverse order
    for(j in 4 downTo 0){
        println(userList[j])
    }

}