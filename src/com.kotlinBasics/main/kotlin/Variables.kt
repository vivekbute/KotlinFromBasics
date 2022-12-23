

fun main(args: Array<String>) {
    var streetNumebr: Int
//    var streetName: String = "High Street"
    var streetName = "High street" // If we don't provide the type then by the value assigned to variable streetName it will decide its type

    streetName = "Mg Road" // variables declared with var are mutable
    val pincode = "411028" // immutable means we cannot re assing the value to pincode

    val myLong = 10L // L denotes long
    val myFloat = 100F // F denotes float

    // Multi line string syntax
    val multipleLines = """
        This is string
        and this is another line
        """
}