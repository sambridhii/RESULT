package model;

import java.util.ArrayList;

public class Section {
    ArrayList<Student> student_list = new ArrayList<>();

    public ArrayList<Student> getStudent_list() {
        return student_list;
    }

    public void setStudent_list(ArrayList<Student> student_list) {
        this.student_list = student_list;
    }

    public String getSection_name() {
        return section_name;
    }

    public void setSection_name(String section_name) {
        this.section_name = section_name;
    }

    String section_name ;
    public Section(ArrayList<Student> student_list, String section_name) {
        this.student_list = student_list;
        this.section_name = section_name;
    }



}
