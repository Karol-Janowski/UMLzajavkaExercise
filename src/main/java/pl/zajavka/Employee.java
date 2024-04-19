package main.java.pl.zajavka;
import java.math.BigDecimal;
public abstract class Employee {
    private static final String SALARY = "5999";
    public Employee(final Integer age, final String surname) {
        this.age = age;
        this.surname = surname;
    }
    private String name;
    Integer age;
    protected String surname;
    public BigDecimal salary;
    abstract String opinion();
    private void goToWork(String name, String surname) {
    }
    boolean satisfied(boolean force) {
        return force;
    }
    public static BigDecimal expectedSalary() {
        return BigDecimal.valueOf(6900.20);
    }
}
