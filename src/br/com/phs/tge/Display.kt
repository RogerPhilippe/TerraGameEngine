package br.com.phs.tge

import java.awt.Canvas
import java.awt.Dimension
import javax.swing.JFrame

class Display(private val gameTitle: String, private val gameWidth: Int, private val gameHeight: Int ) {

    init {

        val dimension = Dimension(gameWidth, gameHeight)

        val canvas = Canvas().apply {
            preferredSize = dimension
            maximumSize = dimension
            minimumSize = dimension
            isFocusable = false
        }

        val jFrame = JFrame().apply {
            title = gameTitle
            setSize(gameWidth, gameHeight)
            defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            isResizable = false
            setLocationRelativeTo(null)
            isVisible = true
            add(canvas)
            pack()
        }

    }

}