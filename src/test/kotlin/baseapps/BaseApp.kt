package baseapps

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement

abstract class BaseApp {

    abstract fun createApp(adriver: AppiumDriver<MobileElement>?): AndroidBaseApp
}
