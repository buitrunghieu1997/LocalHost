package Testing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SwingControlDemo {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public SwingControlDemo(){
        prepareGUI();
    }

    public static void main(String[] args){
        SwingControlDemo  swingControlDemo = new SwingControlDemo();
        swingControlDemo.showDialogDemo();
    }

    private void prepareGUI(){
        mainFrame = new JFrame("Bài tập tuần 3");
        mainFrame.setSize(600,400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.CENTER);

        statusLabel.setSize(350,100);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showDialogDemo(){
        headerLabel.setText("Bùi Trung Hiếu  MSSV: 20151295 Project1: 666335");

        JButton okButton = new JButton("OK");
        JButton javaButton = new JButton("Yes-No");
        JButton cancelButton = new JButton("Yes-No-Cancel");

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        mainFrame, "Xin tự giói thiệu tớ là Bùi Trung Hiếu, sinh viên năm 3 khoa CNTT ĐHBKHN <3");
            }
        });

        javaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int output = JOptionPane.showConfirmDialog(mainFrame
                        , "Ấn phím bất kỳ"
                        ,"Bùi Trung Hiếu 20151295"
                        ,JOptionPane.YES_NO_OPTION);

                if(output == JOptionPane.YES_OPTION){
                    statusLabel.setText("Bạn chọn có.");
                }else if(output == JOptionPane.NO_OPTION){
                    statusLabel.setText("Bạn chọn không.");
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int output = JOptionPane.showConfirmDialog(mainFrame
                        , "Ấn phím bất kỳ"
                        ,"Bùi Trung Hiếu 20151295"
                        ,JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);

                if(output == JOptionPane.YES_OPTION){
                    statusLabel.setText("Bạn chọn có.");
                }else if(output == JOptionPane.NO_OPTION){
                    statusLabel.setText("Bạn chọn không.");
                }else if(output == JOptionPane.CANCEL_OPTION){
                    statusLabel.setText("Bạn đã hủy.");
                }
            }
        });

        controlPanel.add(okButton);
        controlPanel.add(javaButton);
        controlPanel.add(cancelButton);
        mainFrame.setVisible(true);
    }
}
