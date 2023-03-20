package screen

import baseapps.AndroidBaseApp
import core.AndroidMobileScreen
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.By
import org.openqa.selenium.support.PageFactory
import kotlin.test.assertEquals

class MainScreen(driver: AppiumDriver<MobileElement>): AndroidMobileScreen<MobileElement>(driver) {

    @AndroidFindBy(id = "dev.marcosfarias.pokedex:id/search_title")
    private val title: MobileElement? = null

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[2]/android.widget.RelativeLayout[1]")
    private val newsWidget: MobileElement? = null


    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    fun validateTitle(message: String): MainScreen {
        title!!.validate(message)
        return this
    }

    fun clickNews(): NewsScreen{
        newsWidget!!.clickElement()
        return NewsScreen(driver!!)
    }

}