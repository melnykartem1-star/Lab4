package work4.task1;

/**
 * Interface of a mediator. Represent abstraction of graphic control centre
 */
public interface Mediator {

    /**
     * Abstract method that receive changes from active elements and redirect them to passive elements
     * @param message Parameter that represents text with information about author, filed before and after change
     * @param change Parameter that represents the changed value of field
     */
    void exchange(String message, ElementsState change);

    /**
     * Abstract method that establishes current active element for change sending
     * @param element Parameter that represents active element
     */
    void setActionElement(ActionElement element);

    /**
     * Abstract method that establishes current passive element for change receiving
     * @param element Parameter that represents passive element
     */
    void setPassiveElement(PassiveElement element);


}
