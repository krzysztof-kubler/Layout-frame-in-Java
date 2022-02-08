
package obslugabufora;

/**
 *
 * @author Krzysztof Kubler
 */

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame
{
    public Main()
    {
        
        initComponents();
         
    }   
    
    public void initComponents()
    {
        this.setTitle("Obsługa bufora");
        
        int szer = Toolkit.getDefaultToolkit().getScreenSize().width;
        int wys = Toolkit.getDefaultToolkit().getScreenSize().height;
               
        this.setSize(szer/4, wys/4);
        
        int szerRamki = this.getSize().width;
        int wysRamki = this.getSize().height;
        
        this.setLocation((szer-szerRamki)/2, (wys-wysRamki)/2);
        
        labelList.setPreferredSize(new Dimension(150, 20));
        textArea.setPreferredSize(new Dimension(450, 50));
        textArea.setEditable(true);
        buttonRestore.setPreferredSize(buttonRestore.getPreferredSize());
        //panel1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        labelList.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        textArea.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        labelAction.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        buttonRestore.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        
                
        panel1.add(labelList);
        panel1.add(textArea);        
        panel1.add(labelAction);
        panel1.add(buttonRestore);
        
        this.getContentPane().add(panel1, BorderLayout.CENTER);      
        this.getContentPane().setLayout(new GridLayout(0, 1));
        
        
        
        this.setDefaultCloseOperation(3);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("down-icon.png")); 
        
    }
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEADING));

        JLabel labelList = new JLabel("Podaj listę dokumentów:");
        JTextArea textArea = new JTextArea(5, 2);
        JLabel labelAction = new JLabel("Wykonaj akcję:");
        JButton buttonRestore = new JButton("Przywróć do bufora");
        
    public static void main(String[] args) 
    {
      new Main().setVisible(true);
    }
    
}
