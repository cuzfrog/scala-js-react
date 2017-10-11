import com.typesafe.sbt.SbtScalariform.{ ScalariformKeys, scalariformSettings }
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._

object Projects {
  val projectId = "scala-js-react"
  val projectName = "scala-js-react"

  object Versions {
    val app = "1.0.3"
    val scalaVersions = Seq("2.11.11", "2.12.3")
  }

  private[this] val commonSettings = Seq(
    version := Versions.app,
    scalaVersion := "2.12.3",
    crossScalaVersions := Versions.scalaVersions,
    scalacOptions ++= Seq(
      "-encoding", "UTF-8", "-feature", "-deprecation", "-unchecked", "–Xcheck-null", "-Xfatal-warnings", /* "-Xlint", */
      "-Ywarn-adapted-args", /* "-Ywarn-dead-code", */ "-Ywarn-inaccessible", "-Ywarn-nullary-override", "-Ywarn-numeric-widen"
    ),
    scalacOptions in (Compile, doc) := Seq("-encoding", "UTF-8", "-feature", "-deprecation", "-unchecked"),
    scalacOptions in Test ++= Seq("-Yrangepos"),

    shellPrompt := { state => s"${Project.extract(state).currentProject.id}> " },
    resolvers ++= List(Resolver.jcenterRepo, Resolver.bintrayRepo("cuzfrog", "maven"))
  ) ++ scalariformSettings

  private[this] val scalaJsSettings = Seq(
    name := projectName,
    organization := "com.github.cuzfrog",
    libraryDependencies ++= Seq("org.scala-js" %%% "scalajs-dom" % "0.9.2"),
    scalaJSStage in Global := FastOptStage
  )

  val publicationSettings = Seq(
    licenses += ("Apache-2.0", url("https://opensource.org/licenses/Apache-2.0")),
    publishMavenStyle := true,
    publishTo := Some("My Bintray" at s"https://api.bintray.com/maven/cuzfrog/maven/${name.value}/;publish=1")
  )

  lazy val react: Project = Project(id = projectId, base = file("."))
    .settings(commonSettings ++ scalaJsSettings)
    .enablePlugins(ScalaJSPlugin)
}
