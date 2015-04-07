package models

import constants.LICE_TYPE
import java.util.Date
import constants.PHASE

/**
 * 田んぼ情報クラス
 */
case class Tanbo (locale : Locale,
    liceType : Int,
    phase : Int,
    doneDate : Date)