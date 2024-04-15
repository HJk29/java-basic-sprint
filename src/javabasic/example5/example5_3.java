package javabasic.example5;

public class example5_3 {
    public static void main(String[] args) {
        //Person 객체를 두 개 생성하고, 각 객체에 대한 정보를 출력하세요. 이어서 Book 객체를 생성하고, 그 정보를 출력하세요.
        Person per_1 = new Person();
        per_1.age = 19;
        per_1.name = "이정민";
        per_1.show();

        Person per_2 = new Person();
        per_2.age = 23;
        per_2.name = "김준하";
        per_2.show();

        Book book = new Book();
        book.title = "알고리즘 문제해결 전략";
        book.author = "구종만";
        book.price = 45000;
        book.Book_Imform();
    }

    public static class Person{
        public Person(){};
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

    public static class Book{
        String title;
        String author;
        int price;
        public Book(){};
        public Book(String title, String author, int price){
            this.title = title;
            this.author = author;
            this.price = price;
        }
        public void Book_Imform(){
            System.out.printf("제목: %s, 저자: %s, 가격: %d원", title, author, price);
        }
    }
}
