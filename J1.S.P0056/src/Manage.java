
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Manage {

    Validation valid = new Validation();

    public void addWorker(ArrayList<Worker> id) {
        String code;
        while(true){
            code = valid.inputString("Enter Code: ");
            if (Validation.CheckCodeDuplicate(id, code)) {
                break;
            } else {
                System.out.println("Code exists");
                return;
            }
        }
        String name = valid.inputString("Enter Name: ");
        int age = valid.inputAge("Enter Age: ");
        double salary = valid.inputSalary("Enter Salary: ");
        String location = valid.inputString("Enter work location: ");

        id.add(new Worker(code, name, age, salary, location));
        System.out.println("Worker added successfully!");

    }

    public void changeSalary(ArrayList<Worker> id, ArrayList<SalaryHistory> salary, int status) {
        String code = valid.inputString("Enter code: ");
        Worker worker = valid.getWorkerByCode(id, code);
        if (worker == null) {
            System.out.println("Not exist worker!");
        } else {
            double salaryNow = worker.getSalary();
            double salaryUpdate;
            if (status == 1) {
                while (true) {
                    salaryUpdate = valid.inputSalary("Enter salary: ");
                    if (salaryUpdate <= salaryNow) {
                        System.out.println("Please up salary! OK?");
                    } else {
                        break;
                    }
                }
                salary.add(new SalaryHistory("UP", valid.getCurrentDate(), worker.getCode(), worker.getName(), worker.getAge(), salaryUpdate, worker.getWorkLocation()));
            } else {
                while (true) {
                    salaryUpdate = valid.inputSalary("Enter salary: ");
                    if (salaryUpdate >= salaryNow) {
                        System.out.println("Please down salary! OK?");
                    } else {
                        break;
                    }
                }
                salary.add(new SalaryHistory("DOWN", valid.getCurrentDate(), worker.getCode(), worker.getName(), worker.getAge(), salaryUpdate, worker.getWorkLocation()));
            }
            worker.setSalary(salaryUpdate);
            System.out.println("Update successful!");
        }
    }

    public void printListHistory(ArrayList<SalaryHistory> salary) {
        if (salary.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        System.out.println("--------------------Display Information Salary-----------------------");
        System.out.printf("%-10s%-15s%-15s%-15s%-15s%-15s\n", "Code", "Name", "Age", "Salary", "Status", "Date");
        //Collections.sort(salary);
        //print history from first to last list
        for (SalaryHistory history : salary) {
            valid.printHistory(history);
        }
    }

}
