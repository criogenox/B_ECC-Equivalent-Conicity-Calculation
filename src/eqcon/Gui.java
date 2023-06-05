package eqcon;
//
import java.io.FileNotFoundException;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
/**
 *
 * @author  Criogenox
 */
public class Gui extends Application {
    //
    public static void main(String[] args) {
        Application.launch(args);
    }
    // Declaration of variables' types
    Label title, subtitle, gendata, footnote,
          E1,E2,E3,E4,E5,E6,E7,E8,E9,
          sep, sep1;
    RadioButton rB1, rB2, rB3, rB4, rB5, rB6, rB7, rB8, rB9;
    boolean btn1st;
    int N, cas;
    double[] dr, yi0; double[][] bench, out;
    ToggleGroup group;
    Button btn1, btn2, btn3; 
    HBox titleinfo, gendatainfo, btns1, btns2, footnoteinfo;
    LineChart scChart, drChart, conChart;
    Tab tab0, tab1, tab3; 
    //
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Railway applications — Equivalent conicity");
        
        // Instantiation
	title = new Label("""
                            EN15302:2008+A1:2010
                          ****** Testing Cases ******""");
	title.setPrefWidth(250);
        title.setAlignment(Pos.CENTER);
        title.setStyle("-fx-font-weight: bold");
        title.setFont(new Font("SansSerif", 14));
        //
        titleinfo = new HBox(5,title); 
        titleinfo.setAlignment(Pos.CENTER);
        titleinfo.setPadding(new Insets(0, 0, 0, 0));
        titleinfo.setBackground(new Background(new BackgroundFill
        (Color.rgb(153,204,255), new CornerRadii(10), 
                            new Insets(0))));
        titleinfo.setEffect(new DropShadow(1, Color.GRAY));
        //
        footnote = new Label("""
                             Select a case to continue""");
	footnote.setPrefWidth(250);
        footnote.setAlignment(Pos.CENTER);
        footnote.setStyle("-fx-font-weight: bold");
        footnote.setFont(new Font("SansSerif", 14));
        //
        footnoteinfo = new HBox(5,footnote);  
        footnoteinfo.setAlignment(Pos.CENTER);
        footnoteinfo.setPadding(new Insets(0, 0, 0, 0));
        footnoteinfo.setBackground(new Background(new BackgroundFill
        (Color.rgb(253,200,75), new CornerRadii(10), 
                            new Insets(0))));
        footnoteinfo.setEffect(new DropShadow(1, Color.GRAY));
        //
        //
        gendata = new Label("""
                            Wheel profiles: R-UIC 519-A/B/H/I
                            Rail profile: S-UIC 519-A
                            Gauge: 1435.16 mm
                            Wheels diameter: 920 mm""");
	gendata.setPrefWidth(250);
        gendata.setAlignment(Pos.CENTER);
        gendata.setStyle("-fx-font-weight: bold");
        gendata.setFont(new Font("SansSerif", 14));
        //
        gendatainfo = new HBox(5,gendata);  
        gendatainfo.setAlignment(Pos.CENTER);
        gendatainfo.setPadding(new Insets(0, 0, 0, 0));
        gendatainfo.setBackground(new Background(new BackgroundFill
        (Color.rgb(220,220,220), new CornerRadii(10), 
                            new Insets(0))));
        gendatainfo.setEffect(new DropShadow(1, Color.GRAY));
        //
        sep = new Label(" *********************************** ");
	sep.setPrefWidth(250);
        sep.setAlignment(Pos.CENTER);
        sep.setStyle("-fx-font-weight: bold");
        sep.setFont(new Font("SansSerif", 14));
        //
        subtitle = new Label("Annex E - Calculation Reference");
	subtitle.setPrefWidth(250);
        subtitle.setAlignment(Pos.CENTER);
        subtitle.setStyle("-fx-font-weight: bold");
        subtitle.setFont(new Font("SansSerif", 14));
        //
        sep1 = new Label("    ******************************* ");
	sep1.setPrefWidth(250);
        sep1.setAlignment(Pos.CENTER);
        sep1.setStyle("-fx-font-weight: bold");
        sep1.setFont(new Font("SansSerif", 14));
        //
        String style = "-fx-border-style: solid; -fx-border-width: 0.4; "
                       +   "-fx-border-radius: 10";
        E1 = new Label("""
                             Wheel A / Rail A  
                             Symmetric case """);
        E1.setStyle(style);
	E1.setPrefWidth(150);
        E1.setAlignment(Pos.BOTTOM_CENTER);
        E1.setFont(new Font("SansSerif", 14));
        //
        rB1 = new RadioButton("E1");  
        rB1.setOnAction((ActionEvent event) -> {
            action();
            N = 1;
            cas = 2;
        });
        //
        E2 = new Label("""
                             Wheel B / Rail A  
                             Symmetric case """);
        E2.setStyle(style);
	E2.setPrefWidth(150);
        E2.setAlignment(Pos.BOTTOM_CENTER);
        E2.setFont(new Font("SansSerif", 14));
        //
        rB2 = new RadioButton("E2");  
        rB2.setOnAction((ActionEvent event) -> {
            action();
            N = 2;
            cas = 2;
        });
        //
        E3 = new Label("""
                             Wheel H / Rail A  
                             Symmetric case """);
        E3.setStyle(style);
	E3.setPrefWidth(150);
        E3.setAlignment(Pos.BOTTOM_CENTER); 
        E3.setFont(new Font("SansSerif", 14));
        //
        rB3 = new RadioButton("E3");    
        rB3.setOnAction((ActionEvent event) -> {
            action();
            N = 3;
            cas = 2;
        });
        //
        E4 = new Label("""
                             Wheel I / Rail A  
                             Symmetric case """);
        E4.setStyle(style);
	E4.setPrefWidth(150);
        E4.setAlignment(Pos.BOTTOM_CENTER); 
        E4.setFont(new Font("SansSerif", 14));
        //
        rB4 = new RadioButton("E4");  
        rB4.setOnAction((ActionEvent event) -> {
            action();
            N = 4;
            cas = 2;
        });
        //
        E5 = new Label("""
                             Wheel A / Rail A 
                             Asymmetric case
                             Left WD: 918 mm  """);
        E5.setStyle(style);
	E5.setPrefWidth(150);
        E5.setAlignment(Pos.BOTTOM_CENTER);
        E5.setFont(new Font("SansSerif", 14));
        //
        rB5 = new RadioButton("E5");     
        rB5.setOnAction((ActionEvent event) -> {
            action();
            N = 5;
            cas = 1;
        });
        //
        E6 = new Label("""
                             Wheel B / Rail A 
                             Asymmetric case
                             Left WD: 918 mm  """);
        E6.setStyle(style);
	E6.setPrefWidth(150);
        E6.setAlignment(Pos.BOTTOM_CENTER);
        E6.setFont(new Font("SansSerif", 14));
        //
        rB6 = new RadioButton("E6");     
        rB6.setOnAction((ActionEvent event) -> {
            action();
            N = 6;
            cas = 1;
        });
        //
        E7 = new Label("""
                             Wheel H / Rail A 
                             Asymmetric case
                             Left WD: 918 mm  """);
        E7.setStyle(style);
	E7.setPrefWidth(150);
        E7.setAlignment(Pos.BOTTOM_CENTER);
        E7.setFont(new Font("SansSerif", 14));
        //
        rB7 = new RadioButton("E7");   
        rB7.setOnAction((ActionEvent event) -> {
            action();
            N = 7;
            cas = 1;
        });
        //
        E8 = new Label("""
                             Wheel I / Rail A 
                             Asymmetric case
                             Left WD: 918 mm  """);
        E8.setStyle(style);
	E8.setPrefWidth(150);
        E8.setAlignment(Pos.BOTTOM_CENTER);
        E8.setFont(new Font("SansSerif", 14));
        // 
        rB8 = new RadioButton("E8");     
        rB8.setOnAction((ActionEvent event) -> {
            action();
            N = 8;
            cas = 1;
        });
        //
        E9 = new Label("""
                             Wheel A(R)-B(L) 
                             Asymmetric case """);
        E9.setStyle(style);
	E9.setPrefWidth(150);
        E9.setAlignment(Pos.BOTTOM_CENTER);
        E9.setFont(new Font("SansSerif", 14));
        //
        rB9 = new RadioButton("E9");  
        rB9.setOnAction((ActionEvent event) -> {
            action();
            N = 9;
            cas = 1;
        });
        //
        group = new ToggleGroup();
        rB1.setToggleGroup(group);
        rB2.setToggleGroup(group);
        rB3.setToggleGroup(group);
        rB4.setToggleGroup(group);
        rB5.setToggleGroup(group);
        rB6.setToggleGroup(group);
        rB7.setToggleGroup(group);
        rB8.setToggleGroup(group);
        rB9.setToggleGroup(group);
        //
        btn1 = new Button("CALCULATE");
        btn1.setPrefSize(120, 20);
        btn1st = true;
        btn1.setDisable(btn1st);
        btn1.setOnAction(e-> {
            calculate();
           });
        btn1.setAlignment(Pos.CENTER);
        btn1.setEffect(new DropShadow(10, Color.GRAY)); 
        //
        btn2 = new Button("LOAD DATA");
        btn2.setPrefSize(120, 20);
        btn2.setDisable(true);
        btn2.setOnAction(e-> {
            loadData();           
           });
        btn2.setAlignment(Pos.CENTER);
        btn2.setEffect(new DropShadow(10, Color.GRAY)); 
        //
        btns1 = new HBox(5,btn1,btn2);  
        btns1.setPadding(new Insets(0, 0, 0, 0));
        btns1.setAlignment(Pos.CENTER);
        //
        btn3 = new Button("RESET");
        btn3.setPrefSize(120, 20);
        btn3.setOnAction(e->  
           {  
           btn1st = true; 
           btn1.setDisable(btn1st);
           btn2.setDisable(false);
           });
        btn3.setAlignment(Pos.CENTER);
        btn3.setEffect(new DropShadow(10, Color.GRAY)); 
        //
        btns2 = new HBox(5,btn3);  
        btns2.setPadding(new Insets(0, 0, 0, 0));
        btns2.setAlignment(Pos.CENTER);
        //---------------------------------------------------------------------- 
        // Plot Tabs
        tab0 = new Tab();
        tab0.setText("Equivalent Conicity (EN15302 Nonlinear Method)");
        tab0.setStyle("-fx-font-weight: bold");
        tab0.setClosable(false);
        //
        tab1 = new Tab();
        tab1.setText("Standard Benchmark Comparision (w/max & min tolerances) ");
        tab1.setStyle("-fx-font-weight: bold");
        tab1.setClosable(false);
        //
        tab3 = new Tab();
        tab3.setText("Rolling Radii Difference");
        tab3.setStyle("-fx-font-weight: bold");
        tab3.setClosable(false);
        //
        // TabPane
        TabPane tabPane = new TabPane(tab0,tab1, tab3);
        //
        // VBox 
        VBox paneleft = new VBox(10, addGridPane());  
        //
        // Border Pane
        BorderPane border = new BorderPane();
        border.setCenter(tabPane);
        border.setLeft(paneleft);       
        //
        // Scene & stage
        Scene scene = new Scene(border, 400, 200);
        scene.getStylesheets().add("/resources/style.css");
        Screen screen = Screen.getPrimary();
        primaryStage.setScene(scene);
        primaryStage.setWidth(screen.getVisualBounds().getWidth());
        primaryStage.setHeight(screen.getVisualBounds().getHeight());
        // Stage/window Icon 
        primaryStage.getIcons().add(new Image(Gui.class.
                                                 getResourceAsStream(
                                              "/resources/contact.png")));
        primaryStage.show();
    }
