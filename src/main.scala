object main extends App {
  println(s"For Loop method executed in ${multiples3And5.forLoop.executionTimeInNanos}nano seconds")
  println(s"Recursive method executed in ${multiples3And5.recursive.executionTimeInNanos}nano seconds")
  println (s"Sum is ${multiples3And5.recursive.result}")

  println("###############")
  println("Sum of even numbers of Fibonacci terms below 4 million")
  println(Fibonacci.fibonacciSequence(40000000).filter(_ % 2==0).fold(0)(_+_))
}
