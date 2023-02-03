fun main(){
    try{
        println("Введите номера членов арифметической прогрессии")
        var m: Int
        var n: Int
        m = readLine()!!.toInt()
        n = readLine()!!.toInt()

        if (m>n){
            var temp:Int
            temp=m
            m=n
            n=temp
        }

        if(m==n){
            println("Одинаковые номера")
        }

        else{
            println("Введите первый член прогрессии")
            var a1: Int
            a1 = readLine()!!.toInt()
            println("Введите шаг прогрессии")
            var s: Int
            s = readLine()!!.toInt()
            var am: Int
            var an: Int
            am = a1 + (m - 1) * s
            an = a1 + (n - 1) * s
            var sum: Int
            sum = ((am + an) / 2) * (n - m)
            println("Сумма членов от M до N $sum")
            println("$an $am")
        }
    }
    catch (ex:Exception){
        println(ex.message)
    }
}