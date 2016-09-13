

object Q4 {
    def sortInsert(e : Integer, List_num : List[Int]) : List[Int] = {
      def sortInsert1(num2: List[Int]) : List[Int] = num2 match {
        case Nil => List(e)
        case num1 :: num2 if e < num1 => e :: num1 :: num2        
        case num1 :: num2 => num1 :: sortInsert1(num2)               
      }   
      return sortInsert1(List_num)
  }
  
  def insertionSort(originalList: List[Int]) : List[Int] = {
      def insertionSort1(num2: List[Int], List_num: List[Int]) : List[Int] = num2 match {
        case Nil => List_num
        case num1 :: num2 => insertionSort1(num2, sortInsert(num1, List_num))
      }
      insertionSort1(originalList, List())
  }
  
  def main(args: Array[String]): Unit = {
    var List1= List(6,2,69,1,19,15)
    println(insertionSort(List1))
  }
}
