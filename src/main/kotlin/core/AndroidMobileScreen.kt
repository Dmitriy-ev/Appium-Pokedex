package core

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import org.junit.jupiter.api.fail

abstract class AndroidMobileScreen<T>(val driver: AppiumDriver<MobileElement>?) {

    fun MobileElement.clickElement() {
         this.click()
    }

    fun MobileElement.validate(expectedText: String){
        if (expectedText != this.text) {
            fail(message = "${this.text} is not equal $expectedText")
        }
    }

}