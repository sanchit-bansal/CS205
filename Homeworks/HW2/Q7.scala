import scala.io.StdIn.{readLine, readInt}
import scala.math._


object Q7 {
  var result: BigInt = 1
  def fastPower(n: BigInt, x: BigInt): BigInt = {
    var num1 = n
    var num2 = x
    if(num1%2!=0){
       result = result * num2
     }
    if(num1==1)
      return result
     num2 = num2 * num2
     num1 = num1/2
     
    fastPower(num1,num2)
    
  }
  def main(args: Array[String]): Unit = {
    println(fastPower(8,2))
  }
}
