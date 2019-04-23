package org.umssdiplo.automationv01.core.managepage.Calzado;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Calzado extends BasePage {


    @FindBy(css = "a[href = '/hombre']")
    private WebElement hombreHea;




    @FindBy(css = "a[href='/calzado_de_futbol-hombre']")
    private WebElement futbolBtn;


    @FindBy(css = "a[href='/calzado-de-futbol-x-18.3-tf/BB9398.html']")
    private WebElement calzadoLink;


    @FindBy(xpath = "//div[@class='gl-dropdown gl-dropdown--no-max-height']//button[@class='gl-dropdown__select label dropdown-select']")
    private WebElement sizeBtn;

    @FindBy(xpath = "//button[contains(text(),'MX 9.5')]")
    private WebElement selectedsizeBtn;


    @FindBy(xpath = "//button[@class='gl-cta gl-cta--primary gl-cta--full-width btn-bag']")
    private WebElement carritoBtn;


    //div[@id='modal-root']//span[3]
    @FindBy(xpath = "//div[@id='modal-root']//span[3]")
    private WebElement cantidad;


    @FindBy(css = "a[class='name']")
    private WebElement title;


    @FindBy(css = "a[data-auto-id='view-bag-desktop']")
    private WebElement verCarritoLink;



    @FindBy(css = "a[class='ffSelectButton']")
    private WebElement cantCarrito;




    @FindBy(css = "div[data-ci-test-id='orderTotalProductsDeliveryValue']")
    private WebElement precioCalzado;



    @FindBy(css = "div[data-ci-test-id='orderTotalCartValue']")
    private WebElement precioTotal;



    @FindBy(css = "span[class='gl-price__value gl-price__value--sale']")
    private WebElement precioCal;

    public void hoverHeaderHombre() {

        Actions builder = new Actions(webDriver);
        builder.moveToElement(hombreHea).build().perform();
    }


    public void clickFutbol() {

        CommonEvents.clickButton(futbolBtn);
    }

    public void clickCalzado() {

        CommonEvents.clickButton(calzadoLink);
    }

    public void selectSize() {

        CommonEvents.clickButton(sizeBtn);
        CommonEvents.clickButton(selectedsizeBtn);

    }


    public void addCarrito() {

        CommonEvents.clickButton(carritoBtn);
    }

    public String getCantidad(){

        String res = cantidad.getText().substring(10,11);
        return res ;
    }



    public String getTitle(){
        String res = title.getText();
        return res ;
    }


    public void clickVerCarrito(){
        CommonEvents.clickButton(verCarritoLink);
    }



    public String getCantCarrito(){
        String res = cantCarrito.getText();
        return res ;
    }

    public String getPrecio(){
        String res = precioCalzado.getText();
        return res;
    }

    public String getTotal(){
        String res = precioTotal.getText();
        return res;
    }



    public String getPrecioCalzado(){
        String res = precioCal.getText();
        return res;
    }






}
