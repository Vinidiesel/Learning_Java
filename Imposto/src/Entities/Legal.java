package Entities;

public final class Legal extends Person{

    private Integer employeesNumbers;

    public Legal(){
        super();
    }

    public Legal(String nome, Double annualIncome, Integer employeesNumbers) {
        super(nome, annualIncome);
        this.employeesNumbers = employeesNumbers;
    }

    public Integer getEmployeesNumbers() {
        return employeesNumbers;
    }

    public void setEmployeesNumbers(Integer employeesNumbers) {
        this.employeesNumbers = employeesNumbers;
    }

    @Override
    public double taxCalculation() {
        double soma = 0;
        if (employeesNumbers<10){
            soma = getAnnualIncome() * 0.16;
        }else {
            soma = getAnnualIncome() * 0.14;
        }
        return soma;
    }
}
