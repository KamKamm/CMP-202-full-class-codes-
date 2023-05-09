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
    JTextField sideLength;
    JTextField height;
    JTextField base;
    JTextField width;
    JTextField radius;



    public GeometryUI(){
        frame = new JFrame("Geomtry");
        frame.getContentPane().setBackground(Color.darkGray);
        areaOFSquare = new JButton("Area of sqaure");
        areaOFTrangle = new JButton("Area of triangle");
        areaOFRectangle = new JButton("Area of rectangle");
        areaOFCircle = new JButton("Area of circle");

        sideLength = new JTextField();
        height =new JTextField();
        base = new JTextField();
        width = new JTextField();
        radius = new JTextField();


        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(areaOFSquare);
        panel1.add(sideLength);
        panel1.setBackground(Color.DARK_GRAY);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(areaOFTrangle);
        panel2.add(base);
        panel2.add(height);
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

        frame.setVisible(true);

        areaOFSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


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






