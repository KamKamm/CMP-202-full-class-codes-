package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeometryUI{
    JFrame frame;
    JButton areaOFSquare;
    JButton areaOFTrangle;
    JButton areaOFRectangle;
    JTextField enterLengthOFSquare;
    JButton calculateAreaOFSquare;

    public GeometryUI(){
        frame = new JFrame("Geomtry");
        areaOFSquare = new JButton("Area of sqaure");
        areaOFTrangle = new JButton("Area of triangle");
        areaOFRectangle = new JButton("Area of rectangle");
        enterLengthOFSquare = new JTextField();
        calculateAreaOFSquare = new JButton("calculate");


        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(areaOFSquare);
        panel1.add(enterLengthOFSquare);
        panel1.add(calculateAreaOFSquare);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(areaOFTrangle);


        JPanel Panel3 = new JPanel();
        Panel3.setLayout(new FlowLayout());
        Panel3.add(areaOFRectangle);






    }





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