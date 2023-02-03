fun main(){
    try {
        println("Введите количество учеников")
        var m: Double = readLine()!!.toDouble()

        println("Введите количество пятерок")
        var p: Double = readLine()!!.toDouble()
        println("Введите количество четверок")
        var c: Double = readLine()!!.toDouble()
        println("Введите количество двоек")
        var d: Double = readLine()!!.toDouble()

        val t: Double = m - (p + c + d)
        println(t);

        println(t/m*100.0);
    }
    catch (ex:Exception){
        println("Некорректный ввод данных")
    }
}


