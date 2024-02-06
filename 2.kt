fun main()
{
    try {
        println("Введите номер N-го числа:")
        var n = readLine()!!.toDouble()
        println("Введите номер M-го числа:")
        var m = readLine()!!.toDouble()
        when (m<n)
        {
            true ->
            {
                println("Введите значение M-го числа:")
                var am = readLine()!!.toDouble()
                println("Введите значение N-го числа:")
                var an = readLine()!!.toDouble()

                var sum = (am + an) * (n - m +1) / 2
                println("Сумма членов с номерами от M до N: " + sum)
            }
            false ->
            {
                println("N должно быть больше M")
            }
        }
    }
    catch (e:Exception)
    {
        println("Введен неверный формат данных")
    }
}