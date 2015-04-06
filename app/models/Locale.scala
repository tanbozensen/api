package models

/**
 * 緯度経度を表すクラス
 */
final class Locale (lat_ : Double)(lon_ : Double) {
  /** 緯度 */
  var lat : Double = lat_
  /** 経度 */
  var lon : Double = lon_
}