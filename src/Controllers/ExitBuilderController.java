package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ftlc on 12/19/16.
 */
public class ExitBuilderController implements ActionListener{



    public ExitBuilderController(){}
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.exit(0);
    }
}
