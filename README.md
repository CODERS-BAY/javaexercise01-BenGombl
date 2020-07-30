# JavaExercise01
Simple encryption / decryption of text with a password.


__Mini-Projekt:__ Verschlüsselung von Text mit einem Passwort.
* Für jedes Zeichen im Passwort wird ein Wert (Offset) berechnet.
* Jede Stelle im Text wird mit einer Stelle (Offset) im Passwort verschlüsselt (erhöht).
* "Druckbare Zeichen" sind von ASCII 32d - 126d

Es soll jeweils eine Funktion zum Verschlüsseln und Entschlüsseln entwickelt werden.

_public static String __encrypt__(String text, String password);_

_public static String __decrypt__(String text, String password);_

Hinweise:
---------
Es ist hilfeich "Hilfsfunktionen" zu implementieren, die das Offset von Text und Passwort an 
gegebener Stelle berechnen.

Für die Werte des "niedrigsten druckbaren Zeichens" (ASCII 32d) sowie des "höchten druckbaren Zeichens"
(ASCII 126d) können Konstanten verwendet werden.

String Funktion zum "Auslesen" des Char Wertes an der Stelle x: charAt(x)

Für die Berechnung welche Stelle des Passwort im Text zur Anwendung kommt, kann und soll Modulo (%)
verwendet werden.

Die Eigenschaft "length" der Klasse String gibt die Länge der Zeichenkette zurück.
