/*
    Diese Testcases Testen die EventErstellen Seite
*/
describe('Event Erstellen Page', function() {
    /*
        Dieser Testcase ruft die Seite auf
    */
    it('Event erstellen aufrufen', function() {
      cy.visit('http://localhost/')             //URL muss noch geändert werden
    })

    /*
        Dieser Testcase prüft, ob die Überschrift vorhanden ist
    */
    it('Event Erstellen Ueberschrift pruefen', function() {
        cy.visit('http://localhost/')                   //URL richtig einfügen

        //prüfen ob die Überschirft vorhanden ist:
        cy.contains('Neues Event Erstellen')
      })

    /*
        Dieser Testcase prüft ob die Inputfelder vorhanden sind
    */
      it('Event Erstellen Inputfelder pruefen', function() {
        cy.visit('http://localhost/')                   //URL richtig einfügen

        //Eventersteller input prüfen
        cy.get('#ErstellerName').type('Max').should('have.value', 'Max')

        //Ort input prüfen
        cy.get('#Ort').type('Alterlaa').should('have.value', 'Alterlaa')     //Klasse muss noch geändert werden

        //Beschreibung input prüfen
        cy.get('#Beschreibung').type('Poolparty').should('have.value', 'Poolparty')

        //Teilnehmermail input prüfen
        cy.get('#PersonenEmail').type('abc@domain.com').should('have.value', 'abc@domain.com')

        //Teilnehmer hinzufügen Button finden & klicken
        cy.get('.btn').click()
      })
  })
