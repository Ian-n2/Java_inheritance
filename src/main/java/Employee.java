public abstract class Employee {

    private String name;
    private int niNumber;
    private int salary;

    public String getName() {
        return name;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(String name, int niNumber, int salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String setName(String name) {
        this.name = name;
        if(name == ""){
            this.name = "INVALID NAME";
        }
        return name;
    }
    //    public double raiseSalary(double raise ){
//     return (this.salary += raise);
//    }
// code refactored

    public double raiseSalary(double raise){
        if(raise > 0) {
            return (this.salary += raise);
        }
        return this.salary;
    }


    public int payBonus(){
        return this.salary / 100;
    }


}
