import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private double number1 = 0, number2 = 0;
    private String actions1 = "", actions2 = "";
    private final JLabel text, textUp;

    public Window(String title, int sizew, int sizeh) throws HeadlessException {
        super(title);
        setSize(sizeh, sizew);
        getContentPane().setBackground(new Color(41, 39, 55));

        ActionListener listener = new ButtonsListener();

        textUp = new JLabel();

        text = new JLabel("0");
        text.setVerticalAlignment(0);
        text.setPreferredSize(new Dimension(100,70));
        text.setFont(new Font("Times New Roman", Font.PLAIN,40));
        text.setForeground(new Color(255, 255, 255));

        textUp.setFont(new Font("Times New Roman", Font.PLAIN,15));
        textUp.setForeground(new Color(255, 255, 255));



        JPanel panelUp = new JPanel();
        panelUp.setPreferredSize(new Dimension(100,70));

        panelUp.setLayout(new GridLayout(2,1));
        panelUp.add(textUp).setPreferredSize(new Dimension(100,30));
        panelUp.add(text);
        panelUp.setBackground(new Color(41, 39, 55));


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 4));

        String[] butt = {"C", "x²", "√", "⌫",
                "CE", "+/-", "%", "×",
                "1", "2", "3", "÷",
                "4", "5", "6", "+",
                "7", "8", "9", "-",
                ".", "0", "", "="};

        for (String a : butt) {

            JButton button = new JButton(a);
            button.setActionCommand(a);
            button.addActionListener(listener);


            if(a.equals("=")){
                button.setBorder(BorderFactory.createLineBorder(new Color(109, 73, 161)));
                button.setForeground(new Color(0, 0, 0));
                button.setBackground(new Color(109, 73, 161));
            }else{
                button.setForeground(new Color(255, 255, 255));
                button.setBorder(BorderFactory.createLineBorder(new Color(41, 39, 44)));
                button.setBackground(new Color(41, 39, 44));
            }
            button.setCursor(new Cursor(Cursor.HAND_CURSOR));
            button.setFocusPainted(false);
            button.setIconTextGap(1);
            button.setMargin(new Insets(0, 0, 0, 0));
            button.setPreferredSize(new Dimension(70, 140));

            panel.add(button);
            panel.setBackground(new Color(34, 34, 34));
            panel.setForeground(new Color(57, 57, 57));
            panel.setBorder(BorderFactory.createLineBorder(new Color(46, 46, 48)));
            panel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }

        add(BorderLayout.NORTH,panelUp);
        add(panel);

    }

    private class ButtonsListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            String action = e.getActionCommand();



            if(action.equals("1")) {
                try {
                    if(actions1.equals("=")){
                        text.setText("1");
                        actions1 = "";
                        actions2 = "";
                        textUp.setText("");
                    }else if(actions2.equals("+") || actions2.equals("-") || actions2.equals("×") || actions2.equals("÷") || actions2.equals("%")){
                        text.setText("1");
                        actions2 = "";
                    }else if (Double.isFinite(Double.parseDouble(text.getText())) && text.getText().equals("0") || !actions2.isEmpty()) {
                        text.setText("1");
                        actions2 = "";
                        textUp.setText("");
                    } else {
                        text.setText(text.getText() + "1");
                    }
                } catch (NumberFormatException er) {
                    textUp.setText("");
                    text.setText("1");
                }
            }
            if(action.equals("2")){
                try {
                    if(actions1.equals("=")){
                        text.setText("2");
                        actions1 = "";
                        actions2 = "";
                        textUp.setText("");
                    }else if(actions2.equals("+") || actions2.equals("-") || actions2.equals("×") || actions2.equals("÷") || actions2.equals("%")){
                        text.setText("2");
                        actions2 = "";
                    }else if (Double.isFinite(Double.parseDouble(text.getText())) && text.getText().equals("0") || !actions2.isEmpty()) {
                        text.setText("2");
                        actions2 = "";
                        textUp.setText("");
                    } else {
                        text.setText(text.getText() + "2");
                    }
                }catch (NumberFormatException er) {
                    textUp.setText("");
                    text.setText("2");
                }
            }
            if(action.equals("3")){
                try {
                    if(actions1.equals("=")){
                        text.setText("3");
                        actions1 = "";
                        actions2 = "";
                        textUp.setText("");
                    }else if(actions2.equals("+") || actions2.equals("-") || actions2.equals("×") || actions2.equals("÷") || actions2.equals("%")){
                        text.setText("3");
                        actions2 = "";
                    }else if (Double.isFinite(Double.parseDouble(text.getText())) && text.getText().equals("0") || !actions2.isEmpty()) {
                        text.setText("3");
                        actions2 = "";
                        textUp.setText("");
                    } else {
                        text.setText(text.getText() + "3");
                    }
                }catch (NumberFormatException er) {
                    textUp.setText("");
                    text.setText("3");
                }
            }
            if(action.equals("4")){
                try {
                    if(actions1.equals("=")){
                        text.setText("4");
                        actions1 = "";
                        actions2 = "";
                        textUp.setText("");
                    }else if(actions2.equals("+") || actions2.equals("-") || actions2.equals("×") || actions2.equals("÷") || actions2.equals("%")){
                        text.setText("4");
                        actions2 = "";
                    }else if (Double.isFinite(Double.parseDouble(text.getText())) && text.getText().equals("0") || !actions2.isEmpty()) {
                        text.setText("4");
                        actions2 = "";
                        textUp.setText("");
                    } else {
                        text.setText(text.getText() + "4");
                    }
                }catch (NumberFormatException er) {
                    textUp.setText("");
                    text.setText("4");
                }
            }
            if(action.equals("5")){
                try {
                    if(actions1.equals("=")){
                        text.setText("5");
                        actions1 = "";
                        actions2 = "";
                        textUp.setText("");
                    }else if(actions2.equals("+") || actions2.equals("-") || actions2.equals("×") || actions2.equals("÷") || actions2.equals("%")){
                        text.setText("5");
                        actions2 = "";
                    }else if (Double.isFinite(Double.parseDouble(text.getText())) && text.getText().equals("0") || !actions2.isEmpty()) {
                        text.setText("5");
                        actions2 = "";
                        textUp.setText("");
                    } else {
                        text.setText(text.getText() + "5");
                    }
                }catch (NumberFormatException er) {
                    textUp.setText("");
                    text.setText("5");
                }
            }
            if(action.equals("6")){
                try {
                    if(actions1.equals("=")){
                        text.setText("6");
                        actions1 = "";
                        actions2 = "";
                        textUp.setText("");
                    }else if(actions2.equals("+") || actions2.equals("-") || actions2.equals("×") || actions2.equals("÷") || actions2.equals("%")){
                        text.setText("6");
                        actions2 = "";
                    }else if (Double.isFinite(Double.parseDouble(text.getText())) && text.getText().equals("0") || !actions2.isEmpty()) {
                        text.setText("6");
                        actions2 = "";
                        textUp.setText("");
                    } else {
                        text.setText(text.getText() + "6");
                    }
                }catch (NumberFormatException er) {
                    textUp.setText("");
                    text.setText("6");
                }
            }
            if(action.equals("7")){
                try {
                    if(actions1.equals("=")){
                        text.setText("7");
                        actions1 = "";
                        actions2 = "";
                        textUp.setText("");
                    }else if(actions2.equals("+") || actions2.equals("-") || actions2.equals("×") || actions2.equals("÷") || actions2.equals("%")){
                        text.setText("7");
                        actions2 = "";
                    }else if (Double.isFinite(Double.parseDouble(text.getText())) && text.getText().equals("0") || !actions2.isEmpty()) {
                        text.setText("7");
                        actions2 = "";
                        textUp.setText("");
                    } else {
                        text.setText(text.getText() + "7");
                    }
                }catch (NumberFormatException er) {
                    textUp.setText("");
                    text.setText("7");
                }
            }
            if(action.equals("8")){
                try {
                    if(actions1.equals("=")){
                        text.setText("8");
                        actions1 = "";
                        actions2 = "";
                        textUp.setText("");
                    }else if(actions2.equals("+") || actions2.equals("-") || actions2.equals("×") || actions2.equals("÷") || actions2.equals("%")){
                        text.setText("8");
                        actions2 = "";
                    }else if (Double.isFinite(Double.parseDouble(text.getText())) && text.getText().equals("0") || !actions2.isEmpty()) {
                        text.setText("8");
                        actions2 = "";
                        textUp.setText("");
                    } else {
                        text.setText(text.getText() + "8");
                    }
                }catch (NumberFormatException er) {
                    textUp.setText("");
                    text.setText("8");
                }
            }
            if(action.equals("9")){
                try {
                    if(actions1.equals("=")){
                        text.setText("9");
                        actions1 = "";
                        actions2 = "";
                        textUp.setText("");
                    }else if(actions2.equals("+") || actions2.equals("-") || actions2.equals("×") || actions2.equals("÷") || actions2.equals("%")){
                        text.setText("9");
                        actions2 = "";
                    }else if (Double.isFinite(Double.parseDouble(text.getText())) && text.getText().equals("0") || !actions2.isEmpty()) {
                        text.setText("9");
                        actions2 = "";
                        textUp.setText("");
                    } else {
                        text.setText(text.getText() + "9");
                    }
                }catch (NumberFormatException er) {
                    textUp.setText("");
                    text.setText("9");
                }
            }
            if(action.equals("0")){
                try {
                    if (Double.isFinite(Double.parseDouble(text.getText())) && !text.getText().equals("0") && actions2.isEmpty()) {
                        text.setText(text.getText() + "0");
                        actions2 = "";
                    }else if(actions1.equals("=")){
                        text.setText("0");
                        actions1 = "";
                        actions2 = "";
                        textUp.setText("");
                    }else if(actions2.equals("+") || actions2.equals("-") || actions2.equals("×") || actions2.equals("÷") || actions2.equals("%")){
                        text.setText("0");
                        actions2 = "";
                    }else if(!actions2.isEmpty()){
                        text.setText("0");
                        actions2 = "";
                        textUp.setText("");
                    }
                }catch (NumberFormatException er) {
                    textUp.setText("");
                    text.setText("0");
                }
            }

            if(action.equals("C")){
                text.setText("0");
                textUp.setText("");
                number1 = 0;
                number2 = 0;
                actions1 = "";
                actions2 = "";
            }

            if(action.equals("CE")){
                if(actions2.equals("√") || actions2.equals("x²") || actions1.equals("=")){
                    textUp.setText("");
                    text.setText("0");
                }else {
                    text.setText("0");
                    actions2 = "+";
                }
            }

            if(action.equals("⌫")){
                try {
                    if (text.getText().length() == 1 || !Double.isFinite(Double.parseDouble(text.getText()))) {
                        text.setText("0");
                        actions2 = "+";
                    } else if(!actions2.isEmpty()){
                        text.setText("0");
                        textUp.setText("");
                        actions2 = "";
                    }else{
                        text.setText(text.getText().substring(0, text.getText().length() - 1));
                    }
                }catch (NumberFormatException er){
                    textUp.setText("");
                    text.setText("0");
                }
            }

            if(action.equals(".")){
                try {
                    if (text.getText().length() - text.getText().replace(".", "").length() < 1 && Double.isFinite(Double.parseDouble(text.getText())))
                        text.setText(text.getText() + ".");
                }catch (NumberFormatException er){
                    textUp.setText("");
                    text.setText("0.");
                }
            }

            if(action.equals("√")){
                try {
                    if (Double.parseDouble(text.getText()) >= 0 && Double.isFinite(Double.parseDouble(text.getText()))) {
                        actions2 = action;
                        textUp.setText("√" + "(" + text.getText() + ")" + " =");
                        text.setText(String.valueOf(Math.sqrt(Double.parseDouble(text.getText()))));
                    } else {
                        textUp.setText("√" + "(" + text.getText() + ")" + " =");
                        text.setText("Нет решений");
                    }
                }catch (NumberFormatException er){
                    textUp.setText("");
                    text.setText("0");
                }
            }

            if(action.equals("x²")){
                try {
                    actions2 = action;
                    textUp.setText(text.getText() + "²" + " =");
                    text.setText(String.valueOf(Math.pow(Double.parseDouble(text.getText()),2)));
                }catch (NumberFormatException er){
                    textUp.setText("");
                    text.setText("0");
                }
            }

            if(action.equals("+/-")){
                try {
                    if (Double.parseDouble(text.getText()) > 0 && (text.getText().length() - text.getText().replace("-", "").length() < 1))
                        text.setText("-" + text.getText());
                    else if (!text.getText().equals("0") && (text.getText().length() - text.getText().replace("+", "").length() < 1))
                        text.setText(text.getText().replace("-", ""));
                }catch (NumberFormatException er){
                    text.setText("0");
                }
            }

            if(action.equals("+")){
                try {
                    if (actions1.isEmpty()) {
                        number1 = Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("-")) {
                        number1 -= Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("×")) {
                        number1 *= Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("÷")) {
                        number1 /= Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("%")) {
                        number1 %= Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("=")) {
                        number1 = Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(text.getText() + " " + action);
                        text.setText("0");
                    }else {
                        number1 += Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        number2 = Double.parseDouble(text.getText());
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    }
                }catch (NumberFormatException er){
                    textUp.setText("");
                    text.setText("0");
                }
            }

            if(action.equals("-")) {
                try {
                    if (actions1.isEmpty()) {
                        number1 = Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(String.valueOf(number1 + " " + action));
                        text.setText("0");
                    } else if (actions1.equals("+")) {
                        number1 += Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("×")) {
                        number1 *= Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("÷")) {
                        number1 /= Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("%")) {
                        number1 %= Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("=")) {
                        number1 = Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(text.getText() + " " + action);
                        text.setText("0");
                    }else {
                        number1 -= Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        number2 = Double.parseDouble(text.getText());
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    }
                } catch (NumberFormatException er) {
                    textUp.setText("");
                    text.setText("0");
                }
            }

            if(action.equals("×")) {
                try {
                    if (actions1.isEmpty()) {
                        number1 = Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(String.valueOf(number1 + " " + action));
                        text.setText("0");
                    } else if (actions1.equals("-")) {
                        number1 -= Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("+")) {
                        number1 += Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("÷")) {
                        number1 /= Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("%")) {
                        number1 %= Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("=")) {
                        number1 = Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(text.getText() + " " + action);
                        text.setText("0");
                    }else {
                        number1 *= Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        number2 = Double.parseDouble(text.getText());
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    }
                }catch (NumberFormatException er){
                    textUp.setText("");
                    text.setText("0");
                }
            }

            if(action.equals("÷")) {
                try {
                    if (actions1.isEmpty()) {
                        number1 = Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(String.valueOf(number1 + " " + action));
                        text.setText("0");
                    } else if (actions1.equals("-")) {
                        number1 -= Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("×")) {
                        number1 *= Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("+")) {
                        number1 += Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("%")) {
                        number1 %= Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("=")) {
                        number1 = Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(text.getText() + " " + action);
                        text.setText("0");
                    }else {
                        number1 /= Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        number2 = Double.parseDouble(text.getText());
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    }
                }catch (NumberFormatException er){
                    textUp.setText("");
                    text.setText("0");
                }
            }

            if(action.equals("%")) {
                try{
                    if (actions1.isEmpty() ) {
                        number1 = Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("-")) {
                        number1 -= Double.parseDouble(text.getText()) ;
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    } else if (actions1.equals("×")) {
                        number1 *= Double.parseDouble(text.getText()) ;
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    }else if (actions1.equals("+")) {
                        number1 += Double.parseDouble(text.getText()) ;
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    }else if (actions1.equals("÷")) {
                        number1 /= Double.parseDouble(text.getText()) ;
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    }else if (actions1.equals("=")) {
                        number1 = Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        textUp.setText(text.getText() + " " + action);
                        text.setText("0");
                    }else {
                        number1 %= Double.parseDouble(text.getText());
                        actions1 = action;
                        actions2 = action;
                        number2 = Double.parseDouble(text.getText());
                        textUp.setText(number1 + " " + action);
                        text.setText("0");
                    }
                }catch (NumberFormatException er){
                    textUp.setText("");
                    text.setText("0");
                }
            }

            if(action.equals("=")) {


                switch (actions1) {
                    case "+" -> {
                        number2 = Double.parseDouble(text.getText());
                        textUp.setText(String.valueOf(number1 + " + " + number2 + " ="));
                        text.setText(String.valueOf(number1 + number2));
                        number1 = Double.parseDouble(text.getText());
                        actions1 = "=";
                        actions2 = "+";
                    }
                    case "×" -> {
                        number2 = Double.parseDouble(text.getText());
                        textUp.setText(String.valueOf(number1 + " × " + number2 + " ="));
                        text.setText(String.valueOf(number1 * number2));
                        number1 = Double.parseDouble(text.getText());
                        actions1 = "=";
                        actions2 = "×";
                    }
                    case "÷" -> {
                        number2 = Double.parseDouble(text.getText());
                        textUp.setText(number1 + " ÷ " + number2 + " =");
                        text.setText(String.valueOf(number1 / number2));
                        number1 = Double.parseDouble(text.getText());
                        actions1 = "=";
                        actions2 = "÷";
                    }
                    case "-" -> {
                        number2 = Double.parseDouble(text.getText());
                        textUp.setText(number1 + " - " + number2 + " =");
                        text.setText(String.valueOf(number1 - number2));
                        number1 = Double.parseDouble(text.getText());
                        actions1 = "=";
                        actions2 = "-";
                    }
                    case "%" -> {
                        number2 = Double.parseDouble(text.getText());
                        textUp.setText(number1 + " % " + number2 + " =");
                        text.setText(String.valueOf(number1 % number2));
                        number1 = Double.parseDouble(text.getText());
                        actions1 = "=";
                        actions2 = "-";
                    }
                    case "=" -> {
                        switch (actions2){
                            case "+" ->{
                                textUp.setText(number1 + " + " + number2 + " =");
                                text.setText(String.valueOf(OperationPlus()));
                            }
                            case "-" ->{
                                textUp.setText(number1 + " - " + number2 + " =");
                                text.setText(String.valueOf(OperationMinus()));
                            }
                            case "×" ->{
                                textUp.setText(number1 + " × " + number2 + " =");
                                text.setText(String.valueOf(OperationUmnozhenie()));
                            }
                            case "÷" ->{
                                textUp.setText(number1 + " ÷ " + number2 + " =");
                                text.setText(String.valueOf(OperationDet()));
                            }
                            case "%" ->{
                                textUp.setText(number1 + " % " + number2 + " =");
                                text.setText(String.valueOf(OperationDet()));
                            }

                        }
                    }
                }
            }
        }
        private double OperationPlus(){

            number1 += number2;
            return number1;
        }
        private double OperationMinus(){

            number1 -= number2;
            return number1;
        }

        private double OperationUmnozhenie(){

            number1 *= number2;
            return number1;
        }

        private double OperationDet(){

            number1 /= number2;
            return number1;
        }
    }
}
