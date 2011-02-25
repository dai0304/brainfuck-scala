package jp.xet.sample.brainfuck

/**
 * Created by IntelliJ IDEA.
 * User: daisuke
 * Date: 11/02/25
 * Time: 20:48
 * To change this template use File | Settings | File Templates.
 */

abstract class Command {
  def execute(env: Environment)
}
