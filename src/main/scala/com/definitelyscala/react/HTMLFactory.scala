package com.definitelyscala.react

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait HTMLFactory[T <: HTMLElement] extends DOMFactory[HTMLAttributes[T], T] {
}