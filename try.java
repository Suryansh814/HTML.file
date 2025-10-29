// AWTStudentForm.java
import java.awt.*;
import java.awt.event.*;

public class AWTStudentForm extends Frame implements ActionListener {
    Label lblName, lblRoll, lblCourse;
    TextField txtName, txtRoll, txtCourse;
    Button btnSubmit, btnClear;

    public AWTStudentForm() {
        setLayout(new GridLayout(4, 2, 5, 5));
        setTitle("Student Form");
        setSize(350, 200);

        lblName = new Label("Name:");
        txtName = new TextField();
        lblRoll = new Label("Roll:");
        txtRoll = new TextField();
        lblCourse = new Label("Course:");
        txtCourse = new TextField();
        btnSubmit = new Button("Submit");
        btnClear = new Button("Clear");

        add(lblName); add(txtName);
        add(lblRoll); add(txtRoll);
        add(lblCourse); add(txtCourse);
        add(btnSubmit); add(btnClear);

        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) { dispose(); }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnSubmit) {
            System.out.println("Submitted Data:");
            System.out.println("Name: " + txtName.getText());
            System.out.println("Roll: " + txtRoll.getText());
            System.out.println("Course: " + txtCourse.getText());
        } else if (ae.getSource() == btnClear) {
            txtName.setText("");
            txtRoll.setText("");
            txtCourse.setText("");
        }
    }

    public static void main(String[] args) {
        new AWTStudentForm();
    }
}
