package work4.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that represents table with data
 */
public class DataTable {

    /**
     * Field that represent name of the table
     */
    private String name;

    /**
     * Field that represent data of the table
     */
    private List<List<Double>> data;

    /**
     * Field that represent current chart representation of the table
     */
    private ChartStrategy currentStrategy;

    /**
     * Constructor that creates new table instance
     */
    public DataTable(String name, List<List<Double>> data, ChartStrategy currentStrategy) {
        this.name = name;
        this.data = data;
        this.currentStrategy = currentStrategy;
    }

    /**
     * Method that sets new chart strategy
     * @param chartStrategy Parameter that represents new chart strategy
     */
    public void setChartStrategy(ChartStrategy chartStrategy){
        currentStrategy = chartStrategy;

    }

    /**
     * Method that displays table using current chart strategy
     */
    public void display(){
        currentStrategy.displayChart(this);

    }

    /**
     * Method that allows to add new data to the table
     * @param row Parameter that represents the row
     * @param column Parameter that represents the column
     * @param value Parameter that represents the value
     */
    public void addData(int row, int column, double value){
        while (data.size() <= row) {
            data.add(new ArrayList<>());
        }
        List<Double> targetRow = data.get(row);

        while (targetRow.size() <= column) {
            targetRow.add(0.0);
        }
        targetRow.set(column, value);

    }

    /**
     * Method that returns name of the table
     * @return Return that represents name of the table
     */
    public String getName() {
        return name;

    }
}
