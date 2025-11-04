package work4.task1;

/**
 * Main class;
 * @author Artem Melnyk
 */
public class App1 {

    /**
     * Called when program starts. Create instances of classes and then calls their methods;
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        double[][] buttonCoords = {{2,4},{2,5}};
        double[][] panelCoords = {{0,-4},{3,16}};
        double[][] textboxCoords = {{-5,-6},{7,18}};

        Mediator mediator1 = new GraphicControlCentre();
        Mediator mediator2 = new GraphicControlCentre();
        Button button = new Button(mediator1, buttonCoords, "white", "Press me");
        Slider slider = new Slider(mediator2,"grey", SliderPosition.POS_X);
        Panel panel = new Panel(mediator1, panelCoords, "yellow", "Notes");
        Textbox textbox = new Textbox(mediator2, textboxCoords, "grey", "Before change");

        System.out.println(panel);
        System.out.println();
        mediator1.setActionElement(button);
        mediator1.setPassiveElement(panel);
        button.changeState(ButtonState.TOUCHED);
        System.out.println(panel);
        System.out.println();
        button.changeState(ButtonState.UNTOUCHED);
        System.out.println(panel);

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(textbox);
        System.out.println();
        mediator2.setActionElement(slider);
        mediator2.setPassiveElement(textbox);
        slider.changeState(SliderPosition.POS_Y);
        System.out.println(textbox);
        System.out.println();
        button.setMediator(mediator2);
        mediator2.setActionElement(button);
        button.changeState(ButtonState.HOLDED);
        System.out.println(textbox);

    }
}
