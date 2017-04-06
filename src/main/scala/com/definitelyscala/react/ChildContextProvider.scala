package com.definitelyscala.react

import scala.scalajs.js

@js.native
trait ChildContextProvider[CC] extends js.Object {
  def getChildContext(): CC = js.native
}