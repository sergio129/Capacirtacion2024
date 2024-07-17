package co.konecta.capacitacion.StepsDefinitions;

import co.konecta.capacitacion.Preguntas.VerifyFormSubmission;
import co.konecta.capacitacion.Tareas.FillForm;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.List;

import static co.konecta.capacitacion.Interfaces.FormularioTargets.example_modal;
import static net.serenitybdd.screenplay.actions.Hit.the;


public class FormularioSteps {
    private final Actor actor = Actor.named("Usuario");

    private WebDriver driver;

    @Before
    public void setUp() {

        actor.can(BrowseTheWeb.with(driver));
    }


    @Given("que estoy en la página del formulario de práctica")
    public void que_estoy_en_la_pagina_del_formulario_de_practica() {
        actor.attemptsTo(Open.url("https://demoqa.com/automation-practice-form"));
    }

    @Then("el formulario se envía correctamente")
    public void el_formulario_se_envia_correctamente() {
        // Aquí puedes agregar las verificaciones necesarias para asegurarte de que el formulario se envió correctamente
        actor.attemptsTo(VerifyFormSubmission.isVisible());
        // Cerrando el navegador
    }

    @When("Lleno el formulario con los siguientes datos")
    public void llenoElFormularioConLosSiguientesDatos(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        // Validar que no hay valores nulos
        for (Map<String, String> row : data) {
            if (row.containsValue(null)) {
                throw new IllegalArgumentException("One of the values in the form data is null: " + row);
            }
        }

        actor.attemptsTo(FillForm.withData(data));
}
}
