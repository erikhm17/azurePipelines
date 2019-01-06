import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    static ChromeDriver driver = null;
    static WebDriverWait webDriverWait = null;

    @BeforeAll
    public static void SetUpBeforeAll() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "lib/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @BeforeEach
    void SetUpBeforeEach() throws InterruptedException {
        driver.get("https://seminario-3d83b.firebaseapp.com");
    }

    @Test
    void mainHomePage() {
        driver.get("https://seminario-3d83b.firebaseapp.com");
        webDriverWait = new WebDriverWait(driver,2); // espera hasta que cargue ???
        /* el main es del id que aparece en la pagina web del body,
        es el padre de todos*/
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("main")));
        // el nombre de la pestaña de la pagina de seminario tiene que ser "Seminario"
        Assertions.assertTrue(driver.getTitle().equals("Seminario"));

        // fail("Not yet implemented");
    }
    @Test
    void programPage() {
        driver.get("https://seminario-3d83b.firebaseapp.com/programa");
        webDriverWait = new WebDriverWait(driver,2); // espera hasta que cargue ???
        /* el main es del id que aparece en la pagina web del body,
        es el padre de todos*/
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("main")));
        // el nombre de la pestaña de la pagina de seminario tiene que ser "Seminario"
        Assertions.assertTrue(driver.getTitle().equals("Seminario"));

        // fail("Not yet implemented");
    }

    @AfterAll
    public static void cleanUp(){
        driver.quit();
    }
}