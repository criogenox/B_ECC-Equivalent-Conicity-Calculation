package eqcon;
//
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author  Criogenox
 */
public class ReadFile {
    //
    public double[] chooseSingle(String fileName) throws FileNotFoundException{
        List<Double> list= new ArrayList<>();
        File filescan = new File(fileName);
        try (Scanner scanner = new Scanner(filescan)) {
            while (scanner.hasNext()) {
                list.add(Double.valueOf(scanner.next()));
            }  
            scanner.close();
        }
        return list.stream().mapToDouble(Double::doubleValue).toArray();
    }
}
