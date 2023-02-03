

fun hello () {
    println("Hello")
}

fun returnsAFour() {
    return 4
}

fun takinString(name: String) {
    println(name)
}

fun sum(x: Int, y:Int, z: Int = 0, w: Int = 0) =  x + y + z + w

fun printDetails(name: String, email:String = "", phone:String){
    println("name: $name - email: $email - phone:$phone")
}

// vararg = variable number of arguments
// vararg allows to create function that takes any number of arguments undefined beforehand and print them out
fun printStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main(args: Array<String>) {
    hello()

    val value = returnsAFour();
    takinString("Some Value")

    sum(1, 2, 3 )
    sum(1, 2)

    printDetails("Vivek", phone = "12345678")

    printStrings("1");
    printStrings("1", "2");
    printStrings("1", "2", "3");
}