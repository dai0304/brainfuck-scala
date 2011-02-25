package jp.xet.sample.brainfuck

/**
 * Created by IntelliJ IDEA.
 * User: daisuke
 * Date: 11/02/25
 * Time: 21:49
 * To change this template use File | Settings | File Templates.
 */

object closeLoop extends Command {
  def execute(env: Environment) = {
    if (env.memoryAtPointer != 0) {
      var depth = 0
      while (env.programChar != '[' || depth != 1) {
        if (env.programChar == ']') {
          depth += 1
        } else if (env.programChar == '[') {
          depth -= 1
        }
        env.counter -= 1
      }
    }
  }
}
