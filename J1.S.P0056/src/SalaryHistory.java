
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Long1
 */
public class SalaryHistory extends Worker/* implements Comparable<SalaryHistory>*/{

    private String status;
    private String date;

    public SalaryHistory() {
    }

    public SalaryHistory(String status, String date, String code, String name, int age, double salary, String workLocation) {
        super(code, name, age, salary, workLocation);
        this.status = status;
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

//    @Override
//    public int compareTo(SalaryHistory sh) {
//        return this.getCode().compareTo(sh.getCode());
//    }

}
