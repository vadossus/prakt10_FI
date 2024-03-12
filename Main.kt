fun main()
{
try {
    print("Оператор 1: ")
    var opM = PlataZaMinute(true, readLine()!!.toString())
    opM.Input()
    opM.Choose()
    opM.Q()
    opM.Qp()
    opM.Info()
    print("Оператор 2: ")
    var opM2 = PlataZaMinute(true, readLine()!!.toString())
    opM2.Input()
    opM2.Info()
    opM2.Q()
    opM2.Qp()
}
catch (ex:Exception)
{
    println("Произошла ошибка: ${ex.message}")
}
}
