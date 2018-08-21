import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class TestDev implements ActionListener
{
    JFrame f;
    JMenuBar mb;
    JTextArea ta;
    JFileChooser fc;
    JMenuItem m1it1;
    JMenuItem m1it2;
    JMenuItem m1it3;
   public TestDev()
   {
       f=new JFrame("Title");
       f.setLayout(new FlowLayout());
       f.setVisible(true);
       f.setSize(400,500);
       mb=new JMenuBar();
       JMenu m1=new JMenu("File");
       JMenu m2=new JMenu("Edit");
       JMenu m3=new JMenu("View");
       JMenu m4=new JMenu("Help");
       JMenuItem m1it1=new JMenuItem("New");
       JMenuItem m1it2=new JMenuItem("Open");
       JMenuItem m1it3=new JMenuItem("Save");
       fc=new JFileChooser();
       m1.add(m1it1);
       m1.add(m1it2);
       m1.add(m1it3);
       m1.add(m1it1);
       m1.add(m1it2);
       m1.add(m1it3);
       mb.add(m1);
       m1it1.addActionListener(this);
       m1it2.addActionListener(this);
       m1it3.addActionListener(this);
       f.setJMenuBar(mb);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
   public void actionPerformed(ActionEvent ae)
   {
       if(ae.getSource()==m1it1)
       {
            fc.setVisible(true);
       }
   }
    public static void main(String Args[])
    {
        new TestDev();
    }
}
