package com.definitelyscala.react

import scala.scalajs.js
import com.definitelyscala.react.React._
import org.scalajs.dom.raw._

@js.native
trait DOMElement[P <: DOMAttributes[T], T <: Element] extends ReactElement[P] {
  var ref: Ref[T] = js.native
}
