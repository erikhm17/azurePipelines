import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "lib/webdrivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        /**
         * Para la navegacion de las rutas
         * */


        driver.get("https://seminario-3d83b.firebaseapp.com/inicio");
        Thread.sleep(1000);
        driver.get("https://seminario-3d83b.firebaseapp.com/programa");
        Thread.sleep(1000);
        driver.get("https://seminario-3d83b.firebaseapp.com/taller");
        Thread.sleep(1000);
        driver.get("https://seminario-3d83b.firebaseapp.com/invitacion");
        Thread.sleep(1000);
        driver.get("https://seminario-3d83b.firebaseapp.com/comite");
        Thread.sleep(1000);
        driver.get("https://seminario-3d83b.firebaseapp.com/lugar");

        /**
         * Para textos, inputs y botones
         * */
       /* driver.get("https://seminario-3d83b.firebaseapp.com/registro");
        WebElement buttonRegister = driver.findElementByClassName("btn-outline-info");
        buttonRegister.click();
        Thread.sleep(1000);
        WebElement searchElement = driver.findElementById("dni");
        searchElement.sendKeys("47126153");*/

        /** Para Search Text and Submit*/


        // Thread.sleep(3000);
        //driver.quit();
    }
}
