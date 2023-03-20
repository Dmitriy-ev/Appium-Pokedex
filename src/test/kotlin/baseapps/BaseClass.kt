package baseapps

import core.DeviceConfiguration
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import java.net.MalformedURLException
import java.util.concurrent.TimeUnit

open class BaseClass<T : BaseApp> {
    var adriver: AppiumDriver<MobileElement>? = null
    lateinit var app: T

    @BeforeEach
    @Throws(MalformedURLException::class)
    fun setUp() {
        adriver = DeviceConfiguration.configDriver(
            appPath = "/Users/dmitrii.evmenov/Desktop/app-debug.apk"
        )
        adriver!!.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)
        app = BaseApp().createApp(adriver) as T
    }

    @AfterEach
    fun tearDown() {
        adriver?.quit()
    }


}