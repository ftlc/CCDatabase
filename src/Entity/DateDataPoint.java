package Entity;

import java.util.Date;

/**
 * Created by ftlc on 12/29/16.
 */
public class DateDataPoint extends DataPoint{
    Date theData;

    public DateDataPoint(){}

    @Override
    public boolean setDataPoint(String s) {
        return super.setDataPoint(s);
    }
}
