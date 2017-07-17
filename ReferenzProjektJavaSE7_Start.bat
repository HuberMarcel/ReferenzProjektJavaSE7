rem [cmd]
rem [rem [cmd] bedeutet, dass das cmd nur ein Kommentar ist]
rem [java -cp .\build\classes de.marcelhuber.referenzprojektjavase7.controller.GrundschulVerwaltungStartMVC]
rem [java -cp .\dist\lib\*;build\classes de.marcelhuber.referenzprojektjavase7.controller.GrundschulVerwaltungStartMVC]
rem [java -cp .\dist\lib\*;.\dist\* de.marcelhuber.referenzprojektjavase7.controller.GrundschulVerwaltungStartMVC]
rem [java -cp .\dist\lib\* -jar .\dist\ReferenzProjektJavaSE7.jar]
rem [java -cp .\dist\lib\*; -jar .\dist\ReferenzProjektJavaSE7.jar]
rem [Kommentar: Wichtig ist, dass man den VOLLEN Namen des mySQL-Treibers in der myManifest.mf aufführt!!]
java -jar .\dist\ReferenzProjektJavaSE7.jar
cmd
rem [pause]