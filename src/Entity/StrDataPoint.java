package Entity;

/**
 * Created by ftlc on 12/29/16.
 */
public class StrDataPoint extends DataPoint{

    String data;

    @Override
    public boolean setDataPoint(String s){
        if(s != null) {
            data = s;
            return true;
        }
        return false;
    }

}
