package SportsManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableTennis extends JFrame implements ActionListener {
    JLabel l1;
    JButton back,addPlayers,viewPlayerList;


    public void actionPerformed(ActionEvent ae){try{
        if(ae.getSource()==back){
            new Dashboard().setVisible(true);
            setVisible(false);
        }else if (ae.getSource()==addPlayers){
            new AddPlayer("tabletennis").setVisible(true);
            setVisible(false);
        }else if(ae.getSource()==viewPlayerList){
            new ViewPlayerList("tabletennis").setVisible(true);
            setVisible(false);
        
        }
    }catch (Exception e){
        System.out.println(e);
    }}

    TableTennis(){
        setTitle("SPORTS MANAGEMENT SYSTEM");
        setLayout(null);

        l1 = new JLabel("Manage Table Tennis Team");
        l1.setFont(new Font("Osward",Font.BOLD,22));
        l1.setBounds(260,40,450,40);
        add(l1);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(20,10,100,40);
        add(back);

        addPlayers = new JButton("Add Player");
        addPlayers.setBackground(Color.BLACK);
        addPlayers.setForeground(Color.WHITE);
        addPlayers.setBounds(150,120,150,80);
        add(addPlayers);

      

        viewPlayerList = new JButton("View Players List");
        viewPlayerList.setBackground(Color.BLACK);
        viewPlayerList.setForeground(Color.WHITE);
        viewPlayerList.setBounds(450,280,150,80);
        add(viewPlayerList);

        back.addActionListener(this);
        addPlayers.addActionListener(this);
        
        viewPlayerList.addActionListener(this);


        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setLocation(450, 200);
        setVisible(true);
    }
}