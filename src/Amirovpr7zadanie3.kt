import java.lang.Math.*

fun main(){
    try {
        println("Введите x")
        var x: Double = readLine()!!.toDouble()
        println(sqrt(x)*Math.log(pow(x,2.0)) / -5/4 + (exp(x/2)))
    }
    catch (ex:Exception){
        println("Некорректный ввод данных")
    }
}
