ThisBuild / scalaVersion := "2.13.0"
ThisBuild / organization := "com.Hello"
lazy val hello = (project in file("."))
	.settings(
		name := "Hello",
		libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.8",
		libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
	)
