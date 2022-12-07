import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.concurrent.TimeUnit;
import java.time.LocalTime;
import java.awt.Font;
public class time{
public static void main(String args[])throws InterruptedException{
JFrame frame = new JFrame("Time");
JLabel label1 = new JLabel("Hour: ");
label1.setFont(new Font("Hour: ", Font.BOLD, 20));
JLabel label2 = new JLabel("Minute: ");
label2.setFont(new Font("Minute: ", Font.BOLD, 20));
JLabel label3 = new JLabel("Second: ");
label3.setFont(new Font("Second: ", Font.BOLD, 20));
JTextField tf1 = new JTextField();
JTextField tf2 = new JTextField();
JTextField tf3 = new JTextField();
tf1.setBounds(90, 20, 50, 30);
tf2.setBounds(90, 60, 50, 30);
tf3.setBounds(90, 100, 50, 30);
label1.setBounds(5, 20, 100, 30);
label2.setBounds(5, 60, 100, 30);
label3.setBounds(5, 100, 100, 30);
frame.add(tf1);
frame.add(tf2);
frame.add(tf3);
frame.add(label1);
frame.add(label2);
frame.add(label3);
frame.setResizable(false);
frame.setLayout(null);
frame.setLocationRelativeTo(null);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400, 300);
for(int i=0;;i++){
LocalTime lt1 = LocalTime.now();
String h = String.valueOf(lt1.getHour());
tf1.setText(h);
tf1.setFont(new Font(h, Font.BOLD, 20));
String m = String.valueOf(lt1.getMinute());
tf2.setText(m);
tf2.setFont(new Font(m, Font.BOLD, 20));
String s = String.valueOf(lt1.getSecond());
tf3.setText(s);
TimeUnit.SECONDS.sleep(1);
tf3.setFont(new Font(s, Font.BOLD, 20));
}
}
}



