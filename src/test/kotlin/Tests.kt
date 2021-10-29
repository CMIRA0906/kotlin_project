

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import pages.HomePage
import java.util.concurrent.TimeUnit

class Tests {

    lateinit var driver: WebDriver
        private set

    @BeforeEach
    fun setup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        var chromeOptions = ChromeOptions()
        chromeOptions.addArguments("--incognito")
        chromeOptions.addArguments("--start-maximized")
        driver = ChromeDriver(chromeOptions)
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS)
        driver.get("https://google.com")


    }

    @Test
    fun searchWordInGoogle(){

       val homePage = HomePage(driver)
       homePage.seachSomething();
        Assertions.assertTrue(driver.title.equals("Google"),"Title is not right")

    }

    @AfterEach
    fun cleanUP(){
        driver.quit()
    }
}