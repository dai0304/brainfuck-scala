package jp.xet.sample.brainfuck

/**
 * Created by IntelliJ IDEA.
 * User: daisuke
 * Date: 11/02/25
 * Time: 21:02
 * To change this template use File | Settings | File Templates.
 */

object outputMemoryAtPointer extends Command {
  def execute(env: Environment) {
    require(env != null)
    print(env.memoryAtPointer.toChar)
  }
}