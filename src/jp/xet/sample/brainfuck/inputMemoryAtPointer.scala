package jp.xet.sample.brainfuck

/**
 * Created by IntelliJ IDEA.
 * User: daisuke
 * Date: 11/02/25
 * Time: 21:03
 * To change this template use File | Settings | File Templates.
 */

object inputMemoryAtPointer extends Command {
  def execute(env: Environment) {
    require(env != null)
    env.memory(env.pointer) = Console.in.read
  }
}