package entities;

public class Funcionarios {
    private Integer id;
    private String name;
    private Double salary;

    public Funcionarios(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(Double percentage){
        salary += salary * percentage / 100.0;
    }
    public String toString(){
        //333, Maria Brown, 4000.0
        return id+
                ", "
                +name
                +", "
                +salary;
    }
}
