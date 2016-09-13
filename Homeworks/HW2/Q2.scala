object Q2{
	def main(args: Array[String]){}
		def Split(Num1: List[Int]): (List[Int], List[Int])= {	
		Num1 match{
			case Nil => (Nil, Nil)
			case hd::tail if Num1.length==1 => (List(hd), Nil) 
			case hd::tail if Num1.length>1 => (hd::Split(tail.init)._1, Split(tail.init)._2:::List(Num1.last))
		}
		}
		Console.println("Splitting (1,2,3,4)" + Split(List(1,2,3,4)))
}

