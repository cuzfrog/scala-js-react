package com.definitelyscala.react

import scala.scalajs.js
import com.definitelyscala.react.React._
import org.scalajs.dom.raw._

@js.native
trait DOMAttributes[T] extends js.Object {
  var children: ReactNode = js.native
  var dangerouslySetInnerHTML: js.Any = js.native
  // Clipboard Events
  var onCopy: ClipboardEventHandler[T] = js.native
  var onCopyCapture: ClipboardEventHandler[T] = js.native
  var onCut: ClipboardEventHandler[T] = js.native
  var onCutCapture: ClipboardEventHandler[T] = js.native
  var onPaste: ClipboardEventHandler[T] = js.native
  var onPasteCapture: ClipboardEventHandler[T] = js.native
  // Composition Events
  var onCompositionEnd: CompositionEventHandler[T] = js.native
  var onCompositionEndCapture: CompositionEventHandler[T] = js.native
  var onCompositionStart: CompositionEventHandler[T] = js.native
  var onCompositionStartCapture: CompositionEventHandler[T] = js.native
  var onCompositionUpdate: CompositionEventHandler[T] = js.native
  var onCompositionUpdateCapture: CompositionEventHandler[T] = js.native
  // Focus Events
  var onFocus: FocusEventHandler[T] = js.native
  var onFocusCapture: FocusEventHandler[T] = js.native
  var onBlur: FocusEventHandler[T] = js.native
  var onBlurCapture: FocusEventHandler[T] = js.native
  // Form Events
  var onChange: FormEventHandler[T] = js.native
  var onChangeCapture: FormEventHandler[T] = js.native
  var onInput: FormEventHandler[T] = js.native
  var onInputCapture: FormEventHandler[T] = js.native
  var onReset: FormEventHandler[T] = js.native
  var onResetCapture: FormEventHandler[T] = js.native
  var onSubmit: FormEventHandler[T] = js.native
  var onSubmitCapture: FormEventHandler[T] = js.native
  // Image Events
  var onLoad: ReactEventHandler[T] = js.native
  var onLoadCapture: ReactEventHandler[T] = js.native
  var onError: ReactEventHandler[T] = js.native
  // also a Media Event
  var onErrorCapture: ReactEventHandler[T] = js.native
  // also a Media Event
  // Keyboard Events
  var onKeyDown: KeyboardEventHandler[T] = js.native
  var onKeyDownCapture: KeyboardEventHandler[T] = js.native
  var onKeyPress: KeyboardEventHandler[T] = js.native
  var onKeyPressCapture: KeyboardEventHandler[T] = js.native
  var onKeyUp: KeyboardEventHandler[T] = js.native
  var onKeyUpCapture: KeyboardEventHandler[T] = js.native
  // Media Events
  var onAbort: ReactEventHandler[T] = js.native
  var onAbortCapture: ReactEventHandler[T] = js.native
  var onCanPlay: ReactEventHandler[T] = js.native
  var onCanPlayCapture: ReactEventHandler[T] = js.native
  var onCanPlayThrough: ReactEventHandler[T] = js.native
  var onCanPlayThroughCapture: ReactEventHandler[T] = js.native
  var onDurationChange: ReactEventHandler[T] = js.native
  var onDurationChangeCapture: ReactEventHandler[T] = js.native
  var onEmptied: ReactEventHandler[T] = js.native
  var onEmptiedCapture: ReactEventHandler[T] = js.native
  var onEncrypted: ReactEventHandler[T] = js.native
  var onEncryptedCapture: ReactEventHandler[T] = js.native
  var onEnded: ReactEventHandler[T] = js.native
  var onEndedCapture: ReactEventHandler[T] = js.native
  var onLoadedData: ReactEventHandler[T] = js.native
  var onLoadedDataCapture: ReactEventHandler[T] = js.native
  var onLoadedMetadata: ReactEventHandler[T] = js.native
  var onLoadedMetadataCapture: ReactEventHandler[T] = js.native
  var onLoadStart: ReactEventHandler[T] = js.native
  var onLoadStartCapture: ReactEventHandler[T] = js.native
  var onPause: ReactEventHandler[T] = js.native
  var onPauseCapture: ReactEventHandler[T] = js.native
  var onPlay: ReactEventHandler[T] = js.native
  var onPlayCapture: ReactEventHandler[T] = js.native
  var onPlaying: ReactEventHandler[T] = js.native
  var onPlayingCapture: ReactEventHandler[T] = js.native
  var onProgress: ReactEventHandler[T] = js.native
  var onProgressCapture: ReactEventHandler[T] = js.native
  var onRateChange: ReactEventHandler[T] = js.native
  var onRateChangeCapture: ReactEventHandler[T] = js.native
  var onSeeked: ReactEventHandler[T] = js.native
  var onSeekedCapture: ReactEventHandler[T] = js.native
  var onSeeking: ReactEventHandler[T] = js.native
  var onSeekingCapture: ReactEventHandler[T] = js.native
  var onStalled: ReactEventHandler[T] = js.native
  var onStalledCapture: ReactEventHandler[T] = js.native
  var onSuspend: ReactEventHandler[T] = js.native
  var onSuspendCapture: ReactEventHandler[T] = js.native
  var onTimeUpdate: ReactEventHandler[T] = js.native
  var onTimeUpdateCapture: ReactEventHandler[T] = js.native
  var onVolumeChange: ReactEventHandler[T] = js.native
  var onVolumeChangeCapture: ReactEventHandler[T] = js.native
  var onWaiting: ReactEventHandler[T] = js.native
  var onWaitingCapture: ReactEventHandler[T] = js.native
  // MouseEvents
  var onClick: MouseEventHandler[T] = js.native
  var onClickCapture: MouseEventHandler[T] = js.native
  var onContextMenu: MouseEventHandler[T] = js.native
  var onContextMenuCapture: MouseEventHandler[T] = js.native
  var onDoubleClick: MouseEventHandler[T] = js.native
  var onDoubleClickCapture: MouseEventHandler[T] = js.native
  var onDrag: DragEventHandler[T] = js.native
  var onDragCapture: DragEventHandler[T] = js.native
  var onDragEnd: DragEventHandler[T] = js.native
  var onDragEndCapture: DragEventHandler[T] = js.native
  var onDragEnter: DragEventHandler[T] = js.native
  var onDragEnterCapture: DragEventHandler[T] = js.native
  var onDragExit: DragEventHandler[T] = js.native
  var onDragExitCapture: DragEventHandler[T] = js.native
  var onDragLeave: DragEventHandler[T] = js.native
  var onDragLeaveCapture: DragEventHandler[T] = js.native
  var onDragOver: DragEventHandler[T] = js.native
  var onDragOverCapture: DragEventHandler[T] = js.native
  var onDragStart: DragEventHandler[T] = js.native
  var onDragStartCapture: DragEventHandler[T] = js.native
  var onDrop: DragEventHandler[T] = js.native
  var onDropCapture: DragEventHandler[T] = js.native
  var onMouseDown: MouseEventHandler[T] = js.native
  var onMouseDownCapture: MouseEventHandler[T] = js.native
  var onMouseEnter: MouseEventHandler[T] = js.native
  var onMouseLeave: MouseEventHandler[T] = js.native
  var onMouseMove: MouseEventHandler[T] = js.native
  var onMouseMoveCapture: MouseEventHandler[T] = js.native
  var onMouseOut: MouseEventHandler[T] = js.native
  var onMouseOutCapture: MouseEventHandler[T] = js.native
  var onMouseOver: MouseEventHandler[T] = js.native
  var onMouseOverCapture: MouseEventHandler[T] = js.native
  var onMouseUp: MouseEventHandler[T] = js.native
  var onMouseUpCapture: MouseEventHandler[T] = js.native
  // Selection Events
  var onSelect: ReactEventHandler[T] = js.native
  var onSelectCapture: ReactEventHandler[T] = js.native
  // Touch Events
  var onTouchCancel: TouchEventHandler[T] = js.native
  var onTouchCancelCapture: TouchEventHandler[T] = js.native
  var onTouchEnd: TouchEventHandler[T] = js.native
  var onTouchEndCapture: TouchEventHandler[T] = js.native
  var onTouchMove: TouchEventHandler[T] = js.native
  var onTouchMoveCapture: TouchEventHandler[T] = js.native
  var onTouchStart: TouchEventHandler[T] = js.native
  var onTouchStartCapture: TouchEventHandler[T] = js.native
  // UI Events
  var onScroll: UIEventHandler[T] = js.native
  var onScrollCapture: UIEventHandler[T] = js.native
  // Wheel Events
  var onWheel: WheelEventHandler[T] = js.native
  var onWheelCapture: WheelEventHandler[T] = js.native
  // Animation Events
  var onAnimationStart: AnimationEventHandler[T] = js.native
  var onAnimationStartCapture: AnimationEventHandler[T] = js.native
  var onAnimationEnd: AnimationEventHandler[T] = js.native
  var onAnimationEndCapture: AnimationEventHandler[T] = js.native
  var onAnimationIteration: AnimationEventHandler[T] = js.native
  var onAnimationIterationCapture: AnimationEventHandler[T] = js.native
  // Transition Events
  var onTransitionEnd: TransitionEventHandler[T] = js.native
  var onTransitionEndCapture: TransitionEventHandler[T] = js.native
}