package work4.task1;

/**
 * Abstract class for active graphic elements. Serves as abstraction for all class that can send messages and changes
 * @see GraphicElement
 * @see Button
 * @see Slider
 */
public abstract class ActionElement extends GraphicElement{

    /**
     * Abstract method that sends messages and changes to mediator
     * @param message Parameter that represents text with information about author, filed before and after change
     * @param change Parameter that represents the changed value of field
     */
    public abstract void sendChange(String message, ElementsState change);

    /**
     * Abstract method that changes the value of the field
     * @param newState Parameter that represents new value of field
     */
    public abstract void changeState(ElementsState newState);

}
