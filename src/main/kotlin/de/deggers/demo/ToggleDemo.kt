package de.deggers.demo

import de.deggers.demo.style.DarkStyle
import de.deggers.demo.style.LightStyle
import tornadofx.*

class ToggleDemo : View() {

    override val root = borderpane {
        paddingAll = 20
        prefWidth = 400.00
        prefHeight = 200.00
        center = buttonbar {
            button("Dark").action {
                removeStylesheet(LightStyle::class)
                importStylesheet(DarkStyle::class)
                reloadStylesheets()
            }
            button("Light").action {
                removeStylesheet(DarkStyle::class)
                importStylesheet(LightStyle::class)
                reloadStylesheets()
            }
        }
    }
}