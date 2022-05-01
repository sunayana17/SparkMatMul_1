ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.11.8"

lazy val root = (project in file("."))
  .settings(
    name := "SparkMatMul_1"
  )



libraryDependencies ++= Seq(
  "com.github.fommil.netlib" % "all" % "1.1.2",
  "org.apache.spark" %% "spark-core" % "2.3.2",
  "org.apache.spark" %% "spark-mllib" % "2.2.0"
)