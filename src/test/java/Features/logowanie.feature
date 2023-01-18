Feature: Logowanie do aplikacji




  Scenario: Poprawne logowanie do aplikacji
    Given Uzytkownik otwiera przegldarke
    And Uzytkownik wpisuje adres strony internetowej
    When Uzytkownik wpisuje poprawny User-ID
    And Uzytkownik wpisuje porawny Password
    And Uzytkownik klika w przycisk zatwierdzajacy
    Then Uzytkownik zostaje poprawnie zalogowany do aplikacji
