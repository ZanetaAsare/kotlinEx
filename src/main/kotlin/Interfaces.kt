// everything is public by default
interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0)
    fun setTime(time: KevinTime) = setTime(time.hours)    // no need for YetiTime to implement bc of setTime call inside
}

interface AnotherTime {
    fun setTime(time: KevinTime) {}
}

// implements/extends is defined using the colon and override keyword must be stated
class YetiTime : Time, AnotherTime {
    override fun setTime(hours: Int, mins: Int, secs: Int) {
    }

    override fun setTime(time: KevinTime) {
        super<Time>.setTime(time)
        super<AnotherTime>.setTime(time)
    }
}

class KevinTime {
    var hours: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0
}