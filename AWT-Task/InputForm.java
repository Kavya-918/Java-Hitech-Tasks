import java.awt.*;
import java.awt.event.*;

public class InputForm extends Frame {
    TextField nameField, fatherNameField, addressField;
    Choice genderChoice, courseChoice;
    CheckboxGroup handicraftGroup;
    Checkbox yesCheckbox, noCheckbox;

    public InputForm() {
        setTitle("Input Form");
        setSize(400, 300);
        setLayout(new FlowLayout());//is used to arrange the components in a line,one after another (in a flow). It is the default layout of the applet or panel.

        Label nameLabel = new Label("Name:");
        nameField = new TextField(20);

        Label fatherNameLabel = new Label("Father's Name:");
        fatherNameField = new TextField(20);

        Label genderLabel = new Label("Gender:");
        genderChoice = new Choice();
        genderChoice.add("Male");
        genderChoice.add("Female");
        genderChoice.add("Others");

        Label addressLabel = new Label("Address:");
        addressField = new TextField(20);

        Label courseLabel = new Label("Course:");
        courseChoice = new Choice();
        courseChoice.add("HTML");
        courseChoice.add("CSS");
        courseChoice.add("JavaScript");
        courseChoice.add("DMS");
        courseChoice.add("C");
        courseChoice.add("C++");

        Label handicraftLabel = new Label("Handicraft:");
        handicraftGroup = new CheckboxGroup();
        yesCheckbox = new Checkbox("Yes", handicraftGroup, false);
        noCheckbox = new Checkbox("No", handicraftGroup, true);

        add(nameLabel);
        add(nameField);
        add(fatherNameLabel);
        add(fatherNameField);
        add(genderLabel);
        add(genderChoice);
        add(addressLabel);
        add(addressField);
        add(courseLabel);
        add(courseChoice);
        add(handicraftLabel);
        add(yesCheckbox);
        add(noCheckbox);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        InputForm inputForm = new InputForm();
        inputForm.setVisible(true);
    }
}
