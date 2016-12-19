package Controllers;

import Boundaries.InfoPage;

import javax.sound.midi.MidiDevice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ftlc on 12/19/16.
 */
public class AppToInfoPageController implements ActionListener {

    InfoPage ip;
    public AppToInfoPageController(InfoPage ip){
        this.ip = ip;
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        ip.setVisible(true);
    }
}
