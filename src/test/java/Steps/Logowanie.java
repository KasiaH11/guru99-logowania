package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logowanie {

    WebDriver driver;

    @Given("Uzytkownik otwiera przegldarke")
    public void uzytkownik_otwiera_przegladarke(){
        System.out.println("Krok 1 - Uzytkownik otwiera przegldarke");
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
    }
    @Given("Uzytkownik wpisuje adres strony internetowej")
    public void uzytkownik_wpisuje_adres_strony_internetowej() {
        System.out.println("Krok 2 - Uzytkownik wpisuje adres strony internetowej");
        driver.navigate().to("https://demo.guru99.com/v4/index.php");
    }
    @When("Uzytkownik wpisuje poprawny User-ID")
    public void uzytkownik_wpisuje_poprawny_user_id() {
        System.out.println("Krok 3 - Uzytkownik wpisuje poprawny User-ID");
        driver.findElement(By.name("uid")).sendKeys("mngr472004");
    }
    @When("Uzytkownik wpisuje porawny Password")
    public void uzytkownik_wpisuje_porawny_password() {
        System.out.println("Krok 4 - Uzytkownik wpisuje porawny Password");
        driver.findElement(By.name("password")).sendKeys("ydehYre");
    }
    @When("Uzytkownik klika w przycisk zatwierdzajacy")
    public void uzytkownik_klika_w_przycisk_zatwierdzający() {
        System.out.println("Krok 5 - Uzytkownik klika w przycisk zatwierdzajacy");
        driver.findElement(By.id("save")).click();
        driver.findElement(By.name("btnLogin")).click();

    }
    @Then("Uzytkownik zostaje poprawnie zalogowany do aplikacji")
    public void uzytkownik_zostaje_poprawnie_zalogowany_do_aplikacji() {
        System.out.println("Krok 6 - Uzytkownik zostaje poprawnie zalogowany do aplikacji");
        Assert.assertEquals("https://demo.guru99.com/v4/manager/Managerhomepage.php",driver.getCurrentUrl());
    }
}
