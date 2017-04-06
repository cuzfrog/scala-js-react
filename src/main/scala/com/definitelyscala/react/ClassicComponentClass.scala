package com.definitelyscala.react

import scala.scalajs.js

@js.native
trait ClassicComponentClass[P] extends ComponentClass[P] {
  def getDefaultProps(): P = js.native
}