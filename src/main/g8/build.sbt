import Dependencies._

lazy val root = (project in file(".")).settings(
  Defaults.coreDefaultSettings ++ Seq(
    name         := "$name$",
    organization := "$organization$",
    version      := "$version$",
    scalaVersion := "$scala_version$",
    libraryDependencies ++= Seq()
  )
)
