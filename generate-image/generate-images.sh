#!/bin/bash

jlink --module-path $JAVA_HOME/jmods --add-modules java.base --output java.base
jlink --module-path $JAVA_HOME/jmods --add-modules java.se --output java.se
jlink --module-path $JAVA_HOME/jmods --add-modules java.se.ee --output java.se.ee
jlink --module-path $JAVA_HOME/jmods --add-modules java.desktop --output java.desktop