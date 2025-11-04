package work4.task1;

import java.util.Arrays;

/**
 * Class that represents real panel
 * @see PassiveElement
 */
public class Panel extends PassiveElement{

    /**
     * Field that represents coordinates of panel
     */
    private double[][] coords;

    /**
     * Field that represents colour of panel
     */
    private String colour;

    /**
     * Field that represents text of panel
     */
    private String text;

    /**
     * Constructor that creates new panel
     */
    public Panel(Mediator mediator, double[][] coords, String colour, String text) {
        this.coords = coords;
        this.colour = colour;
        this.text = text;
        this.mediator = mediator;
    }

    /**
     * Concrete method that receives messages and changes from mediator
     * @param message Parameter that represents text with information about author, filed before and after change
     * @param change Parameter that represents the changed value of field
     */
    @Override
    public void receiveChanges(String message, ElementsState change) {
        System.out.println(message);
        handleChange(change);
    }

    /**
     * Method that changes value of fields according to the data received from mediator
     * @param change Parameter that represents data received from mediator
     */
    private void handleChange(ElementsState change){

        switch (change){
            case ButtonState.UNTOUCHED -> this.colour = "white";
            case ButtonState.TOUCHED -> this.colour = "grey";
            case ButtonState.HOLDED -> this.text = "New text";
            default -> System.out.println("Something goes wrong");
        }
    }

    /**
     * Method that establishes new mediator for element
     * @param mediator Parameter that represents new mediator
     */
    public void setMediator(Mediator mediator){
        this.mediator = mediator;

    }

    /**
     * Method that returns formatted text with information about fields of the class
     * @return Return that represents formatted text
     */
    @Override
    public String toString() {
        return "Panel{" +
                "coords=" + Arrays.deepToString(coords) +
                ", colour='" + colour + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
