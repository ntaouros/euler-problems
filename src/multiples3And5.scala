import scala.annotation.tailrec

object multiples3And5 {
  def forLoop: ResultWithTime = {
    val start = System.nanoTime()
    var sum = 0
    for (i <- 1 to 1000) {
      sum += eligibleToSum(i)
    }
    val end = System.nanoTime()
    ResultWithTime(sum,end - start)
  }

  def recursive={
    val list =List.tabulate(1000)(_+1)
    val startB=System.nanoTime()
    val sum=findNumbers(list,0)
    val endB=System.nanoTime()
    ResultWithTime(sum,endB-startB)
  }

  @tailrec
  def findNumbers(list:List[Int],sum:Int):Int={
    list match{
      case head::tail=>
        findNumbers(tail,sum+eligibleToSum(head))
      case Nil => sum
    }
  }

  def eligibleToSum(increment:Int): Int ={
    if (increment%3==0) increment
    else if (increment%5==0) increment
    else if (increment%15==0) -increment
    else 0
  }

  case class ResultWithTime(result:Int,executionTimeInNanos:Double)
}
