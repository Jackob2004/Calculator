package listener;

import main.MyFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private MyFrame frame;
    public ButtonListener(MyFrame frame){
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "0" -> frame.getCalculator().getNumber("7");
            case "1" -> frame.getCalculator().getNumber("8");
            case "2" -> frame.getCalculator().getNumber("9");
            case "3" -> frame.getCalculator().reset();
            case "4" -> frame.getCalculator().getNumber("4");
            case "5" -> frame.getCalculator().getNumber("5");
            case "6" -> frame.getCalculator().getNumber("6");
            case "7" -> frame.getCalculator().getOperation('/');
            case "8" -> frame.getCalculator().getNumber("1");
            case "9" -> frame.getCalculator().getNumber("2");
            case "10" -> frame.getCalculator().getNumber("3");
            case "11" -> frame.getCalculator().getOperation('x');
            case "12" -> frame.getCalculator().getNumber("0");
            case "13" -> frame.getCalculator().result();
            case "14" -> frame.getCalculator().getOperation('-');
            case "15" -> frame.getCalculator().getOperation('+');
        }
    }
}
