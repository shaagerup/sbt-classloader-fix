organization := "cerno"
name := "playframework-leak-prevention"

crossScalaVersions := Seq("2.12.8")
scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play" % "2.7.0" % "provided"
)
