package screen

import core.AndroidMobileScreen
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import io.qameta.allure.Step
import org.openqa.selenium.support.PageFactory

class MainScreen(driver: AppiumDriver<MobileElement>): AndroidMobileScreen<MobileElement>(driver) {

    @AndroidFindBy(id = "dev.marcosfarias.pokedex:id/search_title")
    private val title: MobileElement? = null

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[2]/android.widget.RelativeLayout[1]")
    private val newsWidget: MobileElement? = null

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.RelativeLayout[1]")
    private val item: MobileElement? = null

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    @Step("Отображение заголовка на главном экране")
    fun verifyTitle(message: String): MainScreen {
        title!!.verify(message)
        return this
    }
    @Step("Переход к экрану новостей")
    fun openNews(){
        newsWidget!!.clickElement()
    }
    @Step("Переход к списку покемонов")
    fun openPokedex(){
        item!!.clickElement()
    }

}