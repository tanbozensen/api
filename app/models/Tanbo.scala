package models

import play.api.Play.current
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick._

/**
 * 田んぼ情報クラス
 */
case class Tanbo(
  id: Option[Long],
  liceType: Int,
  phase: Int,
  doneDate: String,
  latitude: Double,
  longitude: Double)

class Tanbos(tag: Tag) extends Table[Tanbo](tag, "tanbo") {
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def liceType = column[Int]("liceType", O.NotNull)
  def phase = column[Int]("phase", O.NotNull)
  def doneDate = column[String]("doneDate", O.NotNull)
  def latitude = column[Double]("latitude", O.NotNull)
  def longitude = column[Double]("longitude", O.NotNull)
  def * = (id.?, liceType, phase, doneDate, latitude, longitude) <> ((Tanbo.apply _).tupled, Tanbo.unapply)
}

object TanboDAO {
  lazy val tanboQuery = TableQuery[Tanbos]

  /**
   * ID検索
   * @param ID
   */
  def searchByID(id: Long)(implicit s: Session): Option[Tanbo] = {
    tanboQuery.filter { _.id === id } firstOption
  }

  /**
   * ID検索
   * @param ID
   */
  def searchAll(implicit s: Session): List[Tanbo] = {
    tanboQuery.list
  }

  /**
   * 作成
   * @param tanbo
   */
  def create(tanbo: Tanbo)(implicit s: Session) : Long  = {
    return (tanboQuery returning tanboQuery.map(_.id)).insert(tanbo)
  }

  /**
   * 更新
   * @param tanbo
   */
  def update(tanbo: Tanbo)(implicit s: Session) {
    tanboQuery.filter(_.id === tanbo.id).update(tanbo)
  }

  /**
   * 削除
   * @param tanbo
   */
  def remove(tanbo: Tanbo)(implicit s: Session) {
    tanboQuery.filter(_.id === tanbo.id).delete
  }
}