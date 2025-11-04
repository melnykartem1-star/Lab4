package work4.task1;

/**
 * Class that represents real slider
 * @see ActionElement
 * @see SliderPosition
 */
public class Slider extends ActionElement{

    /**
     * Field that represents colour of slider
     */
    private String colour;

    /**
     * Field that represents state of slider
     */
    private SliderPosition state;

    /**
     * Constructor that creates new slider
     */
    public Slider(Mediator mediator, String colour, SliderPosition state) {
        this.state = state;
        this.colour = colour;
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
        if (!checkState(newState)){
            return;
        }
        SliderPosition oldState = this.state;
        this.state = (SliderPosition) newState;
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
     * Method that check if state is state of a slider
     * @param state Parameter that represent state to be checked
     * @return Return that represents true/false
     */
    private boolean checkState(ElementsState state){
        return state instanceof SliderPosition;

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
