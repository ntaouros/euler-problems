object main extends App {
  println(s"For Loop method executed in ${multiples3And5.forLoop.executionTimeInNanos}nano seconds")
  println(s"Recursive method executed in ${multiples3And5.recursive.executionTimeInNanos}nano seconds")
}
