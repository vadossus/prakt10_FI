open class OperatorMobile2(var plat1: Boolean, var imya_operator: String): OperatorMobile()
{
   override var priceMinute = 0.0
   override var Plat = plat1
    override var S_pokritiya = 0.0
    override var operator = imya_operator

    override fun Q(): Double
    {
        var Q = 100.0 * S_pokritiya/priceMinute;
        return Q
    }

    override fun Qp(): Double {
        var Qp = 0.0
        return Qp
    }

    fun Input()
    {
        try
        {
            println("Введите цену за 1 минуту: ")
            priceMinute = readLine()!!.toDouble()
            println("Введите S покрытия")
            S_pokritiya = readLine()!!.toDouble()
        }
        catch (ex:Exception)
        {
            println("Ошибка: ${ex.message}")
            System.exit(0)
        }
    }

}