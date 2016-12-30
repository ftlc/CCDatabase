package Entity;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

/**
 * Created by ftlc on 12/29/16.
 */
public class IntDataPoint extends DataPoint{
    int data;

    @Override
    public boolean setDataPoint(String s) {
        int i = 0;

        try {
            i = Integer.parseInt(s);
        }
        catch (Exception e) {
            return false;
        }

        data = i;
        return true;
    }
}