//******************************************************************************  
//******************************************************************************  
        /*
         * GridPane for cases selection
         */
    private GridPane addGridPane() {   
        GridPane grid = new GridPane();
        grid.setHgap(5);
        grid.setVgap(5);
        //
        grid.setPadding(new Insets(1, 10, 0, 10));
        // Category in column 1-3, row 1
        grid.add(titleinfo, 0, 0,3,1);
        //                        c     r  cspan rspan
        GridPane.setHalignment(titleinfo, HPos.CENTER);
        //-----------------------------------------
        // Category in column 1-3, row 2
        grid.add(gendatainfo, 0, 1,3,1);
        GridPane.setHalignment(gendatainfo, HPos.CENTER);
        //-----------------------------------------
        // Category in column 1-3, row 3
        grid.add(subtitle, 0, 2,3,1);
        //-----------------------------------------
        // Category in column 1-3, row 4
//        grid.add(sep,0, 3,3,1);
        //-----------------------------------------
        // Category in column 1, row 5
        grid.add(E1, 0, 4); 
        // Category in column 2, row 5
        grid.add(rB1, 1,4);
        //-----------------------------------------
        // Category in column 1, row 6
        grid.add(E2, 0, 5); 
        // Category in column 2, row 6
        grid.add(rB2, 1,5);
        //-----------------------------------------
        // Category in column 1, row 7
        grid.add(E3, 0, 6); 
        // Category in column 2, row 7
        grid.add(rB3, 1,6);
        //-----------------------------------------
        // Category in column 1, row 8
        grid.add(E4, 0, 7); 
        // Category in column 2, row 8
        grid.add(rB4, 1,7);
        //-----------------------------------------
        // Category in column 1, row 9
        grid.add(E5, 0, 8); 
        // Category in column 2, row 9
        grid.add(rB5, 1,8);
        //-----------------------------------------
        // Category in column 1, row 10
        grid.add(E6, 0, 9); 
        // Category in column 2, row 10
        grid.add(rB6, 1,9);
        //-----------------------------------------
        // Category in column 1, row 11
        grid.add(E7, 0, 10); 
        // Category in column 2, row 11
        grid.add(rB7, 1,10);
        //-----------------------------------------
        // Category in column 1, row 12
        grid.add(E8, 0, 11); 
        // Category in column 2, row 12
        grid.add(rB8, 1,11);
        //-----------------------------------------
        // Category in column 1, row 13
        grid.add(E9, 0, 12); 
        // Category in column 2, row 13
        grid.add(rB9, 1,12);
        //-----------------------------------------
        // Category in column 1-3, row 14
        grid.add(sep1, 0,13,3,1);
        //-----------------------------------------
        // Category in column 1-3, row 15
        grid.add(btns1, 0,14,3,1);
        //-----------------------------------------
        // Category in column 1-3, row 16
//        grid.add(btns2, 0,15,3,1);
        grid.add(footnoteinfo, 0, 15,3,1);
        GridPane.setHalignment(footnote, HPos.CENTER);
        //-----------------------------------------
        //
//        grid.setGridLinesVisible(true);
        return grid;
    } 
    //-----------------------------------------
    private void action(){
           btn2.setDisable(false); 
           if (btn1st != true){
               btn1st = true; 
               btn1.setDisable(btn1st);
           }
    }
    //-----------------------------------------
    private void loadData(){
        btn1st = false;
        btn1.setDisable(btn1st);
        btn2.setDisable(true);
        String fileName = "data/dr_ce_E"+N+".dat";
        String fileNameBench = "data/ben_E"+N+".dat";
        try {
             dr = new ReadFile().chooseSingle(fileName);
             bench = ReadGen.readFile(fileNameBench, 0);
            } catch (FileNotFoundException ex) {
                 Alert 
                 read_diag = new Alert(AlertType.ERROR);                    
                 read_diag.setTitle("ERROR");
                 read_diag.setHeaderText(ex.toString());
                 read_diag.setContentText("Check your file according to"
                                           + " requirements");
                 read_diag.showAndWait();
            }
        yi0 = new Select().main(N);
    }
    //-----------------------------------------
    private void calculate(){
        btn1st = true;
        btn1.setDisable(btn1st);
        out = new PreCalc().main(yi0, dr, cas);
        try {
             int id3mm = new Eq3mm().main(out[0]);
             conChart = new Chart().create2(out[0],out[1],out[0][id3mm],out[1][id3mm]);
             tab0.setContent(conChart);
             scChart = new Chart().create(out[0],out[1], bench[0],bench[2],bench[3]);
             tab1.setContent(scChart);
             drChart = new Chart().create0(yi0,dr);
             tab3.setContent(drChart);    
            } catch (FileNotFoundException ex) {
             Alert
             chart_diag = new Alert(AlertType.ERROR);                    
             chart_diag.setTitle("ERROR");
             chart_diag.setHeaderText(ex.toString());
             chart_diag.setContentText("Check your input data");
             chart_diag.showAndWait();
            }
    }
    //-----------------------------------------
}



