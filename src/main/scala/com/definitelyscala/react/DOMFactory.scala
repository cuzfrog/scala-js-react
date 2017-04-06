package com.definitelyscala.react

import scala.scalajs.js
import com.definitelyscala.react.React._
import org.scalajs.dom.raw._
import scala.scalajs.js.|

@js.native
trait DOMFactory[P <: DOMAttributes[T], T <: Element] extends js.Object {
  def apply(props: ClassAttributes[T] | Null, children: ReactNode*): DOMElement[P, T] = js.native
}