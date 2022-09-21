 package Snacks;

public class StudentGrades {
    String name;
    String letterGrade;
    public StudentGrades(String name,String letterGrade){
        this.name = name;

        this.letterGrade = letterGrade;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

     public void setLetterGrade(String name){
        this.name = name;
     }
     public String getLetterGrade(){
        return letterGrade;
     }

    }

