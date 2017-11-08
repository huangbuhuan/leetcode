package main.java.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/8
 */
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
}
public class Solution690 {
    
    public int getImportance(List<Employee> employees, int id) {
        for (Employee employee : employees) {
            if (employee.id == id) {
                List<Integer> subordinates = new ArrayList<>(employee.subordinates);
                if (null == subordinates || subordinates.size() == 0) {
                    return employee.importance;
                }
                int importances = employee.importance;
                for (Integer subId : subordinates) {
                    importances += getImportance(employees, subId);
                }
                return importances;
            }
        }
        return 0;
    }
    
}
