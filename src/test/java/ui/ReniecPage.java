package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReniecPage {
    public static final Target PRIMER_LINK = Target.the("Primer link")
            .located(By.xpath("//body[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[20]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]"));
    public static final Target SEGUNDO_LINK = Target.the("Segundo link")
            .located(By.xpath("//a[contains(text(),'CONSULADOS EN EL MUNDO')]"));
    public static final Target TERCER_LINK = Target.the("Tercer link")
            .located(By.xpath("//a[contains(text(),'Lista de Consulados en el mundo')]"));
    public static final Target COMBO_BOX = Target.the("Combo box")
            .located(By.id("txtSearch"));
    public static final Target BUTTON_SEARCH = Target.the("Button search")
            .located(By.xpath("//img[@class='imgSearchLupa']"));
}