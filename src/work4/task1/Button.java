package work4.task1;

import java.util.Arrays;

/**
 * Class that represents real button
 * @see ActionElement
 * @see ButtonState
 */
public class Button extends ActionElement{

    /**
     * Field that represents coordinates of button
     */
    private double[][] coords;

    /**
     * Field that represents colour of button
     */
    private String colour;

    /**
     * Field that represents text of button
     */
    private String text;

    /**
     * Field that represents state of button
     */
    private ButtonState state = ButtonState.UNTOUCHED;

    /**
     * Constructor that creates new button
     */
    public Button(Mediator mediator, double[][] coords, String colour, String text) {
        this.coords = coords;
        this.colour = colour;
        this.text = text;
        this.mediator = mediator;
    }

    /**
     * Method that establishes new mediator for element
     * @param mediator Parameter that represents new mediator
     */
    public void setMediator(Mediator mediator){
        this.mediator = mediator;

    }

    /**
     * Concrete method that sends messages and changes to mediator
     * @param message Parameter that represents text with information about author, filed before and after change
     * @param change Parameter that represents the changed value of field
     */
    @Override
    public void sendChange(String message, ElementsState change) {
        System.out.println(message);
        mediator.exchange(message, change);
    }

    /**
     * Concrete method that changes the value of the field
     * @param newState Parameter that represents new value of field
     */
    @Override
    public void changeState(ElementsState newState) {
        if (!checkState(newState) || isChanged(newState)){
            return;
        }
        ButtonState oldState = this.state;
        this.state = (ButtonState) newState;
        sendChange(getSendMessage(oldState, newState), newState);

    }

    /**
     * Method that forms a message for mediator
     * @param old Parameter that represents previous value of a field
     * @param next Parameter that represents new value of a field
     * @return Return that represents formed message
     */
    private String getSendMessage(Object old, Object next){
        return "Sender (%s): changed type from (%s) to (%s)".formatted(this.getClass().getSimpleName(), old, next);
    }

    /**
     * Method that check if state is state of a button
     * @param state Parameter that represent state to be checked
     * @return Return that represents true/false
     */
    private boolean checkState(ElementsState state){
        return state instanceof ButtonState;

    }

    /**
     * Method that check if previous state differs from new state
     * @param state Parameter that represent new state to be checked
     * @return Return that represents true/false
     */
    private boolean isChanged (ElementsState state){
        return this.state.equals(state);

    }
}
