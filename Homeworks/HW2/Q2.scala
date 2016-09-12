object Q2 {
  
  def main(args: Array[String]): Unit={
    
    val mainlist = List(1,2,3,4,5);
    var n=(mainlist.length)/2
    var list1: List[Int] =List()
    var list2: List[Int] =List()
    var count:Int =0 
        
    def Split(lst: List[Int]): List[Int]={

      if (count ==n ){
        list2=list2:::lst
        return lst}
      else
      {
        list1=list1:+lst.head;
        count = count + 1
        Split(lst.tail)
      }
      
      }
   
  println("HERE: "+ mainlist) 
  Split(mainlist)
  println(list1)
 println(list2)
  }
}
//n=list.length
//Create two lists of half the size
//
