// data class provides equals, hashCode and toString and copy under the hood

fun main(args: Array<String>) {
    var zaneta = Pupil(1, "Zaneta")
    var asare = Pupil(1, "Zaneta")

    // string rep is printed instead of class w/ address
    println(zaneta)

    // w/o data in class declaration, it just compares references and shows not equal
    if(zaneta == asare){
        println("Equal")
    } else {
        println("Not equal")
    }

    // copy everything else, change the name
    var newZaneta = zaneta.copy(name = "Zanzan")
    println(newZaneta)
}

data class Pupil(val id: Int, val name: String) {

}