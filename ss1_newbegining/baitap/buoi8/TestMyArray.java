package baitap.buoi8;

public class TestMyArray {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name){
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
        Student a = new Student(1,"Huy");
        Student b = new Student(2,"Huy");
        Student c = new Student(3,"Huy");
        Student d = new Student(4,"Huy");
        Student e = new Student(5,"Huy");

        MyArrrayList<Student> list = new MyArrrayList<Student>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        for (int i = 0; i < list.size(); i++) {
            Student student = (Student) list.element[i];
            System.out.print(student.getId());
            System.out.println(student.getName() + "\n");
        }
    }
}
