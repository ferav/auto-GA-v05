# Login feature review the behavior in thie feature
Feature: Calzado

  Scenario: Home page is displayed for search shoe
    Given 'Adidas' page is loaded
    And Hover on 'HOMBRE' link header
    And click on 'futbol' link submenu
    And get price 'Calzado de Fútbol TF'"$1,329"
    And click on 'Calzado de Fútbol TF' link
    And select shoe size
    And click button 'AÑADIR AL CARRITO'
    Then verify that 'view shooping bag' is "1"
    And click 'VER CARRITO' link
    Then verify "CALZADO DE FÚTBOL X 18.3 TF" title is displayed
    Then Quantity should be "1"
    Then price should be "$1,329.00"
    Then total should be "$1,428.00"












