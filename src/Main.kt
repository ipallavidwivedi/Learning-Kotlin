//learning Data types and variable declaration
fun main() {
    //Syntax to declare a variable
    // var variableName: type = value
    var userName: String = "Pallavi"
    var userAge: Int = 22
    //println is used to print output in next line
    println("User name is $userName\n$userName's age is $userAge")

    //declaring a variable using val keyword
    //if a variavle is declared as val it can't be modified
    val gender: String = "Girl"

    println("$userName is a $gender")
}