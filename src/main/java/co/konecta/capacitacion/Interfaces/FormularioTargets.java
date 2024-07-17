package co.konecta.capacitacion.Interfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioTargets {
    public static final Target FIRST_NAME = Target.the("First Name").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Last Name").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Email").located(By.id("userEmail"));
    public static final Target GENDER = Target.the("Gender").locatedBy("//label[text()='{0}']");
    public static final Target USER_NUMBER = Target.the("User Number").located(By.id("userNumber"));
    public static final Target DATE_OF_BIRTH = Target.the("Date of Birth").located(By.id("dateOfBirthInput"));
    public static final Target MONTH_SELECT = Target.the("Month Select").located(By.className("react-datepicker__month-select"));
    public static final Target YEAR_SELECT = Target.the("Year Select").located(By.className("react-datepicker__year-select"));
    public static final Target DATE = Target.the("Date").locatedBy("//div[text()='{0}']");
    public static final Target SUBJECTS_INPUT = Target.the("Subjects Input").located(By.id("subjectsInput"));
    public static final Target HOBBIES = Target.the("Hobbies").locatedBy("//label[text()='{0}']");
    public static final Target PICTURE_UPLOAD = Target.the("Picture Upload").located(By.id("uploadPicture"));
    public static final Target CURRENT_ADDRESS = Target.the("Current Address").located(By.id("currentAddress"));
    public static final Target STATE = Target.the("State").located(By.id("react-select-3-input"));
    public static final Target CITY = Target.the("City").located(By.id("react-select-4-input"));
    public static final Target SUBMIT_BUTTON = Target.the("Submit Button").located(By.id("submit"));
    public static final Target example_modal = Target.the("example-modal-sizes-title-lg").located(By.id("example-modal-sizes-title-lg"));

}
