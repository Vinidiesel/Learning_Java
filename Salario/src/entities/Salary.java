package entities;

public class Salary {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary-tax;
    }

    public void increaseSalary(double percentage){
        percentage  = grossSalary * (percentage/100);
        grossSalary += percentage;
    }

    public String toString(){
        return "Employee: "
                +name+
                ", $"
                +netSalary();
    }
}
