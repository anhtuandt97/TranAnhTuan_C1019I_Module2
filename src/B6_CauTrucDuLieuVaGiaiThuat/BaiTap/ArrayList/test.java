package B6_CauTrucDuLieuVaGiaiThuat.BaiTap.ArrayList;

public class test {
    public static class Students{
        private int id;
        private String name;

        public Students() {
        }

        public Students(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Students a = new Students(1,"Ha");
        Students b = new Students(2,"Nam");
        Students c = new Students(3,"Muoi");
        Students d = new Students(4,"Na");
        Students e = new Students(5,"Hoang");
        Students f = new Students(6,"Trung");
        Students g = new Students(7,"Hai");

        MyList1<Students> studentsMyList1= new MyList1<>();
        MyList1<Students> newMyList = new MyList1<>();
        studentsMyList1.add(a);
        studentsMyList1.add(b);
        studentsMyList1.add(c);
        studentsMyList1.add(d);
        studentsMyList1.add(e);
        studentsMyList1.add(f);
        studentsMyList1.add(g);

        System.out.println(studentsMyList1.contains(b));
        studentsMyList1.size();
        newMyList = studentsMyList1.clone();
        newMyList.remove(2);
        for (int i=0; i<newMyList.size();i++){
            System.out.println(newMyList.get(i).getName());
        }
    }
}
