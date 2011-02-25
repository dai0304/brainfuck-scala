package jp.xet.sample.brainfuck

/**
 * Created by IntelliJ IDEA.
 * User: daisuke
 * Date: 11/02/25
 * Time: 20:50
 * To change this template use File | Settings | File Templates.
 */

class Environment(val program: String) {
  val memory = new Array[Int](3000)
  var pointer = 0
  var counter = 0

  def isEof = {
    counter >= program.length
  }

  def programChar = {
    program(counter)
  }

  def progress:Unit = {
    counter += 1
  }

  def memoryAtPointer = {
    memory(pointer)
  }
}