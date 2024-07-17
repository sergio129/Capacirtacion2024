package co.konecta.capacitacion.Tareas;

import co.konecta.capacitacion.Interfaces.FormularioTargets;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillForm implements Task {

    private final List<Map<String, String>> data;

    public FillForm(List<Map<String, String>> data) {
        this.data = data;
    }

    public static FillForm withData(List<Map<String, String>> data) {
        return instrumented(FillForm.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (Map<String, String> map : data) {
            String campo = map.get("campo");
            String valor = map.get("valor");

            if (valor == null) continue;  // Skip if the value is null

            switch (campo) {
                case "firstName":
                    actor.attemptsTo(Enter.theValue(valor).into(FormularioTargets.FIRST_NAME));
                    break;
                case "lastName":
                    actor.attemptsTo(Enter.theValue(valor).into(FormularioTargets.LAST_NAME));
                    break;
                case "userEmail":
                    actor.attemptsTo(Enter.theValue(valor).into(FormularioTargets.EMAIL));
                    break;
                case "gender":
                    actor.attemptsTo(Click.on(FormularioTargets.GENDER.of(valor)));
                    break;
                case "userNumber":
                    actor.attemptsTo(Enter.theValue(valor).into(FormularioTargets.USER_NUMBER));
                    break;
                case "dateOfBirth":
                    actor.attemptsTo(Click.on(FormularioTargets.DATE_OF_BIRTH));
                    String[] dateParts = valor.split(" ");
                    if (dateParts.length == 3) {
                        actor.attemptsTo(SelectFromOptions.byVisibleText(dateParts[1]).from(FormularioTargets.MONTH_SELECT));
                        actor.attemptsTo(SelectFromOptions.byVisibleText(dateParts[2]).from(FormularioTargets.YEAR_SELECT));
                        actor.attemptsTo(Click.on(FormularioTargets.DATE.of(dateParts[0])));
                    }
                    break;
                case "subjects":
                    actor.attemptsTo(Enter.theValue(valor).into(FormularioTargets.SUBJECTS_INPUT));
                    actor.attemptsTo(Enter.keyValues("\n").into(FormularioTargets.SUBJECTS_INPUT));
                    break;
                case "hobbies":
                    String[] hobbies = valor.split(", ");
                    for (String hobby : hobbies) {
                        actor.attemptsTo(Click.on(FormularioTargets.HOBBIES.of(hobby)));
                    }
                    break;
                case "picture":
                    actor.attemptsTo(Upload.theFile(Paths.get(valor)).to(FormularioTargets.PICTURE_UPLOAD));
                    break;
                case "currentAddress":
                    actor.attemptsTo(Enter.theValue(valor).into(FormularioTargets.CURRENT_ADDRESS));
                    break;
                case "state":
                    actor.attemptsTo(Enter.theValue(valor).into(FormularioTargets.STATE));
                    actor.attemptsTo(Enter.keyValues("\n").into(FormularioTargets.STATE));
                    break;
                case "city":
                    actor.attemptsTo(Enter.theValue(valor).into(FormularioTargets.CITY));
                    actor.attemptsTo(Enter.keyValues("\n").into(FormularioTargets.CITY));
                    break;
            }
        }
        actor.attemptsTo(Click.on(FormularioTargets.SUBMIT_BUTTON));
    }
}

