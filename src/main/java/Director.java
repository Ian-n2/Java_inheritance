public class Director extends Manger {

    private int budget;

    public Director(String name, int niNumber, int salary, String deptName, int budget)
    {super( name, niNumber, salary, deptName);
    this.budget = budget;
    }

    public int getBudget(){
        return this.budget;
    }
    public int payBonus(){
        return super.payBonus() * 2;
    }
}



