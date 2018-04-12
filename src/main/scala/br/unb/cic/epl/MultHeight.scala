package br.unb.cic.epl


package object MultHeight {
  class Mult(l: Height.Expression, r: Height.Expression) extends Mult.GMult with Height.Expression {
    type T = Height.Expression
    lhs = l
    rhs = r

    override def evalHeight(): Int = Math.max(lhs.evalHeight(),rhs.evalHeight())+1
  }
}
