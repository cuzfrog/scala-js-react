package com.definitelyscala.react

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait ReactHTMLElement[T <: HTMLElement] extends DOMElement[HTMLAttributes[T], T] {
}