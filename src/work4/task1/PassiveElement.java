package work4.task1;

/**
 * Abstract class for passive graphic elements. Serves as abstraction for all class that can receive messages and changes
 * @see GraphicElement
 * @see Panel
 * @see Textbox
 */
public abstract class PassiveElement extends GraphicElement{

    /**
     * Abstract method that receives messages and changes from mediator
     * @param message Parameter that represents text with information about author, filed before and after change
     * @param change Parameter that represents the changed value of field
     */
    public abstract void receiveChanges(String message, ElementsState change);

}
