fun main(){
    val newArray = arrayOf(1,6,0,5,2,0,0,2)
    // To print the size of array or the length
    println("Size of array is: "  + newArray.size)
    //While loop
    //traversing through array using while loop
    println("While Loop output")
    var i = 0;
    while (i < newArray.size){
        println(newArray[i])
        i++
    }

    //For Loop
    //traversing through array using for loop
    println("For Loop output")
    for (j in newArray){
        println(j)
    }

    //using range
    println("For Loop Range")
    for (x in 10 downTo 2 step 2){
        println(x)
    }


}