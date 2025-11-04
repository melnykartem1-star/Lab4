package work4.task2;

/**
 * Class that represents line chart
 */
public class LineChartStrategy implements ChartStrategy{

    /**
     * Concrete method that display chart using line chart strategy
     * @param table Parameter that represents table of the chart
     */
    @Override
    public void displayChart(DataTable table) {
        System.out.printf("For %s table - line chart\n", table.getName());

    }
}
