package javabasic.example5;

public class example5_1 {
    public static void main(String[] args) {
        //Person 클래스를 생성하고, 이름(name)과 나이(age)를 필드로 가지게 하세요.
        // 해당 클래스에는 이름과 나이를 설정할 수 있는 생성자와, 이를 출력할 수 있는 메서드를 포함하세요.

        Person per = new Person("김준하", 23);
        per.show();
    }
    public static class Person{
        String name;
        int age;
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        public void show(){
            System.out.println(name +", "+ age);
        }
    }
}
