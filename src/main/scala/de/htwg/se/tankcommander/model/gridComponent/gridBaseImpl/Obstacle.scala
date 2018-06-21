package de.htwg.se.tankcommander.model.gridComponent.gridBaseImpl

abstract class Obstacle {
  val name: String
  val desc: String
  val shortName: String
  val passable: Boolean
  val hitmalus: Int

  def deepClone(): Obstacle
}

case class Bush() extends Obstacle {
  override val name: String = "Gebüsche"
  override val desc: String = "Gebüsche verringern die Präzision von Schüssen"
  override val passable: Boolean = true
  override val shortName: String = "B"
  override val hitmalus: Int = 10

  override def deepClone(): Obstacle = new Bush
}

case class Hill() extends Obstacle {
  override val name: String = "Hügel"
  override val desc: String = "Ermöglichen direkten Beschuss mapweit"
  override val passable: Boolean = true
  override val shortName: String = "H"
  override val hitmalus: Int = 20
  override def deepClone(): Obstacle = new Hill
}

case class Rock() extends Obstacle {
  override val name: String = "Stein"
  override val desc: String = "Steine dienen als Hinderniss und können weder passiert noch durschossen werden"
  override val passable: Boolean = false
  override val shortName: String = "S"
  override val hitmalus: Int = 100
  override def deepClone(): Obstacle = new Rock
}

case class Forest() extends Obstacle {
  override val name: String = "Wald"
  override val desc: String = "Wälder liefern Schutz und verringern die Hitchance des Gegners"
  override val passable: Boolean = true
  override val shortName: String = "F"
  override val hitmalus: Int = 10
  override def deepClone(): Obstacle = new Forest
}

case class Water() extends Obstacle {
  override val name: String = "Wasser"
  override val desc: String = "Wasser kann nicht passiert werden"
  override val passable: Boolean = false
  override val shortName: String = "W"
  override val hitmalus: Int = 0
  override def deepClone(): Obstacle = new Water
}


