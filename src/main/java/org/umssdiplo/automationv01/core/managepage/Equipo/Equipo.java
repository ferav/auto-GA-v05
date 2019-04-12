package org.umssdiplo.automationv01.core.managepage.Equipo;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

import java.util.List;
import java.util.Map;

public class Equipo extends BasePage {

    @FindBy(name = "modelo")
    private WebElement modeloInputField;

    @FindBy(name = "marca")
    private WebElement marcaInputField;

    @FindBy(name = "anio")
    private WebElement anioInputField;

    @FindBy(name = "codigo")
    private WebElement codigoInputField;

    @FindBy(name = "descripcion")
    private WebElement descripcionInputField;

    @FindBy(name = "precio")
    private WebElement precioInputField;

    @FindBy(xpath = "//mat-select[@name='selectCategoriaid']")
    private WebElement categoriaSelectField;


    @FindBy(xpath = "//input[@type='file']")
    private WebElement fileSelectField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement registrarBtn;

    @FindBy(xpath = "//mat-select[@name='equipo_select_eliminar']")
    private WebElement selectCategoriaEliminar;





    public void setDatos() {

    }
    public void setDatos(DataTable dt){
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);

        String modeloname = list.get(0).get("modelo");
        String marcaname = list.get(0).get("marca");
        String anioname = list.get(0).get("anio");
        String codigoname = list.get(0).get("codigo");
        String descripcionname = list.get(0).get("descripcion");
        String precioname = list.get(0).get("precio");
        String categorianame = list.get(0).get("categoria");
        String filename = list.get(0).get("imagen");

        CommonEvents.setInputField(modeloInputField, modeloname);
        CommonEvents.setInputField(marcaInputField, marcaname);
        CommonEvents.setInputField(anioInputField, anioname);
        CommonEvents.setInputField(codigoInputField, codigoname);
        CommonEvents.setInputField(descripcionInputField, descripcionname);
        CommonEvents.setInputField(precioInputField, precioname);

        categoriaSelectField.click();
        webDriver.findElement(By.xpath("//mat-option/span[contains(.,'" + categorianame + "')]")).click();
        fileSelectField.sendKeys(filename);

        CommonEvents.clickButton(registrarBtn);

    }

    public void eliminarEquipo(DataTable dt){
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);
        String botonname = list.get(0).get("namebutoon");
        String categorianame = list.get(0).get("categoria");

        selectCategoriaEliminar.click();
        webDriver.findElement(By.xpath("//mat-option/span[contains(.,'" + categorianame + "')]")).click();
        webDriver.findElement(By.name(botonname)).click();
    }
}
