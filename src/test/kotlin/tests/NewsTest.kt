package tests

import baseapps.BaseClass
import org.junit.jupiter.api.Test

class NewsTest : BaseClass() {

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