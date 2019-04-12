
Feature: registrarEquipo

  Scenario: registrar
    Given 'svService' page is loaded
    And click on 'Registro' button in 'Header' page
    And set informacion on 'Registrar' con los siguientes datos
  |modelo   |marca|anio|codigo    |descripcion|precio|categoria  |imagen        |
  |cat323DL |CAT  |2006|CAT323D123|motor c7   |30000 |excavadoras|C:\\Users\\Windows 7\\Documents\\digital harbor\\Modulo 3\\images\\excavadora.jpg |

  Scenario: eliminar
    Given 'svService' page is loaded
    And click on 'Eliminar' button in 'Header' page
    And click en 'Eliminar' boton en 'Eliminar' page
  |namebutoon|categoria|
  |equipo1|excavadoras |


  #@ABC
  #Scenario outline: registrar
  #  Given 'svService' page is loaded
  #  And set my credentials on 'Registrar' page
  #click 'Registrar Maquinaria' tab in 'Header' page
  #AND fill "<Nombre Maquinaria>" nombre maquinaria campo en 'Formulario Magina'form

   # Examples:
    #|Nombre Maquinaria|Nombre Maquinaria2|Nombre Maquinaria3|
    #|Nombre MaquinariaTest|Nombre MaquinariaTest|Nombre MaquinariaTest|
