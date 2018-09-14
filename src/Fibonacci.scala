import scala.annotation.tailrec

object Fibonacci {
  def fibonacciSequence(limit:Int)={
    @tailrec
    def fibonacci(limit:Int,list:List[Int]):List[Int]={
      if(list.last>limit){
        list.take(list.length-1)
      }
      else{
        val lastTwo= list.takeRight(2)
        fibonacci(limit,list :+ lastTwo.fold(0)(_+_))
      }
    }
    fibonacci(limit,List(1,2))
  }

  
}
