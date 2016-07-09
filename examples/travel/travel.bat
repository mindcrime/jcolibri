@echo Note that this application requires Java 1.4.2+
@echo ----------------------------
@echo jCOLIBRI Travel example
@echo ----------------------------

cd ..\..\src

@echo Compiling source code generated by jCOLIBRI
javac -classpath ..\libs\;..\bin\ -d ..\bin\ jcolibri\application\travel\travel.java

cd ..

@echo Executing CBR Application
set CLASSPATH=bin;libs/jaxb-1.0/jaxb-api.jar;libs/jaxb-1.0/jaxb-libs.jar;libs/jaxb-1.0/jaxb-ri.jar;libs/jaxb-1.0/jaxb-xjc.jar;libs/JRacer2/jracer2.jar;libs/mysql-connector-java-3.0.11-stable-bin.jar;libs/extensions/DL/libs/econn-owlapi/abstractparser.jar;libs/extensions/DL/libs/jena/antlr.jar;libs/extensions/DL/libs/junit-3.8.1/junit.jar;libs/extensions/DL/libs/aterm-java-1.6.jar;libs/extensions/DL/libs/pellet.jar;libs/extensions/DL/libs/rdfapi.jar;libs/extensions/DL/libs/servlet.jar;libs/extensions/DL/libs/econn-owlapi/api.jar;libs/extensions/DL/libs/econn-owlapi/examples.jar;libs/extensions/DL/libs/econn-owlapi/impl.jar;libs/extensions/DL/libs/econn-owlapi/inference.jar;libs/extensions/DL/libs/econn-owlapi/io.jar;libs/extensions/DL/libs/econn-owlapi/owl-servlet.jar;libs/extensions/DL/libs/econn-owlapi/owltest.jar;libs/extensions/DL/libs/econn-owlapi/rdfparser.jar;libs/extensions/DL/libs/econn-owlapi/rules.jar;libs/extensions/DL/libs/econn-owlapi/validation_test.jar;libs/extensions/DL/libs/econn-owlapi/validation.jar;libs/extensions/DL/libs/jena/commons-logging.jar;libs/extensions/DL/libs/jena/concurrent.jar;libs/extensions/DL/libs/jena/icu4j.jar;libs/extensions/DL/libs/jena/jakarta-oro-2.0.5.jar;libs/extensions/DL/libs/jena/jena.jar;libs/extensions/DL/libs/jena/junit.jar;libs/extensions/DL/libs/jena/log4j-1.2.7.jar;libs/extensions/DL/libs/jena/xercesImpl.jar;libs/extensions/DL/libs/jena/xml-apis.jar;libs/extensions/textual/libs/jwnl/commons-logging.jar;libs/extensions/textual/libs/opennlp/ant.jar;libs/extensions/textual/libs/snowball/SnowBall.jar;libs/extensions/textual/libs/jwnl/jwnl.jar;libs/extensions/textual/libs/jwnl/utilities.jar;libs/extensions/textual/libs/opennlp/grok-0.7.0.jar;libs/extensions/textual/libs/opennlp/hylo.jar;libs/extensions/textual/libs/opennlp/jakarta-ant-optional.jar;libs/extensions/textual/libs/opennlp/java-getopt.jar;libs/extensions/textual/libs/opennlp/jdom.jar;libs/extensions/textual/libs/opennlp/maxent.jar;libs/extensions/textual/libs/opennlp/opennlp.jar;libs/extensions/textual/libs/opennlp/trove.jar;libs/extensions/textual/libs/opennlp/xerces.jar;libs/extensions/textual/libs/opennlp/xml-apis.jar
java -classpath %CLASSPATH% jcolibri.application.travel.travel
@pause
cd examples\TextualCBR



