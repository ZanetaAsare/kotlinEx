fun main(args: Array<String>) {
    val text = "With     multiple       \t whitespace"
    println(text)
    println(replaceMultipleWhiteSpace(text))

    // String functions have been extended
    println(text.replaceMultipleWhiteSpaceEx())
}

fun replaceMultipleWhiteSpace(value: String) : String {
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}

// extending the String class with a replace method
// can be called on any string object within the project
fun String.replaceMultipleWhiteSpaceEx() : String {
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}