import play.api.db.DB
import play.api.Application

import play.api.i18n.{ Messages, Lang }
import play.api.mvc._
import play.api.mvc.Rendering
import play.api.mvc.Results._
import play.api.mvc.RequestHeader
import play.api.GlobalSettings
import play.api.mvc.{ Result, RequestHeader }
import play.api.libs.json._
import com.mohiva.play.silhouette.core.{ Logger, SecuredSettings }
import utils.di.SilhouetteModule
import scala.concurrent.Future
import com.google.inject.Guice
import controllers.routes


/**
 * The global configuration.
 */
object Global extends GlobalSettings with SecuredSettings with Logger {
  override def onStart(app: Application) {
    println("application started")
  }

  /**
   * The Guice dependencies injector
   */
  

  val injector = Guice.createInjector(new SilhouetteModule)

  /**
   * Loads the controller classes with the Guice injector,
   * in order to be able to inject dependencies directly into the controller.
   *
   * @param controllerClass The controller class to instantiate.
   * @return The instance of the controller class.
   * @throws Exception if the controller couldn't be instantiated.
   */
  override def getControllerInstance[A](controllerClass: Class[A]) = injector.getInstance(controllerClass)

  /**
   * Called when a user is not authenticated.
   *
   * As defined by RFC 2616, the status code of the response should be 401 Unauthorized.
   *
   * @param request The request header.
   * @param lang The currently selected language.
   * @return The result to send to the client.
   */
  //  override def onNotAuthenticated(request: RequestHeader, lang: Lang): Option[Future[Result]] = {
  //    controllers.StaticResponse.onNotAuthenticated(request, lang)
  //  }

  /**
   * Called when a user is authenticated but not authorized.
   *
   * As defined by RFC 2616, the status code of the response should be 403 Forbidden.
   *
   * @param request The request header.
   * @param lang The currently selected language.
   * @return The result to send to the client.
   */
  //  override def onNotAuthorized(request: RequestHeader, lang: Lang): Option[Future[Result]] = {
  //    controllers.StaticResponse.onNotAuthorized(request, lang)
  //  }
}
