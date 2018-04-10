package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestMult extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "An Mult expression"

  var literal12: Eval.Literal = _
  var literal16: Eval.Literal = _

  before {
    literal12 = new Core.Literal(12) with Eval.Literal
    literal16 = new Core.Literal(16) with Eval.Literal
  }

  it should "return String (12 * 16) when we call Add(Literal(12), Literal(16).print())" in {
    val mult = new MultEval.Mult(literal12, literal16)

    mult.print() should be ("(12 * 16)")
  }

  it should "return 192 when we call call Add(Literal(12), Literal(16)).eval()" in {
    val mult = new MultEval.Mult(literal12, literal16)

    mult.eval() should be (192)
  }
}
