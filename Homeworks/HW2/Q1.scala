import scala.io.StdIn.{readLine, readInt}
import scala.math._

object Q1 {

  def fact(n: Int ): BigInt = n match {
    case 0 => 1
    case n => n*fact(n-1)
  }
    def main(args: Array[String]): Unit = {
      println("Enter the number for factorial:")
      var num = readInt
      var b = fact(num)
      println(b)
  }
 
}
