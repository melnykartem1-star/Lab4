package work4.task2;

/**
 * Class that represents pie chart
 */
public class PieChartStrategy implements ChartStrategy{

    /**
     * Concrete method that display chart using pie chart strategy
     * @param table Parameter that represents table of the chart
     */
    @Override
    public void displayChart(DataTable table) {
        System.out.printf("For %s table - pie chart\n", table.getName());

    }
}
