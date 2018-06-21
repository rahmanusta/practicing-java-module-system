start jlink --module-path %JAVA_HOME%/jmods --add-modules java.base --output java.base
start jlink --module-path %JAVA_HOME%/jmods --add-modules java.se --output java.se
start jlink --module-path %JAVA_HOME%/jmods --add-modules java.se.ee --output java.se.ee
start jlink --module-path %JAVA_HOME%/jmods --add-modules java.desktop --output java.desktop