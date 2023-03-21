package tests

import baseapps.BaseClass
import org.junit.jupiter.api.Test

class PokedexTest : BaseClass() {

    @Test
    fun openSearchBar() {
        val expextedText = "Search Pokemon, Move, Ability, etc"
        with(app) {
            aMainScreen
                .openPokedex()
            aPokedexScreen
                .clickFab()
                .clickSearchFab()
                .verifySearchText(expextedText)
        }
    }
}