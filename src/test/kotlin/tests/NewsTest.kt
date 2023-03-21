package tests

import baseapps.AndroidBaseApp
import baseapps.BaseClass
import org.junit.jupiter.api.Test

class NewsTest : BaseClass<AndroidBaseApp>() {

    @Test
    fun checkNewsTitle() {
        val expectedMessage = "Pokémon Rumble Rush Arrives Sn"
        with(app) {
            aMainScreen
                .openNews()
            aNewsScreen
                .verifyNewsTitle(expectedMessage)
        }
    }

}