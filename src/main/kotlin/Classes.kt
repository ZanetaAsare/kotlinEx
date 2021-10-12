// classes are final by default - cannot be inherited
// methods are final by default - cannot be overridden
// open keyword is used to change the above

abstract class Human {
    var firstName:String = ""
    var lastName:String = ""

    open fun getName() : String = "$firstName $lastName"
    abstract fun getAddress():String  // class containing abstract method must be abstract too
}

// student is inheriting from human
class Student : Human() {
    override fun getName():String{return ""}
    override fun getAddress(): String {
        return ""
    }
}

// abstract classes and methods
abstract class Animal {
    abstract fun getName()
    open fun workHard(){}
    fun goOnHoliday(){}
}