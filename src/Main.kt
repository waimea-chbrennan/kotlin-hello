/**
 * kotlin-hello
 * getting to know kotlin syntax
 * followed from waimea-cpy/kotlin-hello-2025
 * by Connor Brennan
 * 10/2/25
 */


/**
 * main() is the entrypoint for kotlin, you are going to have a bad time without it
 */

fun main() {
    //********************* Output
    //terminal output with print() and println()
    println("Hello User")
    println("welcome " + "to " + "the "+ "programming language kotlin")
    //+ is syntax for string concatanation

    //******************** Variables

    val language : String = "Kotlin"
    var languageAge : Int = 24
    //val is for immutable
    //var is for mutable

    /**
     * variable naming scheme
     * all except top level compile time immutable should be camelcase
     *
     * eg
     *
     * val numLegs = 2 GOOD!
     * val Numlegs = 2 BAD!
     */

    //******************* Input

    //terminal input is with readLine and readln (readln is non nullable while readLine is)
    val number : Int = readln().toInt()


}