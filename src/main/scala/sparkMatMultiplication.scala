
import org.apache.spark.mllib.linalg.DenseMatrix

object sparkMatMultiplication extends App {

  val rand = new scala.util.Random //java.security.SecureRandom
  def random2dArray(d1: Int, d2: Int, maxValue: Int): DenseMatrix= {
    new DenseMatrix(d1, d2, Array.fill(d1 * d2)(rand.nextInt(maxValue)))
  }

  val runs = 1000
  val a = random2dArray(1000, 1000, 100)
  val b = random2dArray(1000, 1000, 100)

  var result = a.multiply(b)
  val start = System.currentTimeMillis()

  for (_ <- 1 to runs)
    result = a.multiply(b)
  val end = System.currentTimeMillis()

  println(s"\nTime for $runs runs: ${(end-start)/1000.0} s\n")


}