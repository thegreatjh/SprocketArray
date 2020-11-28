
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

        int c=0;
        
        int[] order;
        order = new int[51];
        order[1] = 0;
        order[2] = 0;
        order[3] = 0;
        order[4] = 0;
        order[5] = 0;
        order[6] = 0;
        order[7] = 0;
        order[8] = 0;
        order[9] = 0;
        order[10] = 0;
        order[11] = 0;
        order[12] = 0;
        order[13] = 0;
        order[14] = 0;
        order[15] = 0;
        order[16] = 0;
        order[17] = 0;
        order[18] = 0;
        order[19] = 0;
        order[20] = 0;
        order[21] = 0;
        order[22] = 0;
        order[23] = 0;
        order[24] = 0;
        order[25] = 0;
        order[26] = 0;
        order[27] = 0;
        order[28] = 0;
        order[29] = 0;
        order[30] = 0;
        order[31] = 0;
        order[32] = 0;
        order[33] = 0;
        order[34] = 0;
        order[35] = 0;
        order[36] = 0;
        order[37] = 0;
        order[38] = 0;
        order[39] = 0;
        order[40] = 0;
        order[41] = 0;
        order[42] = 0;
        order[43] = 0;
        order[44] = 0;
        order[45] = 0;
        order[46] = 0;
        order[47] = 0;
        order[48] = 0;
        order[49] = 0;
        order[50] = 0;
              
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
