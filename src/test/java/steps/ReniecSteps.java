package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.ManagedPages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import tasks.Navegar;

public class ReniecSteps {

    @ManagedPages
    WebDriver driver;
    Actor usuario = Actor.named("Usuario");

    @Given("el usuario está en la página de Peruanos en el Extrangero")
    public void el_usuario_está_en_la_página_de_peruanos_en_el_extranjero() {
        usuario.can(BrowseTheWeb.with(driver));
        usuario.attemptsTo(Navegar.aLaPaginaDeReniec());
    }

    @When("el usuario despliega la opción Consulados en el mundo")
    public void el_usuario_despliega_la_opción_consulados_en_el_mundo() {
        usuario.attemptsTo(Navegar.desplegarConsuladosEnElMundo());
    }

    @And("el usuario ingresa a la opción Lista de Consulados en el mundo")
    public void el_usuario_ingresa_a_la_opción_lista_de_consulados_en_el_mundo() {
        usuario.attemptsTo(Navegar.ingresarListaConsuladosEnElMundo());
    }

    @And("el usuario realiza la búsqueda de la palabra Cuenca en la nueva pestaña")
    public void el_usuario_realiza_la_búsqueda_de_la_palabra_cuenca_en_la_nueva_pestaña() {
        usuario.attemptsTo(Navegar.realizarBusquedaDeCuenca());
    }

    @Then("el usuario regresa a la pestaña original")
    public void el_usuario_regresa_a_la_pestaña_original() {
        usuario.attemptsTo(Navegar.regresarAPestaniaOriginal());
    }
}
