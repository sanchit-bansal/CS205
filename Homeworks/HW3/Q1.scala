object Q1{

	class QueueOps() {
		var Queue: List[Any] = Nil

		def enQueue(input:Any):Unit=
			this.Queue=this.Queue:::List(input)

		def deQueue():Unit=
			this.Queue match{
				case Nil => this.Queue = Nil
				case head::tail => this.Queue = tail
		}

		override def hashCode():Int={
			var x:Int=0
			this.Queue.foreach{
				x+=_.hashCode()
			}
			x
		}

		def printQueue():Unit={	
			println(this.Queue)
		}

	}

	def main(args: Array[String]):Unit=
	{
		var Runner = new QueueOps()
		Runner.enQueue(99)	
		Runner.enQueue(100)
		Runner.enQueue(101)
		Runner.printQueue()
		Runner.deQueue()
		Runner.printQueue()
    Runner.deQueue()
    Runner.printQueue()
	}

}
