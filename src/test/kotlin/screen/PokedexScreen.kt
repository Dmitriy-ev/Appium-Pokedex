package screen

import core.AndroidMobileScreen
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import io.qameta.allure.Step
import org.openqa.selenium.support.PageFactory

class PokedexScreen(driver: AppiumDriver<MobileElement>): AndroidMobileScreen<MobileElement>(driver) {

    @AndroidFindBy(id = "dev.marcosfarias.pokedex:id/sd_main_fab")
    private val fab: MobileElement? = null

    @AndroidFindBy(accessibility = "Search")
    private val searchFab: MobileElement? = null

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView")
    private val searchText: MobileElement? = null

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    @Step("Клик по кнопке действий")
    fun clickFab(): PokedexScreen{
        fab!!.clickElement()
        return this
    }

    @Step("Открыть поиск")
    fun clickSearchFab(): PokedexScreen{
        searchFab!!.clickElement()
        return this
    }

    @Step("Проверка отображения строки с поиском")
    fun verifySearchText(message: String){
        searchText!!.verify(message)
    }

}