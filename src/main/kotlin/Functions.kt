@file:JvmName("KotlinFunctions") // renames the class name to specified value

fun main(args: Array<String>) {
    println(log("Hi Zaneta", 2))
    log(logLevel = 3, message = "using named parameters, order does not matter")
    println(max(1,2))
    var textt:String = "really      \t ???"
    println(textt)
    println(textt.replaceMultipleWhiteSpaceEx())

}

// function expressions
fun max(a: Int, b: Int): Int = if (a > b) a else b

@JvmOverloads // takes the default value and feeds it into java
fun log(message: String, logLevel: Int = 1) : Boolean {
    println("$message $logLevel")
    return true
}
