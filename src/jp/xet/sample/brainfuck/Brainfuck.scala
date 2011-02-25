package jp.xet.sample.brainfuck

/**
 * Created by IntelliJ IDEA.
 * User: daisuke
 * Date: 11/02/25
 * Time: 11:38
 * To change this template use File | Settings | File Templates.
 */

object Brainfuck {

  var commands = Map(
    '>' -> incrementPointer,
    '<' -> decrementPointer,
    '+' -> incrementMemoryAtPointer,
    '-' -> decrementMemoryAtPointer,
    '.' -> outputMemoryAtPointer,
    '[' -> openLoop,
    ']' -> closeLoop
  )

  def main(args:Array[String]) {
    val program = readSource
    val env = new Environment(program)
    while (env.isEof == false) {
      commands.get(env.programChar) match {
        case Some(command) => command.execute(env)
        case _ => ;
      }
      env.progress
    }
  }

  def readSource = {
    // output "Hello, world!"
    """
+++++++++[>++++++++>+++++++++++>+++++<<<-]>.>++.+++++++..+++.>-.
------------.<++++++++.--------.+++.------.--------.>+.
    """

    // output "hoge"
//    """
//++++++++++++++++++++++++++++++++
//++++++++++++++++++++++++++++++++
//++++++++++++++++++++++++++++++++
//++++++++.
//+++++++.
//--------.
//--.
//    """
  }
}