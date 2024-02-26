import java.util.*;
class Student{
    String name,address,phoneNum;
    int age,grade;

    public Student(String name,String address,String phoneNum,int age,int grade){
        this.name=name;
        this.address=address;
        this.phoneNum=phoneNum;
        this.age=age;
        this.grade=grade;
    }

}
class QuestionFour {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Student> lhm=new LinkedHashMap<>();
        Student stu1=new Student("chayan", "kilinochchi", "0763244160", 25, 14);
        Student stu2=new Student("thanu", "mullativu", "0763244160", 25, 14);
        Student stu3=new Student("dinesh", "vavuniya", "0763244160", 25, 14);
        
        lhm.put(1,stu1);
        lhm.put(2,stu2);
        lhm.put(3,stu3);

        for(Map.Entry<Integer,Student> m:lhm.entrySet()){
            System.out.println("----------------------");
            System.out.println(m.getKey());
            System.out.println("----------------------");
            Student st=m.getValue();
            System.out.println("name:"+st.name+"\nAddress:"+st.address+"\nphoneNum:"+st.phoneNum+"\nAge:"+st.age+"\nGrade:"+st.grade);
            System.out.println();
        }
    
    }
}
