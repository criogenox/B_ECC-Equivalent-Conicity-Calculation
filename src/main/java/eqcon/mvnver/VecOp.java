package eqcon.mvnver;

/**
 * @author Criogenox
 */
public class VecOp {
    //***
    public double[][] toTrack(double[][] matrix, int row, int strcol,
                              int endcolex, double s) {
        //
        int colnew = endcolex - strcol;
        for (int r = 0; r < colnew; r++) {
            matrix[row][r] = (matrix[row][strcol + r] + (s / 2));
        }
        return matrix;
    }

    //***
    public double[] linspace(double min, double max, int points) {
        double[] vec = new double[points];
        for (int i = 0; i < points; i++) {
            vec[i] = min + i * (max - min) / (points - 1);
        }
        return vec;
    }

    //***
    public double dot(double x[], double y[]) {
        if (x.length != y.length)
            throw new RuntimeException("Arrays must be same size");
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i] * y[i];
        }
        return sum;
    }

    //***
    public double[] reverse(double[] arr) {
        double[] arrrev = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrrev[i] = arr[arr.length - 1 - i];
        }
        return arrrev;
    }

    //***
    public double[] m2vc(double[][] matrix, int col, int strrow, int endrowex) {
        //
        int rownew = endrowex - strrow;
        double[] result = new double[rownew];
        for (int r = 0; r < rownew; r++) {
            result[r] = matrix[strrow + r][col];
        }
        return result;
    }
    //***
}
