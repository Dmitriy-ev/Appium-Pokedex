package baseapps

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import screen.MainScreen
import screen.NewsScreen

class AndroidBaseApp(val driver: AppiumDriver<MobileElement>): BaseApp() {

    val aMainScreen = MainScreen(driver)
    val aNewsScreen = NewsScreen(driver)
}