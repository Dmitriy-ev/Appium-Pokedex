import core.enums.Platform
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement

open class BaseApp {

    fun createApp(
        adriver: AppiumDriver<MobileElement>?,
    ): BaseApp {
        return AndroidBaseApp(adriver!!)
    }
}
