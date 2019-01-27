import javax.sound.midi.*;
import javax.swing.*;
import java.awt.event.*;

public class MusicClass1 implements ActionListener {

    JButton button;

    public static void main(String[] args) {
        MusicClass1 mt = new MusicClass1();
        mt.createGUI();
        mt.play();

    }

    public void createGUI(){
        //Create GUI
        JFrame frame = new JFrame();
        button = new JButton("click me!");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent action){
        button.setText("You've clicked me! I am now self-aware...");
    }

    public void play(){
        try{

            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();

        } catch (Exception ex){
            ex.printStackTrace();
        }
    }


}
