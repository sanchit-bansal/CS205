

object Q8 {
  def interleave(x:Int, l:List[Int]):List[List[Int]] = l match { 
    case Nil => List(List(x))
    case (head::tail) => (x :: head :: tail) :: interleave(x, tail).map(head :: _)
}
  

  def permutations(l:List[Int]):List[List[Int]] = l match {
    case Nil => List(List())
    case (head::tail) => for(p0 <- permutations(tail); p1 <- interleave(head, p0)) yield p1
}
  def main(args: Array[String]): Unit = {
    var lst = List(1,2,3)
    println(permutations(lst).distinct)
   
    }
}
