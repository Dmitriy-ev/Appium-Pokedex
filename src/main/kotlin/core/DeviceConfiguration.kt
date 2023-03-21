package core

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL

object DeviceConfiguration {

    fun generateCapability(
        platformName: String,
        udid: String,
        appPath: String,
        deviceName: String = "",
    ): DesiredCapabilities{
        val cap = DesiredCapabilities()
        cap.setCapability("platformName", "Android")
        cap.setCapability("automationName", "uiautomator2")
        cap.setCapability("app", "/Users/dmitrii.evmenov/Desktop/app-debug.apk")
        cap.setCapability("udid", "emulator-5554")
        return cap
    }

    fun configDriver(appPath: String = ""): AppiumDriver<MobileElement>{
        return AndroidDriver(
            URL("http://127.0.0.1:4723/wd/hub"),
            generateCapability(
                platformName = "Android",
                udid = "emulator-5554",
                appPath = appPath,
            )
        )
    }

}