class PlataZaMinute(IsPlata: Boolean, imya_operatora1: String): OperatorMobile2(IsPlata,imya_operatora1)
{
    fun Choose()
    {
        try {
            println("Вы совершили плату (Да или нет)?: ")
            var choose = readLine()!!.toString()
            if (choose == "Да" || choose == "да")
            {
                Plat = true
            }
            else if (choose == "Нет" || choose == "нет")
            {
                Plat = false
            }
            else
            {
                println("Такого варианта нету.")
                System.exit(0)
            }
        }
        catch(ex:Exception)
        {
            println("Ошибка: ${ex.message}")
            System.exit(0)
        }
    }
    var Qp0 = 0.0

    override fun Qp(): Double {
        if (Plat)
        {
            Qp0 = 0.7 * Q()
        }
        else
        {
            Qp0 = 1.5 + Q()
        }
        return Qp0
    }
}