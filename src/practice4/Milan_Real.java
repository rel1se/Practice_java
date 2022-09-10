package practice4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Milan_Real extends JFrame{
    private JPanel panel1 = new JPanel();
    private JButton Milan = new JButton();
    private JButton Real = new JButton();
    private JLabel Result = new JLabel();
    private JLabel Scorer = new JLabel();
    private JLabel Winner = new JLabel();
    private int Mil = 0,Mad = 0;
    public Milan_Real(){
        setContentPane(panel1);
        setSize(400,400);
        Milan.setSize(50,50);
        panel1.add(Milan);
        Real.setSize(50,50);
        panel1.add(Real);
        panel1.add(Result);
        panel1.add(Scorer);
        panel1.add(Winner);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        Milan.addActionListener(e-> {
            Mil++;
            UpdateScore("AC Milan");
        });
        Real.addActionListener(e -> {
            Mad++;
            UpdateScore("Real Madrid");
        });
    }
    private void UpdateScore(String LastScorer){
        Scorer.setText("Last Scorer: " + LastScorer);
        Result.setText("Result: " + Mil + " X " + Mad);
        String res = "DRAW";
        if (Mil > Mad){
            res = "AC MILAN";
            Winner.setText("Winner: " + res);
        }
        else if (Mil < Mad) {
            res = "Real Madrid";
            Winner.setText("Winner: " + res);
        }
        Winner.setText("Winner: " + res);
    }
}
