package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestSub extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "A Subtraction" //Teste de comportamento, ou seja, Behavior Driven Development

  var literal12: Eval.Literal = _
  var literal16: Eval.Literal = _

  before { // Instanciando literal para ser utilizado no teste
    literal12 = new Core.Literal(12) with Eval.Literal
    literal16 = new Core.Literal(16) with Eval.Literal
  }

  it should "return string (12 - 16) when we call sub.print()" in {
    val sub = new SubEval.Sub(literal12,literal16)
    sub.print() should be ("(12 - 16)")
  }

  it should "return Integer 28 when we call sub.eval()" in {
    val sub = new SubEval.Sub(literal12,literal16)
    sub.eval() should be (-4)
  }

}
