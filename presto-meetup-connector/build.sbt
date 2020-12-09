name := "presto-meetup-connector"

version := "0.1"

scalaVersion := "2.13.4"

libraryDependencies += "io.prestosql" % "presto-spi" % "347" % Provided

// Required for compilation only or face a mysterious compilation error
libraryDependencies += "com.google.code.findbugs" % "jsr305" % "3.0.2" % Provided
