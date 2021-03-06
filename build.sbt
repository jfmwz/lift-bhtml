name := "bhtml"

organization := "ag.bett.lift"

version := "0.1"

scalaVersion := "2.9.1"

scalacOptions ++= Seq("-deprecation")
//scalacOptions ++= Seq("-unchecked", "-deprecation")

seq(site.settings:_*)

seq(ghpages.settings:_*)

git.remoteRepo := "git@github.com:fbettag/lift-bhtml.git"

resolvers ++= Seq(
  "Scala Tools Releases" at "http://scala-tools.org/repo-releases/",
  "Scala Tools Snapshot" at "http://scala-tools.org/repo-snapshots/"
)

libraryDependencies ++= {
  val liftVersion = "2.4"
  Seq(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default",
    "net.liftweb" %% "lift-mapper" % liftVersion % "compile->default")
}


