package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Equipo.Equipo;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Proyecto.Proyecto;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import java.util.List;
import java.util.Map;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Equipo equipo;
    private Proyecto proyecto;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @Given("^'svService' page is loaded$")
    public void svServicePageIsLoaded() throws Throwable {
        equipo = LoadPage.registrarEquipo();

    }


    @And("^set informacion on 'Registrar' page$")
    public void setInformacionOnRegistrarPage() throws Throwable {
        equipo.setDatos();
    }


    @And("^click on 'Registro' button in 'Header' page$")
    public void clickOnRegistroButtonInProyectPage() throws Throwable {
        proyecto = new Proyecto();
        proyecto.clickBtnRegistro();
    }
    @And("^click on 'Eliminar' button in 'Header' page$")
    public void clickOnEliminarButtonInProyectPage() throws Throwable {
        proyecto = new Proyecto();
        proyecto.clickBtnEliminar();
    }

    @And("^click en 'Eliminar' boton en 'Eliminar' page$")
    public void clickEnEliminarBotonEnEliminarPage(DataTable dt) throws Throwable {
        equipo.eliminarEquipo(dt);
    }

    @And("^set informacion on 'Registrar' con los siguientes datos$")
    public void setInformacionOnRegistrarConLosSiguientesDatos(DataTable dt) throws Throwable {
        equipo.setDatos(dt);

    }



}
