fun main()
{
try {
    println("Введите имя первого оператора: ")
    var imya = readLine()!!.toString()
    var opM = PlataZaMinute(true,imya)
    opM.Input()
    opM.Choose()
    opM.Q()
    opM.Qp()
    opM.Info()
    println("Введите имя второго оператора: ")
    var imya2 = readLine()!!.toString()
    var opM2 = PlataZaMinute(true, imya2)
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
