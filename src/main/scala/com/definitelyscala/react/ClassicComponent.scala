package com.definitelyscala.react

import scala.scalajs.js

@js.native
trait ClassicComponent[P, S] extends Component[P, S] {
  def replaceState(nextState: S, callback: js.Function0[Any] = js.native): Unit = js.native
  def isMounted(): Boolean = js.native
  def getInitialState(): S = js.native
}