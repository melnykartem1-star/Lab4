package work4.task2;

/**
 * Interface that represents chart strategies
 * @see BarChartStrategy
 * @see PieChartStrategy
 * @see LineChartStrategy
 */
public interface ChartStrategy {

    /**
     * Abstract method that display chart using current strategy
     * @param table Parameter that represents table of the chart
     */
    void displayChart(DataTable table);

}
