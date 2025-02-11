/**
 * kotlin-hello
 * getting to know kotlin syntax
 * followed from waimea-cpy/kotlin-hello-2025
 * by Connor Brennan
 * 10/2/25
 */
import java.util.Calendar

/**
 * main() is the entrypoint for kotlin, you are going to have a bad time without it
 */


fun main() {
    //********************* Output
    //terminal output with print() and println()
    println("Welcome, user")
    println("This is " + "the " + "Kotlin "+ "programming language!")
    //+ is syntax for string concatanation

    //******************** Variables

    val text = "Kotlin"
    var kotlinAge = 14
    //val is for immutable, cannot be reassigned
    //var is for mutable and can be reassigned
    kotlinAge = Calendar.getInstance().get(Calendar.YEAR) - 2011
    println("Kotlin is $kotlinAge years old")

     /**
     * variable naming scheme
     * all except top level compile time immutable should be camelcase
     *
     * eg
     *
     * val numLegs = 2 GOOD!
     * val Numlegs = 2 BAD!
     */

    //*************************** Input

    //terminal input is with readLine and readln (readln is non nullable while readLine is)
    //readlnOrNull() can handle null case (will require ?.toXXXOrNull() however)

    print("Enter your name: ")
    val name = readln()

    print("Enter your age: ")
    val age = readlnOrNull()?.toIntOrNull()

    //**************************** String Templates

    //for calculating within in string, like python's f string


    println("Hello $name!")
    if (age != null) {
        println("You are $age years old, and will be ${age + 1} years old next year!")
    }
    //calculations can be done in string with ${__}

    //***************************** String Conversion

    println(text.lowercase())
    println(text.uppercase())

    val numberString = "1473"

    val number = numberString.toInt() //Will throw exception with invalidNumber

    val invalidNumber = "abc".toIntOrNull() //Will return null on invalidNumber

    //******************************** Branching
    if (name.lowercase() == text.lowercase()) {
        println("Wow, this language is really suited to you!")
    } else if (name.lowercase() == "potus") {
        println("You are a POTUS, access granted")
    } else (
        println("You really aren't special are you?")
    )
    val ageResponse: String = when (age) {
        1 -> "You are a baby"
        2 -> "You are a toddler"
        16 -> "You are eligible for a driver's license, so you should have one of those"
        kotlinAge -> "You are the same age as the kotlin programming language!"
        else -> {
            "Your age is not special."
        }
    }

    println(ageResponse)

    //*********************************** Looping
    //For loop
    for(letter in name) { //Can be replaced with a range
        print("$letter$letter$letter ")
    }
    println()



    //While true loop
    var favouriteNumber:Int? = 0
    while(true) {
        print("Enter your favourite number: ")
        favouriteNumber = readln()?.toIntOrNull()
        if(favouriteNumber != null) {break} else {println("You must enter a number!")}
    }

    while (true){
        println("HI! Enter 'x' to exit!: ")
        if(readln()=="x") break
    }

    for(num in 1..25){
        println(num)
    }

    //*********************************** Collections
    val colours = listOf("red", "green", "blue", "yellow", "violet", "red")
    println(colours.random())


}

/**
 * Notes
 *
 * Cover:
 *  - Comments
 *  - Output:
 *      - print
 *      - println
 *  - String concatenation
 *  - Variables:
 *      - var
 *      - val
 *      - naming
 *  - Input:
 *      - readln
 *      - readlnOrNull
 *  - Output with string templates:
 *      - $....
 *      - ${....} for calcs
 *  - String conversion:
 *      - lower
 *      - upper
 *      - toInt
 *      - toIntOrNull
 *  - Branching:
 *      - if, else
 *      - when
 *  - Looping:
 *      - while, for
 *      - ranges: a..b, a..<b, downTo
 *  - Functions
 */
