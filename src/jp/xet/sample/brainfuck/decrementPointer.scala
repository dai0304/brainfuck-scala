package jp.xet.sample.brainfuck

/**
 * Created by IntelliJ IDEA.
 * User: daisuke
 * Date: 11/02/25
 * Time: 20:59
 * To change this template use File | Settings | File Templates.
 */

object decrementPointer extends Command {
  def execute(env: Environment) = {
    require(env != null)
    env.pointer -= 1
  }
}
