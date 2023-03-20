import core.enums.DeviceConfiguration
import core.enums.Platform
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import org.aspectj.lang.annotation.Before
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import java.net.MalformedURLException
import java.net.URL

class BaseClass<T :BaseApp> {
    var adriver: AppiumDriver<MobileElement>? = null
    lateinit var app: T

    @BeforeEach
    @Throws(MalformedURLException::class)
    fun setUp() {
        adriver = DeviceConfiguration.configDriver(
            appPath = "/Users/dmitrii.evmenov/Desktop/app-debug.apk"
        )
        app = BaseApp().createApp(adriver) as T
    }

    @AfterEach
    fun tearDown() {
        adriver?.quit()
    }


}