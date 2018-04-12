package br.unb.cic.epl

package object Height {
  trait Expression extends Core.Expression {
    def evalHeight(): Int
  }

  trait Literal extends Core.Literal with Expression {
    override
    def evalHeight() = 1 //altura do literal é 1
  }
}
