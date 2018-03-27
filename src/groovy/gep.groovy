//get environment properties
//System.properties.each {k,v-> println "$k=$v"}

//println "\nJVM Properties printed."
println System.properties["xyz"]

// println System.properties.grep ({it.key.contains("proxy")})
