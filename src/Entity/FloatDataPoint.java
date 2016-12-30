package Entity;

import Controllers.ExitBuilderController;

/**
 * Created by ftlc on 12/29/16.
 */
public class FloatDataPoint extends DataPoint{

    float data;

    @Override
    public boolean setDataPoint(String s) {
        float f = 0;

        try {
            f = Float.parseFloat(s);
        }
        catch (Exception e) {
            return false;
        }

        data = f;
        return true;
    }
}
