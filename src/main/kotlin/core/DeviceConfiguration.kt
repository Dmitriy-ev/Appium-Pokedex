package core

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL

object DeviceConfiguration {

    fun generateCapability(
        platformName: String,
        udid: String,
        appPath: String,
        deviceName: String = "",
        appWaitActivity: String = "",
    ): DesiredCapabilities{
        val cap = DesiredCapabilities()
//        cap.setCapability("platformName", platformName)
//        cap.setCapability("deviceName", platformName)
//        cap.setCapability("automationName", "UiAutomator2")
//        cap.setCapability("app", appPath)
//        cap.setCapability("udid", udid)
//        cap.setCapability("adbExecTimeout", 60000)
//        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60")
        cap.setCapability("platformName", platformName);
        cap.setCapability("automationName", "uiautomator2");
        cap.setCapability("app", "/Users/dmitrii.evmenov/Desktop/app-debug.apk");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("ensureWebviewsHavePages", true);
        cap.setCapability("nativeWebScreenshot", true);
        cap.setCapability("newCommandTimeout", 3600);
        cap.setCapability("connectHardwareKeyboard", true);
        return cap
    }

    fun configDriver(appPath: String = ""): AppiumDriver<MobileElement>{
        return AndroidDriver(
            URL("http://127.0.0.1:4723/wd/hub"),
            generateCapability(
                platformName = "Android",
                udid = "emulator-5554",
                appPath = appPath,
                appWaitActivity = "dev.marcosfarias.pokedex.*"
            )
        )
    }

}