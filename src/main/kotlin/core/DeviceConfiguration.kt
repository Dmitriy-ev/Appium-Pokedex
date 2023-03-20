package core.enums

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.AndroidMobileCapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL

object DeviceConfiguration {

    fun generateCapability(
        platformName: String,
        udid: String,
        appPath: String,
        appWaitActivity: String = "",
    ): DesiredCapabilities{
        val cap = DesiredCapabilities()
        cap.setCapability("platformName", platformName)
        cap.setCapability("udid", udid)
        cap.setCapability("app", appPath)
        cap.setCapability("deviceName", platformName)
        cap.setCapability("automationName", "UiAutomator2")
        cap.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, appWaitActivity)

        return cap
    }

    fun configDriver(appPath: String = ""): AppiumDriver<MobileElement>{
        return AndroidDriver(
            URL("http://localhost:4723/wd/hub"),
            generateCapability(
                platformName = "Android",
                udid = "emulator-5554",
                appPath = appPath,
                //appWaitActivity = ""
            )
        )
    }

}