import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.CollationElementIterator;

public class TeacherGui{
    public static void guiField() {
        GridBagConstraints gbc = new GridBagConstraints();
        /*upper panel */
        JPanel upperPanel = new JPanel();
        upperPanel.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        upperPanel.setLayout(new BorderLayout());
        /*textFields and labels for each attribute of teacher*/

        JLabel teacherId = new JLabel("Teacher Id: ");
        JTextField teacherIdField = new JTextField(16);
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.anchor=GridBagConstraints.WEST;
        upperPanel.add(teacherId,BorderLayout.WEST);

        gbc.gridx=1;
        gbc.gridy=0;
        upperPanel.add(teacherIdField);

        JLabel teacherName = new JLabel("Teacher Name: ");
        JTextField teacherNameField = new JTextField(16);

        JLabel address = new JLabel("Address: ");
        JTextField addressField = new JTextField();

        JLabel workingType = new JLabel("Working Type: ");
        JTextField workingtypeField = new JTextField();

        JLabel employmentStatus = new JLabel("Employment Status");
        JTextField employmentStatusField = new JTextField();

        JLabel workingHours = new JLabel("Wokring Hours");
        JTextField workingHoursField = new JTextField();








        /*lower panel*/
        JPanel lowerPanel = new JPanel();
        lowerPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));



        JFrame mainFrame = new JFrame("Welcome ");
        //component adding in mainFrame
        mainFrame.add(upperPanel);
        mainFrame.add(lowerPanel);


        mainFrame.setLayout(new GridLayout(2,1));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400,600);
        mainFrame.setVisible(true);
    }




    public static void guiForTeacher() {
        GridBagConstraints gbc = new GridBagConstraints();
        /*top panel */
        JLabel labelForIntro = new JLabel("hello");
        labelForIntro.setBackground(Color.GRAY);
        labelForIntro.setHorizontalAlignment(JLabel.CENTER);



        /*left panel */
        JPanel leftPanel = new JPanel();
        JPanel insideLeftPanel = new JPanel();
        leftPanel.setLayout(new BorderLayout());
        leftPanel.add(insideLeftPanel,BorderLayout.NORTH);
        insideLeftPanel.setLayout(new GridBagLayout());

        /*textFields and labels for each attribute of teacher*/
            //teacherId entry field and label
        JLabel teacherId = new JLabel("Teacher Id: ");
        teacherId.setFont(new Font("Serif",Font.BOLD,20));
        JTextField teacherIdField = new JTextField(20);
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(-300,-50,0,0);
        insideLeftPanel.add(teacherId,gbc);
        gbc.gridx=1;
        gbc.gridy=0;
        gbc.insets = new Insets(-295,30,0,0);
        insideLeftPanel.add(teacherIdField,gbc);

            ////teacherName entry field and label
        JLabel teacherName = new JLabel("Name: ");
        JTextField teacherNameField = new JTextField(20);
        teacherName.setFont(new Font("Serif",Font.BOLD,20));
        gbc.insets = new Insets(-200,-60,0,0);
        insideLeftPanel.add(teacherName,gbc);
        gbc.insets = new Insets(-195,30,0,0);
        insideLeftPanel.add(teacherNameField,gbc);

            ///teacher Address entry field and label
        JLabel address = new JLabel("Address: ");
        JTextField addressField = new JTextField(20);
        address.setFont(new Font("Serif",Font.BOLD,20));
        gbc.insets = new Insets(-100,-70,0,0);
        insideLeftPanel.add(address,gbc);
        gbc.insets = new Insets(-95,30,0,0);
        insideLeftPanel.add(addressField,gbc);

            //teacher's working type entry field and label
        JLabel workingType = new JLabel("Working Type: ");
        JTextField workingTypeField = new JTextField(20);
        workingType.setFont(new Font("Serif",Font.BOLD,20));
        gbc.insets = new Insets(100,-130,0,0);
        insideLeftPanel.add(workingType,gbc);
        gbc.insets = new Insets(105,30,0,0);
        insideLeftPanel.add(workingTypeField,gbc);

            //teacher's employmentStatus entry field and label
        JLabel employmentStatus = new JLabel("Employed Status:");
        JTextField employmentStatusField = new JTextField(20);
        employmentStatus.setFont(new Font("Serif",Font.BOLD,20));
        gbc.insets = new Insets(200,-130,0,0);
        insideLeftPanel.add(employmentStatus,gbc);
        gbc.insets = new Insets(205,30,0,0);
        insideLeftPanel.add(employmentStatusField,gbc);

            //teacher's Working hours field and label
        JLabel workingHours = new JLabel("Working Hours: ");
        JTextField workingHoursField = new JTextField(20);
        workingHours.setFont(new Font("Serif",Font.BOLD,20));
        gbc.insets = new Insets(300,-130,0,0);
        insideLeftPanel.add(workingHours,gbc);
        gbc.insets = new Insets(305,30,0,0);
        insideLeftPanel.add(workingHoursField,gbc);

        /*upperright panel*/
        JPanel upperRightPanel = new JPanel();
        upperRightPanel.setLayout(new GridLayout(1,1));
        JPanel insideUpperRightPanel = new JPanel();
        upperRightPanel.add(insideUpperRightPanel);
        GridBagConstraints gbcForInsideUpperRightPanel = new GridBagConstraints();
        insideUpperRightPanel.setLayout(new GridBagLayout());

        leftPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        upperRightPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        /*labels and fields for Lecturer*/
            //field and label for lecturer department attribute
        JLabel department = new JLabel("Department: ");
        department.setFont(new Font("Serif",Font.BOLD,20));
        JTextField departmentField = new JTextField(20);
        gbcForInsideUpperRightPanel.insets = new Insets(-250,300,0,0);
        insideUpperRightPanel.add(department,gbcForInsideUpperRightPanel);
        gbcForInsideUpperRightPanel.insets = new Insets(-245,10,0,0);
        insideUpperRightPanel.add(departmentField,gbcForInsideUpperRightPanel);

            //field and label for lecturer Experience attribute
        JLabel experienceYears = new JLabel("Experience yrs:");
        experienceYears.setFont(new Font("Serif",Font.BOLD,20));
        JTextField experienceYearsField = new JTextField(20);
        gbcForInsideUpperRightPanel.insets = new Insets(-110,-250,0,0);
        gbcForInsideUpperRightPanel.gridx=0;
        gbcForInsideUpperRightPanel.gridy=1;
        insideUpperRightPanel.add(experienceYears,gbcForInsideUpperRightPanel);
        gbcForInsideUpperRightPanel.insets = new Insets(-105,-510,0,0);
        gbcForInsideUpperRightPanel.gridx=1;
        gbcForInsideUpperRightPanel.gridy=1;
        insideUpperRightPanel.add(experienceYearsField,gbcForInsideUpperRightPanel);

            //field and label for lecturer to score grade for students
        JLabel gradedScore = new JLabel("Graded Score: ");
        gradedScore.setFont(new Font("Serif",Font.BOLD,20));
        JTextField gradedScoreField = new JTextField(20);
        gbcForInsideUpperRightPanel.gridx=0;
        gbcForInsideUpperRightPanel.gridy=2;
        gbcForInsideUpperRightPanel.insets = new Insets(0,0,0,-280);
        insideUpperRightPanel.add(gradedScore,gbcForInsideUpperRightPanel);
        gbcForInsideUpperRightPanel.gridx=1;
        gbcForInsideUpperRightPanel.gridy=2;
        gbcForInsideUpperRightPanel.insets = new Insets(5,0,0,0);
        insideUpperRightPanel.add(gradedScoreField,gbcForInsideUpperRightPanel);

        /*Buttons panel for rightUpperPanel*/
        //Buttons for adding Lecturer and assigning grades
        JButton addLecturerBtn = new JButton("Add lecturer");
        addLecturerBtn.setFocusable(false);
        gbcForInsideUpperRightPanel.gridx=0;
        gbcForInsideUpperRightPanel.gridy=3;
        gbcForInsideUpperRightPanel.insets = new Insets(0,10,-200,0);
        insideUpperRightPanel.add(addLecturerBtn,gbcForInsideUpperRightPanel);

        JButton gradeScore = new JButton("Grade Score");
        gradeScore.setFocusable(false);
        gbcForInsideUpperRightPanel.gridx=1;
        gbcForInsideUpperRightPanel.gridy=3;
        gbcForInsideUpperRightPanel.insets = new Insets(3,-200,-200,0);
        insideUpperRightPanel.add(gradeScore,gbcForInsideUpperRightPanel);

        /*field and attributes of Tutor*/
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBorder(BorderFactory.createLineBorder(Color.red));


        bottomPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbcForBottomPanel = new GridBagConstraints();

        JLabel salary = new JLabel("Salary: ");
        salary.setFont(new Font("Serif",Font.BOLD,20));
        JTextField salaryField = new JTextField(16);
        gbcForBottomPanel.gridx=2;
        gbcForBottomPanel.gridy=0;
        gbcForBottomPanel.gridwidth=200;
        gbcForBottomPanel.insets = new Insets(-250,0,0,-285);
        bottomPanel.add(salary,gbcForBottomPanel);
        gbcForBottomPanel.gridx=3;
        gbcForBottomPanel.gridy=0;
        gbcForBottomPanel.insets = new Insets(-245,0,0,-490);
        bottomPanel.add(salaryField,gbcForBottomPanel);

        JLabel specialization = new JLabel("Specialization: ");
        specialization.setFont(new Font("Serif",Font.BOLD,20));
        JTextField specializationField = new JTextField(16);
        gbcForBottomPanel.gridx=2;
        gbcForBottomPanel.gridy=2;

        gbcForBottomPanel.insets = new Insets(-80,0,0,-220);
        bottomPanel.add(specialization,gbcForBottomPanel);
        gbcForBottomPanel.gridx=3;
        gbcForBottomPanel.gridy=2;
        gbcForBottomPanel.insets = new Insets(-75,0,0,-490);
        bottomPanel.add(specializationField,gbcForBottomPanel);

        JLabel academicQualification = new JLabel("Academic Qualification: ");
        academicQualification.setFont(new Font("Serif",Font.BOLD,20));
        JTextField academicQualificationField = new JTextField(16);
        gbcForBottomPanel.gridx=0;
        gbcForBottomPanel.gridy=0;
        gbcForBottomPanel.insets = new Insets(-250,-310,0,0);
        bottomPanel.add(academicQualification,gbcForBottomPanel);
        gbcForBottomPanel.gridx=1;
        gbcForBottomPanel.gridy=0;
        gbcForBottomPanel.insets = new Insets(-245,-50,0,0);
        bottomPanel.add(academicQualificationField,gbcForBottomPanel);

        JLabel performanceIndex = new JLabel("Performance Index: ");
        performanceIndex.setFont(new Font("Serif",Font.BOLD,20));
        JTextField performanceIndexField = new JTextField(16);
        gbcForBottomPanel.gridx=0;
        gbcForBottomPanel.gridy=2;
        gbcForBottomPanel.insets = new Insets(-85,-300,0,0);
        bottomPanel.add(performanceIndex,gbcForBottomPanel);
        gbcForBottomPanel.gridx=1;
        gbcForBottomPanel.gridy=2;
        gbcForBottomPanel.insets = new Insets(-75,-60,0,0);
        bottomPanel.add(performanceIndexField,gbcForBottomPanel);

        /*Button for adding tutor and set salary*/
        JButton salaryBtn = new JButton("Set Salary");
        salaryBtn.setFocusable(false);
        gbcForBottomPanel.gridx =1;
        gbcForBottomPanel.gridy=3;
        gbcForBottomPanel.insets = new Insets(0,-200,-100,0);
        bottomPanel.add(salaryBtn,gbcForBottomPanel);

        JButton removeTutorBtn = new JButton("remove tutor");
        removeTutorBtn.setFocusable(false);
        gbcForBottomPanel.insets = new Insets(0,0,-100,-200);
        bottomPanel.add(removeTutorBtn,gbcForBottomPanel);







        JFrame mainFrame = new JFrame("Welcome ");
        //component adding in mainFrame
        JPanel insideFrameBottomPanels = new JPanel();
        insideFrameBottomPanels.add(leftPanel);
        insideFrameBottomPanels.add(upperRightPanel);
        insideFrameBottomPanels.add(bottomPanel);
        insideFrameBottomPanels.setLayout(new GridLayout(2,1,10,0));

        mainFrame.add(labelForIntro,BorderLayout.NORTH);
        mainFrame.add(insideFrameBottomPanels);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1000,1000);
        mainFrame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
//        guiField();
        guiForTeacher();

    }


}
