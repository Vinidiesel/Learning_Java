package entities;

public class Student {

    public String name;
    public double first;
    public double second;
    public double third;
    public double finalGrade;
    public double missing;
    public String approved;

    public void approved(){
        finalGrade=first+second+third;
        if(finalGrade>60){
            approved="PASS";

        }else {
            missing=60-finalGrade;
            approved="FAILED";
        }
    }
}
