package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Calzado.Calzado;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionAdidas {
    private Calzado calzado;

    @Given("^'Adidas' page is loaded$")
    public void adidasPageIsLoaded() {

        calzado = LoadPage.AddidasPage();
    }


    @And("^click on 'HOMBRE' header$")
    public void clickOnHOMBREHeader() {
        calzado = LoadPage.futbolPage("https://www.adidas.mx/calzado_de_futbol-hombre");
    }

    @Given("^'futbolAdidas' page is loaded$")
    public void futboladidasPageIsLoaded() {
        calzado = LoadPage.futbolPage("https://www.adidas.mx/calzado_de_futbol-hombre");

    }
}
