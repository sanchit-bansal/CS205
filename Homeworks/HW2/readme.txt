1. [Factorial] Given an integer n >= 0, factorial of n is calculated by multiplying all numbers from 1 to n. Write a recursive function f act(n : Int) : Int → Int (with the domain as Integer and co-domain as Integer) that takes an integer argument n and returns the result of its factorial.

Q. 2. [List split] Write a recursive function Split:List[Int] → List[Int] ∗ List[Int] that splits a list in two equal parts and return them as a pair. In case of an odd length list, any one part is allowed to have one more element than the other.

Q. 3. [Insertion in a sorted list] Write a recursive function sortInsert:List[Int]∗Int → List[Int] that takes a sorted list and an element as an argument. It returns a sorted list where the element is inserted at its proper position.
 
Q. 4. [Insertion Sort] Write a recursive function InsertionSort:List[Int] → List[Int] that takes an unsorted list as an argument and uses the recursive function sortInsert defined above to sort the input list.

Q. 5. [Insertion in an unsorted list] Write a recursive function pivotSort:List[Int] ∗ Int → List[Int] that takes an unsorted list and an element as an argument. It returns a list where the element is inserted at its proper position according to the ‘less-than’ order
over integers.

Q. 6. [Quick Sort] Write a recursive function quickSort:List[Int] → List[Int] that takes an unsorted list as an argument. It uses the recursive function pivotSort to return a sorted list. The elements of the output list must be sorted according to the ‘less-than’ order over
integers. 

Q. 7. [Fast Power] Given two integers x and n we can calculate x n as following. First calculate x ∗ x to calculate x2  . Now multiply x 2 with itself to calculate x 4 and so on. Depending upon the value of n this procedure reduces the time to calculate x n by quickly multiplying the result to itself thus leading to the calculation of higher exponentials. Write a recursive function fastPower:Int ∗ Int → Int that takes two arguments x and n and
returns the calculated value x n following the above mentioned trick.

Q. 8. [Permutation generator] Write a recursive function permutationGen:List[Int] → List[List[Int]] that takes a list as an argument and returns another list that contains all permutations that can be generated from the sequence of integers present in the input list. For example, if the input list is [1,2,3] then the output list should be [[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]].
