//print "cmd /c setprop ${key} ${value}".execute().text
//sh -c
//print "cmd /c one.bat now".execute().text

def cmd = 'SETX JAVA_TOOL_OPTIONS \"-Dxyz=900\"'
print cmd.execute().text
println cmd

//sleep(3333)
//set environment properties
def key="xyz"
def value="900"

System.properties."$key" = value
println System.properties[key]





