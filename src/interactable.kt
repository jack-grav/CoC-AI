import kotlin.math.sqrt
import kotlin.math.pow

/**
 * Represents anything the AI can interact with. Troops, buildings, etc
 */
abstract class Interactable {
    private var x = 0 as Double
    private var y = 0 as Double

    /**
     * Calculates the distance between two interactable objects.
     * @param otherInteractable The other interactable object
     */
    open fun calcDistToInteractable(otherInteractable: Interactable): Double {
        return sqrt((this.x - otherInteractable.x).pow(2) + (this.y - otherInteractable.y).pow(2))
    }
}