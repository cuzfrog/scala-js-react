package com.definitelyscala.react

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait DragEvent[T] extends MouseEvent[T] {
  var dataTransfer: DataTransfer = js.native
}