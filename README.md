# Terminreservierungssystem
### 4BHIT - Gruppe 4
### Fuchs, Hasenberger, Freudenthaler, Petrovic, Demir
----
## Dokumentation und Projekt
Die Dokumentation und das Projekt selbst können [hier](Java/) gefunden werden!

## Aufgabenstellung
Es soll ein Terminvereinbarungssystem erstellt werden, bei dem mehrere Benutzer untereinander zu einem Event einen Termin finden können. Bei diesem Terminvereinbarungssystem soll es Benutzer, Organisator und Teilnehmer geben. Weiters soll es Notifications geben. 

Benutzer können sich registrieren und einloggen. Diese sollen sich auch die Events an denen er teilnimmt, anzeigen lassen können. 

Organisatoren ist ein Benutzer, welcher ein Event mit Terminvorschlägen erstellen kann und Einladungen an die Benutzer versenden kann. Weiters darf der Organisator Benutzer, bevor sie sich zu dem jeweiligen Event angemeldet haben, wieder löschen. Er kann auch die gesamten Events wieder löschen und kann zu seinem Event Kommentare hinzufügen. Er kann auch Kommentare von anderen Benutzerns zu seinem Event löschen. Außerdem kann der Organisator nachdem sich alle Benutzer angemeldet haben, einen fixen Termin zu dem Event festlegen.

Teilnehmer können aus vorgeschlagenen Terminen und Zeiten eines Events auswählen. Weiters darf ein Teilnehmer seine Terminauswahl zu dem Event solange ändern, bis ein fixer Termin existiert. Des Weiteren darf der Teilnehmer Kommentare zu den Events, an denen er teilnimmt, posten.

Es soll Notifications geben, bei denen Teilnehmer über Änderungen zu Events benachrichtigt werden. Es soll auch eine Nachricht geben, wenn ein fixer Termin für ein Event gefunden wurde. Für den Organisator soll es ebenfalls eine Benachrichtigung geben, wenn sich alle Teilnehmer zu seinem Event angemeldet haben. Wenn ein Benutzer gerade offline ist, und er eine Notification bekommt, soll diese so lange gespeichert werden, bis dieser wieder online ist.

## Umsetzung

### Testing
Das GUI Tesing wurde mittels Cypress realisiert. Dazu wurde von [Cypress.io](https://www.cypress.io/) Cypress heruntergeladen und entpackt. Weiters wurde Cypress gestartet und das Verzeichnis mit den Testfällen ausgewählt. Es wurde für jedes HTML-File ein eigenes Testfile erstellt. Diese prüfen nacheinander das Aufrufen der Seite, die Verfügbarkeit der einzelnen Elemente und die Inputfelder. Bei diesen wird ein Text eingegeben und geprüft, ob dieser anschließend in dem jeweiligen Feld vorhanden ist. Zusätzlich werden die Buttons auf die Verfügbarkeit untersucht und bei Verfügbarkeit geklickt. 

Bei der Ausführung dieser Testcases tritt beim Aufrufen der Seite ein Fehler auf und es sind somit alle Testfälle negativ. Der Fehler ist der Script Error. Dieser dürfte aufrgund von Spring Boot entstehen und konnte bis zum aktuellen Datum nicht behoben werden.
## weitere Links
[Aufgabenverteilung und Zeitaufzeichnung (Google Docs)](https://docs.google.com/spreadsheets/d/1VW-v6vQswtrJ8k9jyiZ7eBA__T3pAoMxwiI9BjSo2LU/edit?usp=sharing)
