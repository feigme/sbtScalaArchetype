// 注意:各行之间以空行相分割

name := "sbtScalaArchetype" // 项目名称

organization := "com.iary" // 组织名称

version := "0.0.1" // 版本号

scalaVersion := "2.9.2"   // 使用的Scala版本号

// 依赖包
// log4j
libraryDependencies += "org.slf4j" % "slf4j-api" % "1.6.6"

libraryDependencies += "log4j" % "log4j" % "1.2.17"

libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.6.4"

// test
// ScalaCheck
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.10.0" % "test"

// scalatest
libraryDependencies += "org.scalatest" %% "scalatest" % "2.0.M4" % "test"