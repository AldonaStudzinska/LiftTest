organization := "pl.nooni"

name := "wycieczka"

version := "1.0"

scalaVersion := "2.9.2"

seq(webSettings: _*)


resolvers ++= Seq(
  "Scala Tools Releases" at "http://scala-tools.org/repo-releases/",
  "Java.net Maven2 Repository" at "http://download.java.net/maven/2/",
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
    "net.liftweb" %% "lift-webkit" % "2.5-M3" % "compile->default",
    "net.liftweb" %% "lift-mapper" % "2.5-M3" % "compile->default",
    "net.liftweb" %% "lift-wizard" % "2.5-M3" % "compile->default"
  )


libraryDependencies ++= Seq(
  "junit" % "junit" % "4.7" % "test->default",
  "org.mortbay.jetty" % "jetty" % "6.1.26" % "container,test",
  "ch.qos.logback" % "logback-classic" % "0.9.26"
)