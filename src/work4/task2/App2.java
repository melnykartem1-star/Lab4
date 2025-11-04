package work4.task2;

import java.util.List;

/**
 * Main class;
 * @author Artem Melnyk
 */
public class App2 {

    /**
     * Called when program starts. Create instances of classes and then calls their methods;
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        List<List<Double>> data = List.of(
                List.of(1.0, 2.0, 3.0),
                List.of(9.0, -4.0, 0.0),
                List.of(3.0, 2.0),
                List.of(1.0)
        );

        ChartStrategy barChart = new BarChartStrategy();
        ChartStrategy pieChart = new PieChartStrategy();
        ChartStrategy lineChart  = new LineChartStrategy();
        DataTable dataTable1 = new DataTable("Random", data, barChart);
        DataTable dataTable2 = new DataTable("Another", data, pieChart);

        dataTable1.display();

        dataTable1.setChartStrategy(pieChart);
        dataTable1.display();

        dataTable1.setChartStrategy(lineChart);
        dataTable1.display();

        dataTable2.display();

        dataTable2.setChartStrategy(barChart);
        dataTable2.display();

    }
}
