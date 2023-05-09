package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
public class GeometryUI{
    JFrame frame;
    JButton areaOFSquare;
    JButton areaOFTrangle;
    JButton areaOFRectangle;
    JButton areaOFCircle;
//    JTextField enterLengthOFSquare;
//    JButton calculateAreaOFSquare;

    public GeometryUI(){
        frame = new JFrame("Geomtry");
        frame.getContentPane().setBackground(Color.darkGray);
//        frame.setSize(400,400);
//        frame.setVisible(true);
        areaOFSquare = new JButton("Area of sqaure");
//        areaOFSquare.setForeground(Color.white);
        areaOFTrangle = new JButton("Area of triangle");
        areaOFRectangle = new JButton("Area of rectangle");
        areaOFCircle = new JButton("Area of circle");
//       enterLengthOFSquare = new JTextField();
//        calculateAreaOFSquare = new JButton("calculate");


        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(areaOFSquare);
        panel1.setBackground(Color.DARK_GRAY);
      //  panel1.add(enterLengthOFSquare);
      //  panel1.add(calculateAreaOFSquare);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(areaOFTrangle);
        panel2.setBackground(Color.DARK_GRAY);


        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        panel3.add(areaOFRectangle);
        panel3.setBackground(Color.DARK_GRAY);

        JPanel panel4 = new JPanel();
        panel4.setLayout(new FlowLayout());
        panel4.add(areaOFCircle);
        panel4.setBackground(Color.DARK_GRAY);

        frame.setLayout(new GridLayout(4,1));
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.setSize(250,200);
//        frame.setContentPane(Color.darkGray);
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
        areaOFCircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });




    }





}






