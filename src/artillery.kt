/**
 * Represents a building that can deal damage
 */
abstract class Artillery(health: Double, physicalSize: Double, var dps: Double, var attackRange: Double,
                         var attackSpeed: Double) : Building(health, physicalSize) {

    private var currentTarget: Troop? = null

    /**
     * Searches for the nearest target on the map. Only does this when current target is not set.
     * @param map The map being played on
     */
    open fun searchForTarget(map: Map) {
        if (currentTarget != null) {
            return
        }
        var nearestTarget: Troop? = null
        for (troop in map.deployedTroops) {
            if (this.calcDistToInteractable(troop) <= this.attackRange) {
                // Check to make sure nearestTarget isn't nearer
                if (nearestTarget != null) {
                    if (this.calcDistToInteractable(troop) >= this.calcDistToInteractable(nearestTarget)) {
                        continue
                    }
                }
                nearestTarget = troop
            }
        }
        this.currentTarget = nearestTarget
    }
}