public class Manger extends Employee {

    private String deptName;



    public Manger(String name, int niNumber, int salary, String deptName)
    { super(name, niNumber, salary);
                this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }

}
