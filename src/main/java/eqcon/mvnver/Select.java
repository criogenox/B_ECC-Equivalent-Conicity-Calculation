package eqcon.mvnver;

/**
 * @author Criogenox
 */
public class Select {
    //
    public double[] main(int N) {
//%*****************************************************************************  
//type=1; % 1 Asymmetric case  - 5 / 6 / 7 / 8 / 9
//        % 2 Symmetric case   - 1 / 2 / 3 / 4
//%*****************************************************************************         
// yii=(-6.8:0.1:6.8); % 1 / 2 / 3 / 5 / 9 / % 137
// yii=(-7.1:0.1:7.1); % 4                   % 143
// yii=(-6.9:0.1:6.8); % 6                   % 138
// yii=(-6.8:0.1:6.7); % 7                   % 136
// yii=(-7.1:0.1:7.0); % 8                   % 142
//%*****************************************************************************
        // create tranversal y vector [mm]
        double[] yi0;
        switch (N) {
            case 1, 2, 3, 5, 9 -> {
                yi0 = new VecOp().linspace(-6.8, 6.8, 137); // 1 / 2 / 3 / 5 / 9
            }
            case 4 -> {
                yi0 = new VecOp().linspace(-7.1, 7.1, 143); // 4
            }
            case 6 -> {
                yi0 = new VecOp().linspace(-6.9, 6.8, 138); // 6
            }
            case 7 -> {
                yi0 = new VecOp().linspace(-6.8, 6.7, 136); // 7
            }
            default -> {
                yi0 = new VecOp().linspace(-7.1, 7.0, 142); // 8
            }
        }
        return yi0;
    }
}
