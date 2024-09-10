import javax.swing.*;  
import java.awt.*;  
import java.awt.event.ActionListener;

public class TinhToanNangCao extends JFrame {  
    public TinhToanNangCao() {  
        // Thiết lập giao diện  
        setTitle("Máy Tính Đơn Giản");  
        setSize(300, 300);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(new BorderLayout());  

        // Tạo ô hiển thị  
        JTextField display = new JTextField();  
        display.setEditable(false);  
        display.setHorizontalAlignment(JTextField.RIGHT);  
        add(display, BorderLayout.NORTH); 
        display.setLayout(new GridLayout(2,3));
        // Tạo bảng phím  
        JPanel panel = new JPanel();  
        panel.setLayout(new GridLayout(4,4 ));  

        // Các nút số và phép toán  
        String[] buttons = {
            "7", "8", "9", "+",  
            "4", "5", "6", "-",  
            "1", "2", "3", "*",  
            "0", "-", "=", "/"  
        };  

        for (String text : buttons) {  
            JButton button = new JButton(text);  
            panel.add(button);  
        }  

        add(panel, BorderLayout.CENTER);  
    }  

    public static void main(String[] args) {  
        SwingUtilities.invokeLater(() -> {  
            TinhToanNangCao calculatorUI = new TinhToanNangCao();  
            calculatorUI.setVisible(true);  
        });  
    }  
}