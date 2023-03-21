package screen

import baseapps.BaseClass
import core.AndroidMobileScreen
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import io.qameta.allure.Step
import org.openqa.selenium.support.PageFactory

class NewsScreen(driver: AppiumDriver<MobileElement>): AndroidMobileScreen<MobileElement>(driver) {


    @AndroidFindBy(id = "dev.marcosfarias.pokedex:id/txtNewsTitle")
    private val newsTitle: MobileElement? = null

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }
    @Step("Отображение заголовка новостей")
    fun verifyNewsTitle(message: String){
        newsTitle!!.verify(message)
    }



}