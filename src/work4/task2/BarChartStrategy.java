package work4.task2;

/**
 * Class that represents bar chart
 */
public class BarChartStrategy implements ChartStrategy{

    /**
     * Concrete method that display chart using bar chart strategy
     * @param table Parameter that represents table of the chart
     */
    @Override
    public void displayChart(DataTable table) {
        System.out.printf("For %s table - bar chart\n", table.getName());

    }
}
