package br.com.phs.tge.input

class KeyManager {

    var keys: ArrayList<Boolean> = ArrayList(256)

    var up: Boolean = false
    var left: Boolean = false
    var right: Boolean = false
    var down: Boolean = false
    var actionA: Boolean = false
    var actionB: Boolean = false
    var actionC: Boolean = false
    var actionD: Boolean = false
    var l1: Boolean = false
    var l2: Boolean = false
    var r1: Boolean = false
    var r2: Boolean = false

    fun tick() {

        var up = keys[ControlButtons.UP.value]
        var left = keys[ControlButtons.LEFT.value]
        var right = keys[ControlButtons.RIGHT.value]
        var down = keys[ControlButtons.DOWN.value]
        var actionA = keys[ControlButtons.ACTION_A.value]
        var actionB = keys[ControlButtons.ACTION_B.value]
        var actionC = keys[ControlButtons.ACTION_C.value]
        var actionD = keys[ControlButtons.ACTION_D.value]
        var l1 = keys[ControlButtons.L1.value]
        var l2 = keys[ControlButtons.L2.value]
        var r1 = keys[ControlButtons.L3.value]
        var r2 = keys[ControlButtons.L4.value]

    }

    fun keyPressed(keyCode: Int) {
        keys[keyCode] = true
    }

    fun keyReleased(keyCode: Int) {
        keys[keyCode] = false
    }

}