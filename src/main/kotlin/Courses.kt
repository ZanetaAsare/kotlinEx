// objects - help create a singleton reference
// using object means you are creating a class and instantiating it immediately

class Course(val Id: Int, val Title: String) {

}

object Courses {
    var allCourses = arrayListOf<Course>()

    fun initialize() {
        allCourses.add(Course(1, "Kotlin Fundamentals"))
    }
}
