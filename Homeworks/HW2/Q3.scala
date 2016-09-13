import scala.io.StdIn.{readLine, readInt}
import scala.math._

object Q3 {
  def sortInsert(List1: List[Int], n: Int): List[Int]= List1 match {
    case Nil => n::List1
    case head::rest if head > n => n::List1
    case head::rest => head::sortInsert(rest,n)
    }
  def main(args: Array[String]): Unit = {
    var input_list = List(4,9, 30,51,52,91,113)
    var newList = sortInsert(input_list,19)
    println(newList)
    
  }
}
