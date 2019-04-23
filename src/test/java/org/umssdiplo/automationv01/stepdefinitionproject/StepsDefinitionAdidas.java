package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Calzado.Calzado;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import static org.testng.Assert.assertEquals;

public class StepsDefinitionAdidas {
    private Calzado calzado;

    @Given("^'Adidas' page is loaded$")
    public void adidasPageIsLoaded() {

        calzado = LoadPage.AddidasPage();
    }

    @And("^Hover on 'HOMBRE' link header$")
    public void hoverOnHOMBRELinkHeader() {
        calzado.hoverHeaderHombre();
    }

    @And("^click on 'futbol' link submenu$")
    public void clickOnFutbolLinkSubmenu() {
        calzado.clickFutbol();
    }


    @And("^click on 'Calzado de Fútbol TF' link$")
    public void clickOnCalzadoDeFútbolTFLink() {
        calzado.clickCalzado();
    }

    @And("^select shoe size$")
    public void selectShoeSize() {
        calzado.selectSize();
    }

    @And("^click button 'AÑADIR AL CARRITO'$")
    public void clickButtonAÑADIRALCARRITO() {
        calzado.addCarrito();
    }

    @Then("^verify that 'view shooping bag' is \"([^\"]*)\"$")
    public void verifyThatViewShoopingBagIs(String cantidadEsperado) throws Throwable {
        String cantActual = calzado.getCantidad();
        assertEquals(cantActual, cantidadEsperado);
    }

    @Then("^verify \"([^\"]*)\" title is displayed$")
    public void verifyTitleIsDisplayed(String tituloEsperado) throws Throwable {
        String tituloActual = calzado.getTitle();
        assertEquals(tituloActual, tituloEsperado);

    }

    @And("^click 'VER CARRITO' link$")
    public void clickVERCARRITOLink() {
        calzado.clickVerCarrito();
    }

    @Then("^Quantity should be \"([^\"]*)\"$")
    public void quantityShouldBe(String cantidadEsperado) throws Throwable {
        String cantCarrito = calzado.getCantCarrito();
        assertEquals(cantCarrito, cantidadEsperado);


    }

    @Then("^price should be \"([^\"]*)\"$")
    public void priceShouldBe(String precioEsperado) throws Throwable {
        String preCalzado = calzado.getPrecio();
        assertEquals(preCalzado, precioEsperado);
    }

    @Then("^total should be \"([^\"]*)\"$")
    public void totalShouldBe(String totalEsperado) throws Throwable {
        String precioTotal = calzado.getTotal();
        assertEquals(precioTotal, totalEsperado);
    }

    @And("^get price 'Calzado de Fútbol TF'\"([^\"]*)\"$")
    public void getPriceCalzadoDeFútbolTF(String precio) throws Throwable {
       String precioCalzado = calzado.getPrecioCalzado();
       System.out.println(precioCalzado);
    }
}
