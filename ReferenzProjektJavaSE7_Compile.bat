rem [javac -d ..\..\..\..\..\build\classes . src.de.marcelhuber.referenzprojektjavase7.controller.GrundschulVerwaltungStartMVC.java]
rem [Frage: Was macht der .?]
cd src
javac -d ..\build\classes de\marcelhuber\referenzprojektjavase7\controller\GrundschulVerwaltungStartMVC.java
rem [jar -cvfm ..\dist\ReferenzProjektJavaSE7.jar .\..\myManifest.mf de\marcelhuber\referenzprojektjavase7\controller\GrundschulVerwaltungStartMVC.java]
rem [jar -cvfm ..\dist\ReferenzProjektJavaSE7.jar .\..\myManifest.mf de\marcelhuber\referenzprojektjavase7\controller\GrundschulVerwaltungStartMVC.java]
jar -cvfm .\..\dist\ReferenzProjektJavaSE7.jar .\..\myManifest.mf ..\build\classes
rem [pause]
cmd
