package work4.task1;

/**
 * Class that represents mediator. It takes data from one class and sends it to another
 * @see Mediator
 */
public class GraphicControlCentre implements Mediator{

    /**
     * Field that represents active element
     */
    private ActionElement actionElement;

    /**
     * Field that represents passive element
     */
    private PassiveElement passiveElement;

    /**
     * Concrete method that receive changes from active elements and redirect them to passive elements
     * @param message Parameter that represents text with information about author, filed before and after change
     * @param change Parameter that represents the changed value of field
     */
    @Override
    public void exchange(String message, ElementsState change) {
        if(actionElement instanceof Button){
            passiveElement.receiveChanges(getReceiveMessage(message, passiveElement.getClass().getSimpleName(), change), change);

        } else if (actionElement instanceof Slider && passiveElement instanceof Textbox textbox) {
            textbox.receiveChanges(getReceiveMessage(message, passiveElement.getClass().getSimpleName(), change), change);

        } else {
            System.out.println("This elements can't exchange");
        }

    }

    /**
     * Concrete method that establishes current active element for change sending
     * @param element Parameter that represents active element
     */
    @Override
    public void setActionElement(ActionElement element){
        this.actionElement = element;
    }

    /**
     * Concrete method that establishes current passive element for change receiving
     * @param element Parameter that represents passive element
     */
    @Override
    public void setPassiveElement(PassiveElement element){
        this.passiveElement = element;
    }

    /**
     * Method that forms a message for receiver
     * @param message Parameter that represents text with information about author, filed before and after change
     * @param receiver Parameter that represents name of the class of the receiver
     * @param change Parameter that represents the changed value of field
     * @return Return that represents formed message
     */
    private String getReceiveMessage(String message, String receiver, Object change){
        return "Receiver (%s) { %s }".formatted(receiver, message);

    }

}
