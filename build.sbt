// ע��:����֮���Կ�����ָ�

name := "sbtScalaArchetype" // ��Ŀ����

organization := "com.iary" // ��֯����

version := "0.0.1" // �汾��

scalaVersion := "2.9.2"   // ʹ�õ�Scala�汾��

// ������
// log4j
libraryDependencies += "org.slf4j" % "slf4j-api" % "1.6.6"

libraryDependencies += "log4j" % "log4j" % "1.2.17"

libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.6.4"

// test
// ScalaCheck
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.10.0" % "test"

// scalatest
libraryDependencies += "org.scalatest" %% "scalatest" % "2.0.M4" % "test"