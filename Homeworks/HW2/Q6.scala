  object Q6{
      def quickSort(X: List[Int]): List[Int] = X match {
         case Nil => Nil
         case head :: tail => {
             val (num1, num2) = tail.partition(_ < head)
             quickSort(num1) ::: head :: quickSort(num2)
    }
}

     def main(args:Array[String]):Unit={
       val list =List(11,3,6,4,10,1)
       println(quickSort(list))}
}
