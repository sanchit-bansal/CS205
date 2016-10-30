object Q6{
	def main(args: Array[String]): Unit=//main method
	{
    	var list1 = List(5,2,4,7,13,14, 3)
   	println(quickSort(list1))
	}
	def pivotSort(l: List[Int], x: Int): List[Int]=
	{
		l match{
			case Nil => List(x)//base case
			case hd::rest if hd<=x => hd::pivotSort(rest, x) //moves elements smaller than x to the left
			case hd::rest if hd>x => pivotSort(rest, x):::List(hd) t
		}
	}
	def quickSort(lst: List[Int]): List[Int]=
	{
		lst match{
			case Nil => Nil
			case hd::Nil => List(hd) 
			case hd::rest if rest==List(hd) =>lst 
			case hd::rest => quickSort((pivotSort(lst.init, lst.last)).splitAt(hd))
		}
	}
}
