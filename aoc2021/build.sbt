ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"

lazy val root = (project in file("."))
  .settings(
    name := "aoc2021"
  )

libraryDependencies += "com.lihaoyi" %% "pprint" % "0.8.1"
