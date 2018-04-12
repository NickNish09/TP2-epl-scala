package br.unb.cic.epl

import org.scalatest.{BeforeAndAfter, FlatSpec, GivenWhenThen, Matchers}

class TestHeight extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter{
  behavior of "An Height evaluation"

  var lit12: Height.Literal = _
  var lit15: Height.Literal = _

  before {
    lit15 = new Core.Literal(15) with Height.Literal
    lit12 = new Core.Literal(12) with Height.Literal

  }


  it should "return 2 when we call call mulheight.eval()" in {
    val mulheight = new MultHeight.Mult(lit15,lit12) with Height.Expression

    mulheight.evalHeight() should be (2)
  }
}
