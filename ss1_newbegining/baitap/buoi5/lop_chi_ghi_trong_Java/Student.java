package baitap.buoi5.lop_chi_ghi_trong_Java;

public class Student {
    private String name = "John";
    private String className = "C02";

    public Student() {
    }

//    public void setName(String name) {
    private void setName(String name) {
        this.name = name;
    }

//    public void setClassName(String className) {
    protected void setClassName(String className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Nam");
        System.out.println(st.getName());
    }
}
