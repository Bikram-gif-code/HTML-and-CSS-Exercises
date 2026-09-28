package advancejava;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;

public class ChatFormSimple implements ActionListener {
    JLabel lbltext;
    JTextField txtmsg;
    JButton send;
    JButton btnsend;
    JButton btnreset;
    
    JTextArea txtarea;
    JPanel panel;
    JFrame frame;
     public void createForm(){
         lbltext=new JLabel("enter text:");
         txtmsg=new JTextField(10);
         btnsend=new JButton("send");
         btnsend.addActionListener(this);
         btnreset=new JButton("Reset");
         btnreset.addActionListener(this);
         panel=new JPanel();
         panel.add(lbltext);
         panel.add(txtmsg);
         panel.add(btnsend);
         panel.add(btnreset);
         
       Border blackline = BorderFactory.createEmptyBorder(5,5,5,5);
        panel.setBorder(blackline);
        panel.setBorder(BorderFactory.createTitledBorder("Chat"));

        txtarea = new JTextArea();
        txtarea.setLineWrap(true);
        txtarea.setEditable(false);
        txtarea.setForeground(Color.blue);
        Font font=new Font("Dotum",Font.BOLD,18);
        txtarea.setFont(font);

        frame = new JFrame("Chat Frame");          
        frame.getContentPane().add(BorderLayout.CENTER, txtarea);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
         
    }
     public void actionPerformed(ActionEvent e){
         if(e.getSource().equals(btnsend)){
             if(btnsend.getText()!=""){
                 txtarea.append(" "+txtmsg.getText()+"\n");
                 txtmsg.setText("");
             }
         }
         if(e.getSource().equals(btnreset)){
             txtmsg.setText("");
         }
     }
     
     public static void main(String args[]){
         ChatFormSimple chat=new ChatFormSimple();
         chat.createForm();
     }
    
   }



####################Suman###############################

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InformationComplete implements ActionListener {

    JLabel lblname, lbladdress, lbllevel;
    JTextField txtname, txtaddress, txtlevel;
    JButton btnregister;
    JFrame frame;
    JPanel panel;

    void display() {
        // Create labels
        lblname    = new JLabel("Name: ");
        lbladdress = new JLabel("Address: ");
        lbllevel   = new JLabel("Level: ");

        // Create text fields
        txtname    = new JTextField(10);
        txtaddress = new JTextField(10);
        txtlevel   = new JTextField(10);

        // Create button
        btnregister = new JButton("register");
        btnregister.addActionListener(this);

        // Set positions
        lblname.setBounds(10, 20, 80, 25);
        lbladdress.setBounds(10, 60, 80, 25);
        lbllevel.setBounds(10, 100, 80, 25);

        txtname.setBounds(100, 20, 160, 25);
        txtaddress.setBounds(100, 60, 160, 25);
        txtlevel.setBounds(100, 100, 160, 25);

        btnregister.setBounds(100, 150, 100, 25);

        // Panel holds all components
        panel = new JPanel();
        panel.setLayout(null);
        panel.add(lblname);
        panel.add(lbladdress);
        panel.add(lbllevel);
        panel.add(txtname);
        panel.add(txtaddress);
        panel.add(txtlevel);
        panel.add(btnregister);

        // Frame settings
        frame = new JFrame("Data Entry Form...");
        frame.add(panel);
        frame.setSize(320, 240);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnregister)) {
            if (txtname.getText().isEmpty() != true) {
                JOptionPane.showMessageDialog(frame, "Successfully registered...");

                String tname    = txtname.getText();
                String taddress = txtaddress.getText();
                String tlevel   = txtlevel.getText();

                newDisplay(tname, taddress, tlevel);
            } else {
                JOptionPane.showMessageDialog(frame, "Don't leave empty fields...");
            }
        }
    }

    void newDisplay(String tname, String taddress, String tlevel) {
        // Labels (titles)
        JLabel lblName    = new JLabel("Name:");
        JLabel lblAddress = new JLabel("Address:");
        JLabel lblLevel   = new JLabel("Level:");

        // Labels (values)
        JLabel lbl_name    = new JLabel(tname);
        JLabel lbl_address = new JLabel(taddress);
        JLabel lbl_level   = new JLabel(tlevel);

        lblName.setBounds(10, 20, 80, 25);
        lblAddress.setBounds(10, 60, 80, 25);
        lblLevel.setBounds(10, 100, 80, 25);

        lbl_name.setBounds(100, 20, 160, 25);
        lbl_address.setBounds(100, 60, 160, 25);
        lbl_level.setBounds(100, 100, 160, 25);

        // New panel for the result window
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.add(lblName);
        panel2.add(lblAddress);
        panel2.add(lblLevel);
        panel2.add(lbl_name);
        panel2.add(lbl_address);
        panel2.add(lbl_level);

        // New frame for the result window
        JFrame frame2 = new JFrame("Registered Details");
        frame2.add(panel2);
        frame2.setSize(300, 200);
        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
    }

    public static void main(String args[]) {
        InformationComplete info = new InformationComplete();
        info.display();
    }
}