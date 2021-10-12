import java.util.*

fun main(args: Array<String>) {
    var program = Programme()
    var total = 0

    // all work the same way - lambdas
    program.fibonacci(8, { n -> println(n) })
    program.fibonacci(8) { n -> println(n) }
    program.fibonacci(8, {println(it)})
    program.fibonacci(8, ::println)

    // lambda accumulation
    program.fibonacci(8) {it -> total += it}
    println(total)
}

class Programme {
    // higher order functions
    fun fibonacci(limit: Int, action: (Int) -> Unit) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            action(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}

class Meeting {
    var Title: String = ""
    var When: Date = Date()
    var Who = mutableListOf<String>()

    fun create(){}
}

// using with and apply
fun main() {
    val m = Meeting()
    m.Title = "BM"
    m.When = Date(2021, 1,1)
    m.Who.add("Zee")

    // above same as below, just cleaner, takes an object as a lambda
    with(m) {
        Title = "BM"
        When = Date(2021, 1,1)
        Who.add("Zee")
    }

    // takes an object as a lambda and then returns it
    m.apply {
        Title = "BM"
        When = Date(2021, 1,1)
        Who.add("Zee")
    }.create()
}