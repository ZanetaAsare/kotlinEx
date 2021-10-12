import com.rsk.Person
import java.io.FileReader
import java.util.*

fun main(args:Array<String>){
    var reader = FileReader("filename")
    reader.read()  // untracked exceptions, don't need to state it
}

fun ranges() {
    for (i in 1..10) print(i)
    println()
    for (i in 10 downTo 1 step 2) print(i)
    println()
    for (i in 1 until 10) print(i)
    println()

    var numbers = listOf(6,8,3,8,2)

    for (i in numbers) print(i)
    println()

    for ((index, element) in numbers.withIndex()) {
        println("$element is at $index")
    }

    var ages = TreeMap<String, Int>()
    ages["Ama"] = 23
    ages["Kofi"] = 15
    ages["Kwame"] = 40

    for ((name, age) in ages){
        println("$name is $age")
    }
}

fun oop(){
    println("Hello Zaneta")

    val zaneta = Person("Zee")
//    zaneta.Name = "Zaneta"

    println("Name is ${zaneta.Name}")

    zaneta.Name = "Zanzan"

    println("Name is ${zaneta.Name}")

    zaneta.display()
    zaneta.displayWithLambda(::printName)

    val q = Question()
    println(q.Question);

    q.Answer = "12"
    q.show()

    var message = if (q.Answer == q.CorrectAnswer) {
        "You were correct"
    } else {
        "Try again"
    }

    println(message)
    q.printResult()

    val number:Int? = try{
        Integer.parseInt(q.Answer)
    } catch (e:NumberFormatException) {
        null
    }

    println("Number is $number")
}

fun printName(name: String) {
    println(name)
}

class Question {
    var Answer:String? = ""
    val Question:String = "How are you?"
    val CorrectAnswer = "Fineeee"

    fun show() {
        println("You said $Answer")
    }

    fun printResult() {
        when (Answer) {
            CorrectAnswer -> println("You were correct")
            else -> println("Try Again")
        }
    }
}
