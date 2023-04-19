
package minorproject;

public class StudentInfo {
    private final int id;
    private final String name;
    private final int hwScore;
    private final int tScore;
    
    private final int sTotal;
    private final String sGrade;
    //constructor to get student data values from the database
    StudentInfo(int stude_id, String sName, int homework, int test, int Total, String Grades) {
        this.id = stude_id;
        this.name = sName;
        this.hwScore = homework;
        this.tScore = test;
        this.sTotal = Total;
        this.sGrade = Grades;
    }
    //Encapsulation applied here
    public int getSID()
    {
        //returns student id
        return id;
    }
    public String getSName()
    {
        //returns student name
        return name;
    }
    public int getHScore()
    {
        //returns homework score
        return hwScore;
    }
    public int getSTest()
    {
        //returns student test score
        return tScore;
    }
    public int getTotals()
    {
        return sTotal;
    }
    public String getSGrade()
    {
        return sGrade;
    }
}
