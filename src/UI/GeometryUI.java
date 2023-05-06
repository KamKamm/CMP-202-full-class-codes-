package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeometryUI{
    JFrame frame;
    JButton areaOFSquare;
    JButton areaOFTrangle;




}






class gui{
    public static void main(String args[]){
        JFrame frame = new JFrame("Geometry UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button  = new JButton("CLICK TO GET STARTED");
        frame.getContentPane().add(button); // this adds button to the content pane of frame
        frame.setVisible(true);

    }
}