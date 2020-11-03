package com.cian2;

import com.cian.Course;
import com.cian.Module;
import com.cian.Student;
import org.joda.time.DateTime;

import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {
        Student student1 = new Student("Cian", new DateTime("1994-01-30"));
        Student student2 = new Student("Steven", new DateTime("1992-07-06"));
        Student student3 = new Student("Andrea", new DateTime("1992-06-21"));
        Student student4 = new Student("Julia", new DateTime("1992-06-21"));
        Student student5 = new Student("John", new DateTime("1993-08-13"));

        Module programming = new Module("Programming");
        Module biology = new Module("Biology");
        Module business = new Module("Business");
        Module professionalSkills = new Module("Professional Skills");
        Module physics = new Module("Physics");
        Module dataAnalytics = new Module("DataAnalytics");

        Course computerScience = new Course("CS", new DateTime("2020-01-21"), new DateTime("2024-02-08"));
        Course science = new Course("SC", new DateTime("2017-05-18"), new DateTime("2020-06-27"));
        Course businessIS = new Course("BS", new DateTime("2018-05-26"), new DateTime("2024-04-13"));

        //Computer Science
        computerScience.addModule(programming);
        computerScience.addModule(dataAnalytics);
        computerScience.addModule(professionalSkills);

        //science
        science.addModule(biology);
        science.addModule(dataAnalytics);
        science.addModule(physics);

        //businessIS
        businessIS.addModule(professionalSkills);
        businessIS.addModule(business);
        businessIS.addModule(programming);

        //Student 1
        computerScience.addStudent(student1);

        programming.addStudent(student1);

        professionalSkills.addStudent(student1);

        dataAnalytics.addStudent(student1);

        //Student 2
        science.addStudent(student2);

        biology.addStudent(student2);

        physics.addStudent(student2);

        dataAnalytics.addStudent(student2);

        //Student 3
        businessIS.addStudent(student3);

        programming.addStudent(student3);

        professionalSkills.addStudent(student3);

        dataAnalytics.addStudent(student3);

        //Student 4
        computerScience.addStudent(student4);

        programming.addStudent(student4);

        professionalSkills.addStudent(student4);

        dataAnalytics.addStudent(student4);

        //Student 5
        computerScience.addStudent(student5);

        programming.addStudent(student5);

        professionalSkills.addStudent(student5);

        dataAnalytics.addStudent(student5);

        Arrays.asList(computerScience, science, businessIS)
        .forEach(c -> {
            System.out.println("Course: " + c.getCourseName());
            System.out.println("\tModules: ");
            c.getModuleList().forEach(m -> {
                System.out.println("\t\t" + m.getName());
            });
            System.out.println("\t Students: ");
            c.getStudents().forEach(s -> {
                System.out.println("\t\t ID: " + s.getId());
                System.out.println("\t\t Username:" + s.getUsername());
                System.out.println("\t\t Name:" + s.getName());
                System.out.println("\t\t Age:" + s.getAge());
                System.out.println("\t\t Student Courses:");
                s.getCourses().forEach(sc -> System.out.println("\t\t\t Course:"+sc.getCourseName()));
                System.out.println("\t\t Modules:");
                s.getModules().forEach(m -> System.out.println("\t\t\t Module:"+m.getName()));
            });
        });
    }
}
