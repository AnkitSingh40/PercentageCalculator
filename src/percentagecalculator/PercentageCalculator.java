
package percentagecalculator;
 import javax.swing.*;

public class PercentageCalculator {

    
    public static void main(String[] args) {
      
        JFrame frame = new JFrame("Percentage Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        JLabel labelValue1 = new JLabel("Value 1:");
        labelValue1.setBounds(50, 30, 100, 25);
        frame.add(labelValue1);

        JTextField textFieldValue1 = new JTextField();
        textFieldValue1.setBounds(150, 30, 150, 25);
        frame.add(textFieldValue1);

        JLabel labelValue2 = new JLabel("Value 2:");
        labelValue2.setBounds(50, 70, 100, 25);
        frame.add(labelValue2);

        JTextField textFieldValue2 = new JTextField();
        textFieldValue2.setBounds(150, 70, 150, 25);
        frame.add(textFieldValue2);

        JLabel labelPercentage = new JLabel("Percentage:");
        labelPercentage.setBounds(50, 110, 100, 25);
        frame.add(labelPercentage);

        JTextField textFieldPercentage = new JTextField();
        textFieldPercentage.setBounds(150, 110, 150, 25);
        frame.add(textFieldPercentage);

        JButton buttonCalculatePercentage = new JButton("Calculate Percentage");
        buttonCalculatePercentage.setBounds(50, 150, 200, 25);
        frame.add(buttonCalculatePercentage);

        JButton buttonCalculateIncreaseDecrease = new JButton("Calculate Increase/Decrease");
        buttonCalculateIncreaseDecrease.setBounds(50, 190, 200, 25);
        frame.add(buttonCalculateIncreaseDecrease);

        JButton buttonFindWhole = new JButton("Find Whole");
        buttonFindWhole.setBounds(50, 230, 200, 25);
        frame.add(buttonFindWhole);

        JLabel labelResult = new JLabel("Result:");
        labelResult.setBounds(50, 270, 100, 25);
        frame.add(labelResult);

        JTextField textFieldResult = new JTextField();
        textFieldResult.setBounds(150, 270, 200, 25);
        textFieldResult.setEditable(false);
        frame.add(textFieldResult);

        //Enter Value1 and value2 to check percentage
        buttonCalculatePercentage.addActionListener(e -> {
            
             try {
        double value1 = Double.parseDouble(textFieldValue1.getText());
        double value2 = Double.parseDouble(textFieldValue2.getText());
        double percentage = (value1 / value2) * 100;
        textFieldResult.setText(String.format("Percentage: %.2f%%", percentage));
    } catch (NumberFormatException f) {
        textFieldResult.setText("Invalid input");
    }
        });

        //Enter Value1 and percentage to check percentage
        buttonCalculateIncreaseDecrease.addActionListener  (e -> {
           
            try {
        double value1 = Double.parseDouble(textFieldValue1.getText());
        double percentage = Double.parseDouble(textFieldPercentage.getText());
        double increase = value1 + (value1 * (percentage / 100));
        double decrease = value1 - (value1 * (percentage / 100));
        textFieldResult.setText(String.format("Increase: %.2f, Decrease: %.2f", increase, decrease));
    } catch (NumberFormatException g) {
        textFieldResult.setText("Invalid input");
    }

        });

        buttonFindWhole.addActionListener(e -> {
            try {
        double value1 = Double.parseDouble(textFieldValue1.getText());
        double percentage = Double.parseDouble(textFieldPercentage.getText());
        double whole = value1 / (percentage / 100);
        textFieldResult.setText(String.format("Whole: %.2f", whole));
    } catch (NumberFormatException h) {
        textFieldResult.setText("Invalid input");
    }

        });

        frame.setVisible(true);
    }
}

    
