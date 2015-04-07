package controllers

import models.Locale
import models.Tanbo
import play.api.libs.json.JsError
import play.api.libs.json.Json
import play.api.libs.json.Json.toJsFieldJsValueWrapper
import play.api.mvc.Action
import play.api.mvc.Controller

object TanboController extends Controller {
  implicit val locationReads = Json.format[Locale]
  implicit val tanboReads = Json.format[Tanbo]
  
  def post = Action(parse.json) { request => {
    request.body.validate[Tanbo].map { dto =>
      // オッケーの場合はIDを返す
      Ok(Json.obj("id" -> dto.locale.latitude))
    }.recoverTotal { e =>
      // バリデーションエラーを返す
      BadRequest(Json.obj("error" -> JsError.toFlatJson(e)))
    }
  }
  }
}