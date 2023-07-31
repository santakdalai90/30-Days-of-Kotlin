import java.text.DateFormatSymbols
import java.util.Calendar

fun main() {
    val calendar = Calendar.getInstance()

    when (val hour = calendar.get(Calendar.HOUR_OF_DAY)) {     // similar to switch case
        8, 10, 12 -> println("The time is $hour")      // evaluates if at least one matches
        in 5..7 -> println("The time is $hour")    // evaluates if in range
        14 -> println("The time is $hour")
        else -> println("The time is $hour")   // default case
    }
    // for when statements flow doesn't go to next case automatically and exactly one case is executed


    val day = calendar.get(Calendar.DAY_OF_WEEK)
    val weekdays = DateFormatSymbols().shortWeekdays

    // when statement can be used as an expression and can be assigned to other var or val
    val dayMessage = when (weekdays[day]) {
        "Mon", "Tue", "Wed", "Thu", "Fri" -> "Today is weekday"
        else -> "Today is weekend"
    }

    println(dayMessage)

}