// defines a set of classes that are allowed to inherit from the parent class

sealed class PersonEvent {
    class Awake : PersonEvent()
    class Asleep : PersonEvent()
    class Eating(val food : String) : PersonEvent()
}

fun handlePersonEvent(event : PersonEvent) {
    when(event) {
        is PersonEvent.Awake -> println("Awake")
        is PersonEvent.Asleep -> println("Asleep")
        is PersonEvent.Eating -> println(event.food)
    }
}