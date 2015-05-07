package services

import models.Tanbo
import play.api.Play.current
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick.DB
import models.TanboDAO

object TanboService {
  
  /**
   * 田んぼ情報の作成
   */
  def create (tanbo : Tanbo) : Option[Tanbo] = {
    DB.withSession { implicit session => 
      val id = TanboDAO.create(tanbo)(session)
      return TanboDAO.searchByID(id)(session)
    }
  }
  
  /**
   * 全田んぼの取得
   */
  def getAll: List[Tanbo] = {
    DB.withSession { implicit session => 
      return TanboDAO.searchAll(session)
    }
  }
  
  /**
   * 全田んぼの削除
   */
  def delete(id: Long) = {
    DB.withSession { implicit session => 
      TanboDAO.removeById(id)(session)
    }
  }
}