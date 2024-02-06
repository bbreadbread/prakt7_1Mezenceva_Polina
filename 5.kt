fun main()
{
    try {
        println("учеников:")
        var all = readLine()!!.toInt()
        println("пятерок:")
        var five = readLine()!!.toInt()
        println("четверок:")
        var four = readLine()!!.toInt()
        println("двоек:")
        var two = readLine()!!.toInt()
        var three1 = 0
        var three2 = 0
        when(!(all<=0))
        {
            true ->
            {
                when
                {
                    (five+four+two) != all -> println("Количество учеников не может быть  меньше или больше количества оценок!")
                    else ->
                    {
                        three1 = 100 * (five + four + two) / all
                        three2 = 100 - three1
                        println("процент троек: " + three2)
                    }
                }
            }
            false ->
            {
                println("Количество учеников не может быть отрицательным или равно нулю ")
            }
        }
    }
    catch (e:Exception)
    {
        println("Введен неверный формат данных")
    }


}