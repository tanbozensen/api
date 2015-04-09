//package models
//
//import com.fasterxml.jackson.annotation.JsonProperty
//import anorm._
//import play.api.Play.current
//import play.api.db.DB
//
//
///**
// * 緯度経度を表すクラス
// */
//case class Locale (
//    id : Option[Long],
//    latitude : Double,
//    longitude : Double) {
//  
//  def save() = {
//    DB.withConnection { implicit c =>
//      val id = SQL(
//        """
//            insert into Locale(latitude, longitude)
//            values({latitude},{longitude})
//          """).on('latitude -> latitude,
//          'longitude -> longitude).executeInsert()
//    }
//  }
//}