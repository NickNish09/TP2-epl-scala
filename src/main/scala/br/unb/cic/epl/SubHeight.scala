package br.unb.cic.epl

package object SubHeight {
  class Sub(l: Height.Expression, r: Height.Expression) extends Sub.GSub with Height.Expression {
    type T = Height.Expression
    lhs = l
    rhs = r

    override def evalHeight(): Int = Math.max(lhs.evalHeight(),rhs.evalHeight())+1
  }
}
