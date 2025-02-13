fun main(){
    // this is an array of vararg ,and now you can pass it in function as well
    val varargArray = intArrayOf(20,25,30)
    val max = getMax(10,4,7,2, *varargArray, 8,13)
    println("The maximum number is $max")
    //It won't throw an error for second parameter
    //because it has the default value
    defaultTesting("Pallavi")
    //Passing second parameter as well
    defaultTesting("Jatin", "Sharma")
    // you can also pass these parameters by naming them
    // named parameters
    defaultTesting(firstname = "Kartik", lastName = "Dwivedi")
}

//Using 'vararg' parameter
//It means variable argument and all the type integer
fun getMax(vararg numbers: Int): Int {
    var max = numbers[0]
    for (number in numbers){
        if(number > max){
            max = number
        }
    }
    return max
}

// We can pass a default value of a parameter
fun defaultTesting (firstname: String, lastName: String = "Dwivedi"){
    println("Full name is $firstname $lastName.")
}
