package pro.domain;
import pro.service.Status;
import jdk.jshell.Snippet;

public class Programmer extends Employee{
    private int memberId; //开发团队中的ID
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer(){
        super();
    }

    public Programmer(int id,String name ,int age,double salary,Equipment equipment){
        super(id,name,age,salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
    public String toString(){
        return super.getDetails()+"\t程序员\t"+status+"\t\t\t" + equipment.getDescription();
    }
    public String getDetailsForTeam(){
        return memberId+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary()+"\t程序员";
    }
}
