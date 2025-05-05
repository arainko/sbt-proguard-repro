val scala3Version = "3.6.4"

lazy val root = project
  .in(file("."))
  .enablePlugins(SbtProguard)
  .settings(
    name := "Scala 3 Project Template",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test,
    Proguard / proguardVersion := "7.7.0",   
    Proguard / proguardOptions ++= Seq(
      "-dontwarn",
      "-dontobfuscate",
      "-printmapping mappings.txt",
      "-keep class **"
    )
  )
