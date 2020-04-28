package de.deggers.demo.style

import javafx.scene.paint.Color.WHITE
import javafx.scene.paint.Color.YELLOW
import tornadofx.CssSelection
import tornadofx.Stylesheet
import tornadofx.multi


class LightStyle : Stylesheet(), StyleContract {

    init {
        rootSelector
        buttonSelector
    }

    override val rootSelector: CssSelection
        get() = root {
            backgroundColor = multi(WHITE)
        }

    override val buttonSelector: CssSelection
        get() = button {
            backgroundColor = multi(YELLOW)
        }
}