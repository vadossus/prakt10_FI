abstract class OperatorMobile(): Info {
    abstract var operator: String
    abstract var Plat: Boolean
    abstract var priceMinute: Double
    abstract var S_pokritiya: Double
    abstract fun Q(): Double
    abstract fun Qp(): Double

    override fun Info()
    {
        println("Оператор: ООО '$operator'")
        println("Прайс за минуту: $priceMinute руб")
        println("Покрытие (площадь): $S_pokritiya")
        println("Q: ${Q()}")
        println("Qp: ${Qp()}")
    }


}