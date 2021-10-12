import com.rsk.Person

// Array - class with a type parameter - holds a primitive type
fun main(args: Array<String>) {
    // listOf is read-only, mutablelistOf can be modified
    val ints = listOf(1,2,3,4,5)

    // can be modified too
    val a = arrayListOf(1,2,3)
    a.add(4)
    a.remove(2)

    for (i: Int in a) println(i)

    // predicate is contained in the filter brackets
    val smallInts = ints.filter { it < 4 }
//    for (i: Int in smallInts) println(i)

    val squareInts = ints.map { it*it }
//    for (i: Int in squareInts) println(i)

    val smallSquareInts = ints
                            .filter { it < 4  }
                            .map { it*it }
//    for (i: Int in smallSquareInts) println(i)

    val meetings = listOf(Meetings(1, "Course Prep"), Meetings(2, "Scrum"))

    val titles = meetings
        .asSequence()  // lazy evaluation
        .filter { it -> it.title.startsWith("C") }
        .map { m -> m.title }
    for (t in titles) println(t)

    // flatmap combines the multiple lists in the two objects into one list
    // distinct removes all duplicates
    val newPeople: List<Person> = meetings
                .flatMap(Meetings::people)
                .distinct()

    for (p in newPeople) println(p.Name)
}

class Meetings(val id: Int, val title: String){
    val people = listOf(Person("Ama"), Person("Kofi"))
}