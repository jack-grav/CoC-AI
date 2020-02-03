import java.util.*
import kotlin.concurrent.timer
import kotlin.concurrent.timerTask

/**
 * class for making the map and how to do stuff on the map
 */
class Map {
    val buildings = mutableListOf<Building>()
    val traps = mutableListOf<Trap>()
    val troops = mutableListOf<Troop>()
    val deployedTroops = mutableListOf<Troop>()

    val width = 44 * 100
    val height = 44 * 100

    var endBattleTimerTask = object : TimerTask() {
        override fun run() {
            endBattle()
        }
    }

    var beginBattleTimerTask = object : TimerTask() {
        override fun run() {
            beginBattle()
        }
    }

    fun simulateBattle() {
        val preBattleTimer = Timer("pre-battle timer").schedule(beginBattleTimerTask, 10000L) as Timer
        while (deployedTroops.size == 0) {
        }
        preBattleTimer.cancel()
        beginBattle()
    }

    fun beginBattle() {
        val battleTimer = Timer("battle timer").schedule(endBattleTimerTask, 180000L) as Timer
        while (troops.size >= 0 || buildings.size >= 0) {
            // TODO: Simulate the battle
        }
        battleTimer.cancel()
        endBattle()
    }

    fun endBattle() {
        // TODO: End the battle (whatever that entails...not sure yet)
    }
}