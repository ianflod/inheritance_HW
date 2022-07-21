package staff;

public abstract class Employee {

    private String name;
    private int numberNI;
    public int salary;


    public Employee(String name, int numberNI, int salary){
        this.name = name;
        this.numberNI = numberNI;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getNumberNI() {
        return numberNI;
    }

//    public void setNumberNI(int numberNI) {
//        this.numberNI = numberNI;
//    }

    public int getSalary() {
        return salary;
    }

//    public void setSalary(int salary) {
//        this.salary = salary;
//    }

    public double raiseSalary(double raise){
        return this.salary * raise;
    }

    public double payBonus(){
        double bonus = this.salary * 0.01;
         return bonus;
    }
}
