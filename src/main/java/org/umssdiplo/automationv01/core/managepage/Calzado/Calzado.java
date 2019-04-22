package org.umssdiplo.automationv01.core.managepage.Calzado;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Calzado extends BasePage {

    @FindBy(css = "a[href = \"/hombre\"]")
    private WebElement hombreHea;

    public void clickHeaderHombre() {

        System.out.println(hombreHea.getText());
        CommonEvents.clickButton(hombreHea);

    }
}
