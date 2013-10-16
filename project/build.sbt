scalacOptions += "-deprecation"

addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "0.6.2")

resolvers += Resolver.url("sbt-plugin-releases", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.6")
