fun main(args: Array<String>) {
    val zaneta = Studentt("Zaneta", "Asare",1, "my tutor")
    println(zaneta.id)

    Studentt.createUndergrad("Zee")
    Studentt.createPostgrad("Zan")
}

class Program {
    companion object {
        @JvmStatic // helps mark the method as static for the jvm to understand
        fun main(args: Array<String>) {
            val zaneta = Studentt("Zaneta", "Asare",1, "my tutor")
            println(zaneta.id)
        }
    }
}

abstract class Humann(var firstName:String, var lastName:String){
    open fun getName() : String = "$firstName $lastName"
    abstract fun getAddress():String  // class containing abstract method must be abstract too
}

// student is inheriting from human
open class Studentt(firstName: String, lastName: String, _id : Int, var tutor: String = "") : Humann(firstName, lastName) {

    // various constructor syntax
//    val id = _id   // 1

    val id : Int   // 2
//    var tutor : String

    init {
        id = _id
//        tutor = ""
    }

    // second constructor - all this can be replaced with declaring a default value for the tutor parameter in class declaration
//    constructor(firstName: String, lastName: String, _id: Int, tutor: String) : this(firstName, lastName, _id){
//        this.tutor = tutor
//    }
    fun enroll(courseName: String) {
        val course = Courses.allCourses
            .filter {it.Title == courseName}
            .firstOrNull()

    }

    override fun getName():String{return ""}
    override fun getAddress(): String {
        return ""
    }

    // companion objects help create static methods in classes
    companion object {
        fun createUndergrad(name: String): Undergraduate {
            return Undergraduate(name)
        }
        fun createPostgrad(name: String): Postgraduate {
            return Postgraduate(name)
        }
    }
}

class Undergraduate(firstName: String): Studentt(firstName, "", 1) {

}

class Postgraduate(firstName: String): Studentt(firstName, "", 1) {

}