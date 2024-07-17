package co.konecta.capacitacion.Preguntas;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.openqa.selenium.By;

import static co.konecta.capacitacion.Interfaces.FormularioTargets.example_modal;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerifyFormSubmission implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(example_modal).isDisplayed()
        );
    }

    public static VerifyFormSubmission isVisible() {
        return instrumented(VerifyFormSubmission.class);
    }
}
