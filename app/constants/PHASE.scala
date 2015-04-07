package constants

object PHASE {
  // objectで定義するとsingletonになる
  case object TAUE extends PHASE(0)
  case object INEKARI extends PHASE(1)

  private val codeTable = Array(TAUE, INEKARI)

  def complement(code:Int) : PHASE = codeTable((~code & 0x03) | (code & 0x04))
}
// sealedを付けると、DNAを拡張したクラスはこのファイル内でしか定義できない
// abstractを付けると、DNAを拡張したクラスはA, C, G, T, N以外にないことを保証できるので
// match文がexhaustive(すべてのケースを網羅)になる
sealed abstract class PHASE(val code:Int) {
    // A, C, G, T, Nをcase objectとすると、クラス名を表示するtoStringが実装される
    val name = toString
    // PHASEクラスには自由にメソッドを定義できる
    def complement = PHASE.complement(code)
}