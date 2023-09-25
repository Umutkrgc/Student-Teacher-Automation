::Run this batch file t execute this program in Windows..

@ECHO OFF
javac -d .class ogrenci_ogretmen_uygulama\Branch.java
javac -d .class ogrenci_ogretmen_uygulama\Notlar.java
javac -d .class ogrenci_ogretmen_uygulama\Database.java
javac -d .class ogrenci_ogretmen_uygulama\ogrenci.java
javac -d .class ogrenci_ogretmen_uygulama\Yil.java
javac -d .class ogrenci_ogretmen_uygulama\MysqlHandler.java
javac -d .class ogrenci_ogretmen_uygulama\ProgramInterface.java
java -cp .class ogrenci_ogretmen_uygulama.Database