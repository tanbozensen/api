package models

import constants.LICE_TYPE
import java.util.Date

/**
 * 田んぼ情報クラス
 */
final class Tanbo (loc_ : Locale) (lType_ : LICE_TYPE) (date_ : Date){
  /** 緯度経度 */
  var locale : Locale = loc_
  /** お米タイプ */
  var liceType : LICE_TYPE = lType_
  /** 作成日時 */
  var created : Date = date_
}