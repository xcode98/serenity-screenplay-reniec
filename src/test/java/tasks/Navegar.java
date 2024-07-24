package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Enter;
import ui.ReniecPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navegar {

    public static Task aLaPaginaDeReniec() {
        return instrumented(NavegarTask.class);
    }

    public static Task desplegarConsuladosEnElMundo() {
        return instrumented(DesplegarConsuladosEnElMundoTask.class);
    }

    public static Task ingresarListaConsuladosEnElMundo() {
        return instrumented(IngresarListaConsuladosEnElMundoTask.class);
    }

    public static Task realizarBusquedaDeCuenca() {
        return instrumented(RealizarBusquedaDeCuencaTask.class);
    }

    public static Task regresarAPestaniaOriginal() {
        return instrumented(RegresarAPestaniaOriginalTask.class);
    }

    public static class NavegarTask implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                Open.url("https://www.reniec.gob.pe/portal/masServiciosLinea.htm")
            );
        }
    }

    public static class DesplegarConsuladosEnElMundoTask implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                Click.on(ReniecPage.PRIMER_LINK)
            );
        }
    }

    public static class IngresarListaConsuladosEnElMundoTask implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                Click.on(ReniecPage.SEGUNDO_LINK)
            );
        }
    }

    public static class RealizarBusquedaDeCuencaTask implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                Click.on(ReniecPage.TERCER_LINK),
                Enter.theValue("cuenca").into(ReniecPage.COMBO_BOX),
                Click.on(ReniecPage.BUTTON_SEARCH)
            );
        }
    }

    public static class RegresarAPestaniaOriginalTask implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            // Implementar la lógica para regresar a la pestaña original
        }
    }
}
