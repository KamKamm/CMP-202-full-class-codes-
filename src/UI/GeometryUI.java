package UI;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeometryUI{
    JFrame frame;
    JButton areaOFSquare;
    JButton areaOFTrangle;
    JButton areaOFRectangle;
//    JTextField enterLengthOFSquare;
//    JButton calculateAreaOFSquare;

    public GeometryUI(){
        frame = new JFrame("Geomtry");
        areaOFSquare = new JButton("Area of sqaure");
        areaOFTrangle = new JButton("Area of triangle");
        areaOFRectangle = new JButton("Area of rectangle");
//       enterLengthOFSquare = new JTextField();
//        calculateAreaOFSquare = new JButton("calculate");


        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(areaOFSquare);
      //  panel1.add(enterLengthOFSquare);
      //  panel1.add(calculateAreaOFSquare);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(areaOFTrangle);


        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        panel3.add(areaOFRectangle);

        frame.setLayout(new GridLayout(3,1));
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.setSize(300,150);
        frame.setVisible(true);

        areaOFSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

//        calculateAreaOFSquare.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });

        areaOFRectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        areaOFTrangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });




    }





}






