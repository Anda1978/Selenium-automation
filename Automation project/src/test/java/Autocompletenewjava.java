

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocompletenewjava {
    public static void main (String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/andud/Downloads/chromedriver_win32/chromedriver.exe");
        //la linia 3 i-am spus sistemului unde sa gaseasca driverul
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");//Aici am deschis lincul specificat in paranteze
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
                                    //
        autocomplete.sendKeys("strada lalelelor nr5");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/table/tr/td[2]/button")).click();


        //Aici am creat un nou obiect al clasei chrome driver care se numeste driver si care are tipul de date webdriver.
    /* O variabila este o adresa de memorie la care sunt stocate informatii
    O functie reprezinta un set de instructiuni grupate sub un singur nume
    O clasa reprizinta un tipar care defineste atributele pe care trebuie sa le aibe un obiect si actiunile pe care poate sa le faca
    Un obiect este o instanta a unei clase adica o reprezentare reala creata pe baza tiparului definita in clasa
    Un tip de data este o proprietate a unei variabile sau functii care specifica ce informatie poate fi stocata in variabila sau returnata de catre functie
    Putem spune ca o functie returneaza ceva atunci cand trimite rezultatul actiunii pe care o face catre exterior
     */



    }
}
