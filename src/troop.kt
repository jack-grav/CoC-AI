/**
 * A class that represents any troops that can be deployed in Clash of Clans
 */
abstract class Troop(var health: Double, var speed: Double, var dps: Double, var campSize: Double,
                     var physicalSize: Double, var attackSpeed: Double) : Interactable() {

}