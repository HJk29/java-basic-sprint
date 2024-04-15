package javabasic.example5;

public class example5_2 {
    public static void main(String[] args) {
        //Book 클래스를 만들고, 제목(title), 저자(author), 가격(price)을 필드로 정의하세요.
        // 모든 필드를 초기화하는 생성자와, 필드 값을 출력하는 메서드를 포함하세요.
        Book book = new Book("누가 내 머리에 똥쌌어", "베르너 홀츠바르트", 9000);
        book.Book_imform();
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
        public void Book_imform(){
            System.out.printf("제목: %s, 저자: %s, 가격: %d", title, author, price);
        }
    }
}
