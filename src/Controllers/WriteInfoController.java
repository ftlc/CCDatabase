package Controllers;

import Boundaries.InfoPage;
import Entity.InfoEntity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ftlc on 12/20/16.
 */
public class WriteInfoController implements ActionListener{

    InfoPage infoPage;
    InfoEntity infoEntity;

    public WriteInfoController(InfoEntity ie, InfoPage ip){
        this.infoEntity = ie;
        this.infoPage = ip;

    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {








        infoPage.dispose();
    }
}
