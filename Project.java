package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{

    Project(){
        setSize(700,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons//img2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700,400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);


        setLocation(300,200);

        JMenuBar mb=new JMenuBar();
        JMenu NewInformation =new JMenu("New Information");
        mb.add(NewInformation);
        NewInformation.setForeground(Color.blue);
        

        JMenuItem facultyinfo=new JMenuItem("New Faculty INfo");
        facultyinfo.setForeground(Color.black);
        NewInformation.add(facultyinfo);

        JMenuItem studentinfo=new JMenuItem("New student INfo");
        studentinfo.setForeground(Color.black);
        NewInformation.add(studentinfo);

        JMenu viewDetails =new JMenu("View Details");
        mb.add(viewDetails);
        viewDetails.setForeground(Color.blue);
        

        JMenuItem viewfacultydetails =new JMenuItem("View Faculty Details");
        viewDetails.add(viewfacultydetails);

        JMenuItem viewstudentdetails= new JMenuItem("View Student Details");
        viewDetails.add(viewstudentdetails);

        JMenu applyleave =new JMenu("Apply Leave");
        mb.add(applyleave);
        applyleave.setForeground(Color.BLUE);

        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        applyleave.add(facultyleave);

        JMenuItem studentleave = new JMenuItem("Student Leave");
        applyleave.add(studentleave);

        JMenu leavedetails =new JMenu("Leave Details");
        mb.add(leavedetails);
        leavedetails.setForeground(Color.BLUE);

        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
        leavedetails.add(facultyleavedetails);

        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
        leavedetails.add(studentleavedetails);

        JMenu updatedetails =new JMenu("Update Info");
        mb.add(updatedetails);
        updatedetails.setForeground(Color.BLUE);

        JMenuItem updatefacultytails = new JMenuItem("Update Faculty Details");
        updatedetails.add(updatefacultytails);

        JMenuItem updatestudentdetails = new JMenuItem("Update Student Details");
        updatedetails.add(updatestudentdetails);

        JMenu utility =new JMenu("Utility");
        mb.add(utility);
        utility.setForeground(Color.BLUE);

        JMenuItem notepad = new JMenuItem("NotePad");
        utility.add(notepad);
        notepad.addActionListener(this);

        JMenuItem calculator = new JMenuItem("Calculator");
        utility.add(calculator);
        calculator.addActionListener(this);

        JMenu exit =new JMenu("Exit");
        mb.add(exit);
        exit.setForeground(Color.BLUE);

        JMenuItem ex = new JMenuItem("Exit");
        exit.add(ex);
        ex.addActionListener(this);







        setJMenuBar(mb);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae){
        String msg=ae.getActionCommand();

        if(msg=="Exit"){
            setVisible(false);
        }else if(msg=="Calculator"){
            try{
                Runtime.getRuntime().exec("calc.exe");

            }catch(Exception e){}

    

        }else{

            try{
                Runtime.getRuntime().exec("notepad.exe");

            }catch(Exception e){}

        }



    }

    public static void main() {

        new Project();
        
    }
    
}
