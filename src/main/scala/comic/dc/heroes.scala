package comic.dc
import comic._

/**
  * クリプトン星はその昔滅びた
  */
object Krypton extends Planet {
  val name: String = "Krypton"
}

/**
  * 人間だけどなんかしらでやたら強い人
  * @param power
  * @param speed
  */
class SuperHuman(power: Int, speed: Int) extends Earthling(power, speed) {
  override val maxPower: Int = 20
  override val maxSpeed: Int = 20
}

/**
  * クリプトン人は地球人より強い
  * @param power
  * @param speed
  */
class KryptonPeople(val power: Int, val speed: Int) extends Alien {
  val maxPower: Int = 30
  val maxSpeed: Int = 30
  val fromPlanet: Planet = Krypton
}

/**
  * クッソ強いヒーロー、緑の石ころに弱い
  */
class Superman extends KryptonPeople(30, 30) with Hero {
  /**
    * だいたいやっつけられる
    * @param viran
    */
  def defeatViran(viran: Viran): Unit = ???

  /**
    * 火事とかスペースシャトルを助けるのは見たことあるけど万引き捕まえたりするのかな‥
    */
  def goodActivity(): Unit = ???
}

/**
  * 黒いコスプレヒーロー、リッチでマッチョな人間
  */
class Batman extends Earthling(3, 3) with Hero {
  /**
    * 相手が死んだほうがマシ‥って思うくらいにボコボコにする
    * @param viran
    */
  def defeatViran(viran: Viran): Unit = ???

  /**
    * 受取手によっては良い活動ではないことも‥
    */
  def goodActivity(): Unit = ???
}

/**
  * 世界で一番速い男
  */
class Flash extends SuperHuman(20, 20) with Hero {
  def defeatViran(viran: Viran): Unit = ???
  def goodActivity(): Unit = ???
}