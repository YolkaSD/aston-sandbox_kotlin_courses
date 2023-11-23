package oneweek

import oneweek.Color.*

class Weather {
    fun updateWeather(degrees: Int) {
        val (description: String, color: Color) = when {
            degrees < 10 -> "cold" to BLUE
            degrees < 25 -> "mid" to ORANGE
            else -> "hot" to RED
        }
    }
}
