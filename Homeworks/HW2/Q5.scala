
object Q5{
	def pivotSort(l: List[Int], num: Int): List[Int]=
	{
		l match{
			case Nil => List(num)
			case hd::rest if hd<=num => hd::pivotSort(rest, num) 
			case hd::rest if hd>num => pivotSort(rest, num):::List(hd) 
		}
	}
}
