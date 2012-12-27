object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val mainList = List(3, 2, 1)                    //> mainList  : List[Int] = List(3, 2, 1)
  val with4 = 4 :: mainList // re-uses mainList, costs one :: instance
                                                  //> with4  : List[Int] = List(4, 3, 2, 1)
  with4.head                                      //> res0: Int = 4
  val with42 = 42 :: mainList // also re-uses mainList, cost one :: instance
                                                  //> with42  : List[Int] = List(42, 3, 2, 1)
  val shorter = mainList.tail                     //> shorter  : List[Int] = List(2, 1)
}