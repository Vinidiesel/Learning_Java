package Entities;

public final class Natural extends Person{

    private Double healthExpenses;

    public Natural() {
        super();
    }

    public Natural(String nome, Double annualIncome, Double healthExpenses) {
        super(nome, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public double taxCalculation() {
        double soma = 0;
        double somaHealth = 0;
        if (getAnnualIncome()<20000){
            soma = getAnnualIncome() * 0.15;
        }else {
            soma = getAnnualIncome() * 0.25;
        }
        if (healthExpenses != 0) {
            somaHealth = healthExpenses * 0.50;
        }
        return soma - somaHealth;
    }
}
