package com.definitelyscala.react

import scala.scalajs.js
import com.definitelyscala.react.React._

@js.native
trait ReactChildren extends js.Object {
  def map[T](children: ReactNode, fn: js.Function2[ReactChild, Double, T]): js.Array[T] = js.native
  def forEach(children: ReactNode, fn: js.Function2[ReactChild, Double, Any]): Unit = js.native
  def count(children: ReactNode): Double = js.native
  def only(children: ReactNode): ReactElement[js.Any] = js.native
  def toArray(children: ReactNode): js.Array[ReactChild] = js.native
}