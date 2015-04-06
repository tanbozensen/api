package constants

object LICE_TYPE {
  // objectで定義するとsingletonになる
  case object SASANISHIKI extends LICE_TYPE(0)
  case object KOSHIHIKARI extends LICE_TYPE(1)

  private val codeTable = Array(SASANISHIKI, KOSHIHIKARI)

  def complement(code:Int) : LICE_TYPE = codeTable((~code & 0x03) | (code & 0x04))
}
// sealedを付けると、DNAを拡張したクラスはこのファイル内でしか定義できない
// abstractを付けると、DNAを拡張したクラスはA, C, G, T, N以外にないことを保証できるので
// match文がexhaustive(すべてのケースを網羅)になる
sealed abstract class LICE_TYPE(val code:Int) {
    // A, C, G, T, Nをcase objectとすると、クラス名を表示するtoStringが実装される
    val name = toString
    // LICE_TYPEクラスには自由にメソッドを定義できる
    def complement = LICE_TYPE.complement(code)
}