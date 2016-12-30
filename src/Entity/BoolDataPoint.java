package Entity;

/**
 * Created by ftlc on 12/29/16.
 */
public class BoolDataPoint extends DataPoint {

    boolean data;
    public BoolDataPoint(){}

    @Override
    public boolean setDataPoint(String s) {
        return super.setDataPoint(s);
    }


    public boolean setDataPoint(boolean b) {
        data = b;
        return true;
    }
}
