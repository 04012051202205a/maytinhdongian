
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class TinhToandonGian extends JFrame{
    private  JLabel lb1,lb2,lb3;
    private JTextField txtso1,txtso2,txtkq;
    private JButton btcong,bttru,btchia,btnhan;
    
    
    public TinhToandonGian (){
        setTitle("Tính toán đơn giản");
        taoGiaoDien();
        setSize(300, 250);
        setLocationRelativeTo(null);
        
        
    }
    public static void main(String[] args) {
        TinhToandonGian frm= new TinhToandonGian();
        frm.setVisible(true);
        
    }

    private void taoGiaoDien() {
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(3,2,5,5));
        p1.add(lb1=new JLabel("Số 1"));
        p1.add(txtso1=new JTextField());
        p1.add(lb2=new JLabel("Số 2"));
        p1.add(txtso2=new JTextField());
        p1.add(lb3=new JLabel("Kết quả"));
        p1.add(txtkq=new JTextField());
        JPanel p2=new JPanel();
        p2.add(btcong=new JButton("Cộng"));
        p2.add(bttru=new JButton("Trừ"));
        p2.add(btnhan=new JButton("Nhân"));
        p2.add(btchia=new JButton("Chia"));
        setLayout(new BorderLayout());
       add(p1,BorderLayout.CENTER);
       add(p2,BorderLayout.SOUTH);
       btcong.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(txtso1.getText());
               double y = Double.parseDouble(txtso2.getText());
               double kq=x+y;
               txtkq.setText(String.valueOf(kq));
            }       
       });
       btchia.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(txtso1.getText());
               double y = Double.parseDouble(txtso2.getText());
               double kq=x/y;
               txtkq.setText(String.valueOf(kq));
            }       
       });
       bttru.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(txtso1.getText());
               double y = Double.parseDouble(txtso2.getText());
               double kq=x-y;
               txtkq.setText(String.valueOf(kq));
            }       
       });
       btnhan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(txtso1.getText());
               double y = Double.parseDouble(txtso2.getText());
               double kq=x*y;
               txtkq.setText(String.valueOf(kq));
            }       
       });
       
    }
    
    
}
