fun main(){
    println("Enter some input:")
    //taking user input using readLine() function
    // readLine() function returns a string which can be null as well
    val userInput = readLine()
    // To use any methood on userInput make sure to use ? to check if value is present or not
    println(userInput?.toUpperCase())
    println("User input is ${userInput}")
    // to convert string into int
    println(userInput?.toInt()?.plus(5))
}