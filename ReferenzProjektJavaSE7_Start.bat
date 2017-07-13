rem [cmd]
rem [rem [cmd] bedeutet, dass das cmd nur ein Kommentar ist]
rem [java -cp .\build\classes de.marcelhuber.referenzprojektjavase7.controller.GrundschulVerwaltungStartMVC]
rem [java -cp .\dist\lib\*;build\classes de.marcelhuber.referenzprojektjavase7.controller.GrundschulVerwaltungStartMVC]
rem [java -cp .\dist\lib\*;.\dist\* de.marcelhuber.referenzprojektjavase7.controller.GrundschulVerwaltungStartMVC]
java -cp .\dist\lib\* -jar .\dist\ReferenzProjektJavaSE7.jar
cmd
rem [pause]