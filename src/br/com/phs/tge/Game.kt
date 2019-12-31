package br.com.phs.tge

class Game(private val gameTitle: String, private val gameWidth: Int, private val gameHeight: Int) {

    val handler = Handler(this)

}

class Handler(private val game: Game) {

}