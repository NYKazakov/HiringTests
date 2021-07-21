class Case1(id: Int, val description: String, val kind: Option[Int])

object ServicePlus {
  def main(args: Array[String]): Unit = {
    val case1 = new Case1(1, "some description", Some(3))
    val result1 = solve1(case1)
    println(result1)

    val case2 = Seq(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val result2 = solve2(case2)
    println(result2)


  }

  def solve1(solution1: Case1): String = {
    solution1.kind match {
      case None => "неизвестно"
      case Some(even) if even % 2 == 0 => "чётное"
      case _ => solution1.description
    }
  }

  def solve2(seq: Seq[Int]): Int = {
    seq.foldLeft(0)((sum, num) =>
      num match {
        case odd: Int if odd % 2 == 1 => sum + odd
        case _ => sum
      })
  }
}