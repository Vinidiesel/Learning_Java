package Entities;

public abstract class Person {

    private String nome;
    private Double annualIncome;

    public Person(){

    }

    public Person(String nome, Double annualIncome) {
        this.nome = nome;
        this.annualIncome = annualIncome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract double taxCalculation();

}
