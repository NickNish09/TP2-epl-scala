import br.unb.cic.epl.Core
import br.unb.cic.epl.Eval
import br.unb.cic.epl.Add
import br.unb.cic.epl.Sub
import br.unb.cic.epl.Mult
import br.unb.cic.epl.MultHeight
import br.unb.cic.epl.SubHeight
import br.unb.cic.epl.AddHeight
import br.unb.cic.epl.Height
import br.unb.cic.epl.AddEval

object Main extends App {
  val lit100 = new Core.Literal(100) with Eval.Literal
  val lit500 = new Core.Literal(500) with Eval.Literal

  val lit15 = new Core.Literal(15) with Height.Literal
  val lit12 = new Core.Literal(12) with Height.Literal

  val exp = new Mult.Mult(lit100,lit500)
  val mulheight = new MultHeight.Mult(lit15,lit12) with Height.Expression
  val subheight = new SubHeight.Sub(lit15,lit12) with Height.Expression
  val addheight = new AddHeight.Add(lit15,lit12) with Height.Expression

  val maiorexp = new MultHeight.Mult(mulheight,lit15) with Height.Expression

  val sum = new Add.Add(lit100, exp)


  println("Expression Test:"+sum.print())
  println("Literal Test: "+lit100.eval())
  println("Altura de Literal Test: "+lit12.evalHeight())

  println("Expression Mult Test: "+mulheight.print())
  println("Altura Expression Mult Test: "+mulheight.evalHeight())

  println("Expression Sub Test: "+subheight.print())
  println("Altura Expression Sub Test: "+subheight.evalHeight())

  println("Expression Add Test: "+addheight.print())
  println("Altura Expression Add Test: "+addheight.evalHeight())

  println("Maior Expression: "+maiorexp.print())
  println("Maior Expression Altura Teste: "+maiorexp.evalHeight())
}
