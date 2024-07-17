package co.konecta.capacitacion.Interacciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioPage {
    public static final Target firstName = Target.the("Campo para llenar el nombre del usuario").located(By.id("firstName"));
    public static final Target lastName = Target.the("Campo para llenar el apellido del usuario").located(By.xpath("//*[@id='lastName']"));
    public static final Target email = Target.the("Campo para llenar el Email o correo del usuario").located(By.cssSelector("[placeholder='name@example.com']"));


}
