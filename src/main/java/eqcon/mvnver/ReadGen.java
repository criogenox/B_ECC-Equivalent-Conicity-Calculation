package eqcon.mvnver;
//

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/* www.java2s.com
 * Generic function to read a text file into a double[][] with an
 * arbitrary number of columns.
 *
 * @param file is the full path of the text file to read.
 * @param header is the number of lines of header to skip
 * @return double[][] {column_1, ..., column_N}
 */
public class ReadGen {
    //
    public static double[][] readFile(String file, int header) {
        // initialize output
        double[][] output = null;
        // read the files
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            // skip the header
            for (int i = 1; i <= header; i++) {
                reader.readLine();
            }
            // first line, set up number of columns
            String line = reader.readLine();
            String[] tokens = tokenize(line);
            int columns = tokens.length;
            // initialize
            ArrayList[] listArr = new ArrayList[columns];
            for (int a = 0; a < columns; a++) {
                listArr[a] = new ArrayList<>();
            }
            // get strings from first line
            for (int s = 0; s < columns; s++) {
                listArr[s].add(tokens[s]);
            }
            // read the rest of the file, adding token strings to the lists
            while ((line = reader.readLine()) != null) {
                tokens = tokenize(line);
                for (int s = 0; s < columns; s++) {
                    listArr[s].add(tokens[s]);
                }
            }
            // arraylists full of strings, read to arrays
            output = new double[columns][listArr[0].size()];
            for (int i = 0; i < listArr[0].size(); i++) {
                for (int a = 0; a < columns; a++) {

                    output[a][i] = Double.parseDouble((String) listArr[a].get(i));
                }
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
            }
        }
        return output;
    }

    /**
     * Tokenizing helper.  Works on space, tab and comma separated files.
     *
     * @param input is a line to be tokenized
     * @return a String[] of the strings in between the delimiters
     */
    public static String[] tokenize(String input) {
        if (input.contains(",")) { // comma delimited
            String[] ret = input.split(",");
            // trim leading whitespace
            for (String s : ret) {
                String trim = s.trim();
            }
            return ret;
        } else if (input.contains("\\t")) { // tab delimited
            return input.split("\\t+");
        } else { // whitespace delimited
            return input.trim().split("\\s+");
        }
    }
}