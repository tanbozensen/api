package controllers

import models.Tanbo
import play.api.libs.json.JsError
import play.api.libs.json.Json
import play.api.libs.json.Json.toJsFieldJsValueWrapper
import play.api.mvc.Action
import play.api.mvc.Controller
import models.TanboDAO
import services.TanboService

object TanboController extends Controller {
  implicit val tanboReads = Json.format[Tanbo]

  def post = Action(parse.json) { request =>
    {
      request.body.validate[Tanbo].map { dto =>
        // オッケーの場合は更新済みのオブジェクトを返す
        Created(Json.toJson(TanboService.create(dto)))
      }.recoverTotal { e =>
        // バリデーションエラーを返す
        BadRequest(Json.obj("error" -> JsError.toFlatJson(e)))
      }
    }
  }
  
  def get = Action { request =>
    {
      Ok(Json.toJson(TanboService.getAll))
    }
  }
}