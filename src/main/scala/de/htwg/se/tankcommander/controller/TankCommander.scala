package de.htwg.se.tankcommander.controller


import de.htwg.se.tankcommander.model._

object TankCommander {
  def main(args: Array[String]): Unit = {

    print("Welcome to Tank-Commander")
    print("Player 1 please choose your Name")
    val player1 = Player(scala.io.StdIn.readLine())
    print("Player 2 please choose your Name")
    val player2 = Player(scala.io.StdIn.readLine())
    print("Player 1 please name your Tank")
    val tank1 = new TankModel(scala.io.StdIn.readLine())
    print("Player 1 please name your Tank")
    val tank2 = new TankModel(scala.io.StdIn.readLine())
    val map: Field = new Field
    map.setPositionOfModel(3, 3, tank1)
    map.setPositionOfModel(8, 8, tank2)
    var gameStateActive = new GameState(player1, player2);

  }
}