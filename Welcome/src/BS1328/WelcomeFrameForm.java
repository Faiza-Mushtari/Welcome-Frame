package BS1328;

import javax.swing.*;

public class WelcomeFrameForm extends JFrame{
    private JPanel WelcomePanel;

    //constructor of class "WelcomeFrameForm"
    public WelcomeFrameForm(){
        add(WelcomePanel);

        setTitle("Welcome");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //close button will exit
        setLocationRelativeTo(null); //appear in center
        //make window visible
        setVisible(true);

    }

    public static void main(String[] args) {

        //creating object myFrame of type "WelcomeFrameForm"
        //WelcomeFrameForm myFrame = new WelcomeFrameForm();

        //or,
        new WelcomeFrameForm();

    }
}
