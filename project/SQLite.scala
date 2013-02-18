import sbt._
import sbt.Keys._

object SQLite extends Build {

  val sqlite = Project("scala-sqlite-example", file("."))
    .settings(com.typesafe.sbtscalariform.ScalariformPlugin.scalariformSettings: _*)
    .settings(sbtassembly.Plugin.assemblySettings: _*)
    .settings(
      version := "1-SNAPSHOT",
      scalaVersion := "2.10.0",

      maxErrors := 20,
      javacOptions := Seq("-g", "-source", "1.6", "-target", "1.6", "-encoding", "utf8"),
      scalacOptions := Seq("-unchecked", "-optimise", "-feature", "-deprecation", "-Xcheckinit", "-encoding", "utf8"),

      organization := "com.gu",

      libraryDependencies ++= Seq(
        "com.typesafe.slick" %% "slick" % "1.0.0",
        "org.xerial" % "sqlite-jdbc" % "3.7.2"
      ),

      libraryDependencies ++= Seq(
        "org.scalatest" %% "scalatest" % "1.9.1" % "test",
        "org.mockito" % "mockito-core" % "1.9.0" % "test"
      )
  )
}