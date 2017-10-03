package comic

/**
  * 登場人物
  */
trait Character {
  val maxPower: Int
  val maxSpeed: Int

  val power: Int
  val speed: Int
}

/**
  * ヒーロー!コミックブックの主役
  */
trait Hero {
  /**
    * ヴィランをやっつけることで話が進む
    * @param viran
    */
  def defeatViran(viran: Viran): Unit

  /**
    * 良いことをするものがヒーロー
    */
  def goodActivity(): Unit
}

/**
  * コミックに出てくる悪党、名の通り悪いことをする
  */
class Viran

/**
  * コミックでは地球以外の惑星がでてくる
  */
trait Planet {
  val name: String
}

/**
  * 地球人
  * @param power
  * @param speed
  */

class Earthling(val power: Int, val speed: Int) extends Character {
  val maxPower: Int = 3
  val maxSpeed: Int = 3
}

/**
  * キャラクタには地球以外の惑星からきた という設定のものもある
  */
trait Alien extends Character {
  val fromPlanet: Planet
}

