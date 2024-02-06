import kotlin.math.round
import kotlin.math.exp
import kotlin.math.abs
import kotlin.math.ln
import kotlin.math.sqrt
fun main()
{
    try {
        println("Введите значение x")
        val x = readLine()!!.toDouble()
        val answer = round((sqrt(abs(x)) * ln(Math.pow(x, 2.0))) / (-5 / (4 * x) + exp(x / 2)))
        println(answer)
    }
    catch (e:Exception)
    {
        println("Введен неверный формат данных")
    }
}