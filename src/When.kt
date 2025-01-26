fun main(){
    //Using When to check for multiple cases on single variable
    println("Enter you age:")
    val age = readLine()?.toInt()

    when(age){
        in 1..10 -> println("Hey, You're a child")
        in 11..18 -> println("Hey, you're a teenager")
        18 -> println("Congrats, You're finally 18")
        19,20 -> println("Hey, You're a young adult")
        in 20..30 -> println("Hey, You're an adult person")
        else -> println("You're really Old!")
    }
    // when expression is useful when conditions are based on single variable
    // In case of multiple conditions going with if-else would be more optimal


}