package jp.xet.sample.brainfuck

/**
 * Created by IntelliJ IDEA.
 * User: daisuke
 * Date: 11/02/25
 * Time: 20:47
 * To change this template use File | Settings | File Templates.
 */

object incrementPointer extends Command {
  def execute(env: Environment) = {
    require(env != null)
    env.pointer += 1
  }
}