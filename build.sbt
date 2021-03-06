import Dependencies._

name := "random"

organization := "com.evolutiongaming"

homepage := Some(new URL("http://github.com/evolution-gaming/random"))

startYear := Some(2019)

organizationName := "Evolution Gaming"

organizationHomepage := Some(url("http://evolutiongaming.com"))

bintrayOrganization := Some("evolutiongaming")

scalaVersion := crossScalaVersions.value.head

crossScalaVersions := Seq("2.12.10", "2.13.1")

resolvers += Resolver.bintrayRepo("evolutiongaming", "maven")

libraryDependencies ++= Seq(
  Cats.core,
  Cats.kernel,
  Cats.macros,
  Cats.effect,
  `cats-helper`,
  scalatest % Test)

licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT")))

releaseCrossBuild := true

scalacOptions in(Compile, doc) ++= Seq("-groups", "-implicits", "-no-link-warnings")