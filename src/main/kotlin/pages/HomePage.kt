package pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class HomePage(private val driver : WebDriver) {

    @FindBy(name = "q" )
    private val searchBox : WebElement? =null;

    init {
        PageFactory.initElements(driver,this)

    }

    fun seachSomething(){
        searchBox?.sendKeys("Hola CR")

    }
}