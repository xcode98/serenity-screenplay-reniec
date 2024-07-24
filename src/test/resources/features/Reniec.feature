@Test
Feature: Navegar por la página de la Reniec

  Scenario: Ingresar y navegar en la página de la Reniec
    Given el usuario está en la página de Peruanos en el Extrangero
    When el usuario despliega la opción Consulados en el mundo
    And el usuario ingresa a la opción Lista de Consulados en el mundo
    And el usuario realiza la búsqueda de la palabra Cuenca en la nueva pestaña
    Then el usuario regresa a la pestaña original
