// infix allows class methods to be used without the dot operator. Only works for binary operations
// operator allows overloading operation symbols to serve other purposes, eg. plus, minus

fun main(args: Array<String>) {
    val h1 = Header("H1", 12)
    val h2 = Header("H2", 3)

    val h3 = h1 plus h2
    println(h3.Name)

    val h4 = h1 + h2
    println(h4.Name)

    val h5 = h1 - h2
    println(h5.Age)
}

class Header(var Name: String = "K", var Age: Int = 5){}

infix operator fun Header.plus(other: Header) : Header {
    return Header(this.Name + other.Name)
}

infix operator fun Header.minus(other: Header) : Header {
    return Header(Age = this.Age - other.Age)
}