package Employee;

public class ExperienceEmployee extends Employee {
    private int expInYear;

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    private String proSkill;

    @Override
    public void showInfo() {
        // TODO Auto-generated method stub
        System.out.println(toString());
    }
}
