// conditions used in manipulating collections

fun main(args: Array<String>) {
    val ints = listOf(1,2,3,4,5)

    // they can be stored to a variable
    val greaterThanThree = {v:Int -> v > 3}

    var largeInts = ints.all{it > 3}

    // use case for predicate stored in variable
    largeInts = ints.all(greaterThanThree)
    println(largeInts)

    largeInts = ints.any { it > 3 }
    println(largeInts)

    var numberOfLargeInts = ints.count { it > 3 }
    println(numberOfLargeInts)

    var found: Int ? = ints.find(greaterThanThree)
    println(found)
}