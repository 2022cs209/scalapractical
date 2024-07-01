def filter(): List[String] = {
    val strings = List("hello", "scala", "programming", "is")
    strings.filter(_.length > 5)
}

def mean(num1: Int, num2: Int): Unit ={
    val average = (num1 + num2) / 2.0
    //BigDecimal(average).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
}

def SumOfEvenNumbers(numbers: List[Int]) : Int={
    numbers.filter(_ % 2 == 0).sum
    val num = List(2,3,5,7,8,11,23,40)
}