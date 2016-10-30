object Q2{

    def main(args: Array[String]): Unit = {
        def split(lst: List[Int]): (List[Int], List[Int]) = {
            var lst1: List[Int] = List()
            var lst2: List[Int] = List()
            var lst3: List[Int] = lst

            while (lst3 != Nil) {
                lst1 = lst1:+(lst3.head)
                lst3 = lst3.tail

                if (lst3 != Nil) {
                    lst2 = lst3.last::lst2
                    lst3 = lst3.init
                }
            }
            return (lst1, lst2)
        }
        Console.println(split(List(1,9,15,4,5,11,4,5,2)))
    }
}
