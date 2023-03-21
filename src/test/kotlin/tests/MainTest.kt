package tests

import baseapps.AndroidBaseApp
import baseapps.BaseClass
import org.junit.jupiter.api.Test

class MainTest : BaseClass<AndroidBaseApp>() {

    @Test
    fun checkTitle() {
        val expectedMessage = "What Pokémon\n" +
                "are you looking for?"
        with(app) {
            aMainScreen.run {
                verifyTitle(expectedMessage)
            }
        }
    }
}