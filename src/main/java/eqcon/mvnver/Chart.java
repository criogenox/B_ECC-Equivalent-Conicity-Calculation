package eqcon.mvnver;
//

import java.io.FileNotFoundException;

import javafx.geometry.Side;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * @author Criogenox
 */
public class Chart {
    //
    public LineChart create0(double[] number, double[] numberr)
            throws FileNotFoundException {

        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Lateral Wheelset Displacement y [mm]");
        yAxis.setLabel("Right-Left Wheelset \u0394r [mm]");
        LineChart lineChart = new LineChart(xAxis, yAxis);
        lineChart.setId("dr");
        XYChart.Series series = new XYChart.Series();
        lineChart.setLegendSide(Side.TOP);
        series.setName("Original Data (EN15302)");
        //
        for (int i = 0; i < number.length; i++) {
            series.getData().add(new XYChart.Data(number[i], numberr[i]));
        }
        //        
        lineChart.getData().addAll(series);
        //      
        return lineChart;
    }

    //***
    //
    public LineChart create(double[] number, double[] numberr,
                            double[] number1, double[] number2,
                            double[] number3)
            throws FileNotFoundException {
        double ylimi = 0;
        double ylimf = 0.6;
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis(ylimi, ylimf, 0.1);
        xAxis.setLabel("Lateral Wheelset Displacement y [mm]");
        yAxis.setLabel("Equivalent Conicity - tan(\u03BB) [°]");
        LineChart lineChart = new LineChart(xAxis, yAxis);
        XYChart.Series series = new XYChart.Series();
        XYChart.Series series12 = new XYChart.Series();
        XYChart.Series series13 = new XYChart.Series();
        lineChart.setLegendSide(Side.TOP);
        series.setName("Calculated Conicity (EN15302 data)");
        series12.setName("Upper Limit Tolerances (maximum)");
        series13.setName("Lower Limit Tolerances (minimum)");
        //
        for (int i = 0; i < number.length; i++) {
            series.getData().add(new XYChart.Data(number[i], numberr[i]));
        }
        for (int i = 0; i < number1.length; i++) {
            series12.getData().add(new XYChart.Data(number1[i], number2[i]));
        }
        for (int i = 0; i < number1.length; i++) {
            series13.getData().add(new XYChart.Data(number1[i], number3[i]));
        }
        //        
        lineChart.getData().addAll(series, series12, series13);
        //
        return lineChart;
    }

    //***
    //
    public LineChart create2(double[] number, double[] numberr, double px, double py)
            throws FileNotFoundException {
        double ylimi = 0;
        double ylimf = 0.6;
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis(ylimi, ylimf, 0.1);
        xAxis.setLabel("Lateral Wheelset Displacement y [mm]");
        yAxis.setLabel("Equivalent Conicity - tan(" + "\u03BB" + ") [°]");
        LineChart lineChart = new LineChart(xAxis, yAxis);
        lineChart.setId("con");
        XYChart.Series series = new XYChart.Series();
        XYChart.Series seriesr = new XYChart.Series();
        XYChart.Series seriesp = new XYChart.Series();
        lineChart.setLegendSide(Side.TOP);
        series.setName("Calculated Conicity");
        seriesr.setName("By Specification");
        seriesp.setName("Nominal (dy=3mm)");
        //********************
        for (int i = 0; i < number.length; i++) {
            series.getData().add(new XYChart.Data(number[i], numberr[i]));
        }
        lineChart.getData().addAll(series);
        //********************
        double[] pr = {0, py, px, py, px, 0};
        int n = 0;
        while (n < 5) {
            seriesr.getData().add(new XYChart.Data(pr[n], pr[n + 1]));
            n = n + 2;
        }
        lineChart.getData().add(seriesr);
        //*******************
        seriesp.getData().add(new XYChart.Data(px, py));
        lineChart.getData().addAll(seriesp);
        //        
        return lineChart;
    }
    //***
}
