
package sprocketsarray.jasonhasleton;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class SprocketsArrayJasonHasleton
{

  
    public static void main(String[] args)
    {
        
        InputFile report;
        report = new InputFile("November Orders.txt");

        JFrame jf = new JFrame();
        JTextArea jta = new JTextArea();
        JScrollPane jsp = new JScrollPane(jta);

        jf.setSize(550, 600);
        jf.setLocation(400, 250);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(jsp);
        jf.setVisible(true);

        int c = 0;
        
        while (c < 50)
        {
            c++;
            order[c] = 0;
        }

        c = 0;
              
        while (!report.eof())
        {
            c++;
            order[report.readInt()] += report.readInt();
        }

        displayHeader(jta);
        displayReport(jta, order);

    }

    public static void displayHeader(JTextArea jta)
    {

        jta.append("\n                       SPACELY SPROCKETS\n");
        jta.append("                Taking Sprockets into the Future\n\n");
        jta.append("                       Sales Summary Report\n\n");
        jta.append("Sprocket Number\tTotal Quantity Sold\n");
        jta.append("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n");

    }

    public static void displayReport(JTextArea jta, int[] order)
    {
        int c = 0;

        while (c < 50)
        {
            c++;
            jta.append("           " + c + "\t\t          " + order[c] + "\n");

        }

    }

}
