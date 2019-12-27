package CaseStudy.Models;

import java.util.Comparator;

public class SortName implements Comparator<Customer> {
    public int compare(Customer s1, Customer s2) {
        int birthDay1 = Integer.parseInt(s1.getBirthday().substring(s1.getBirthday().lastIndexOf("/")+1));
        int birthDay2 = Integer.parseInt(s2.getBirthday().substring(s2.getBirthday().lastIndexOf("/")+1));
        int res = birthDay2 - birthDay1;
        String name1 = s1.getNameCustomer().substring(s1.getNameCustomer().lastIndexOf(" ")+1);
        String name2 = s2.getNameCustomer().substring(s2.getNameCustomer().lastIndexOf(" ")+1);
        int rs = name1.compareTo(name2);
        if (rs == 0) {
            if (res > 0) {
                return -1; // do nothing
            } else if (res <0) {
                return 1; // swap
            }
            return 0;
        } else {
            return rs;
        }
    }
}
