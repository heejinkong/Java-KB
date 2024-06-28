package obj;

public class obj1 {
    //설계도 (속성+기능)
    public class Book {
        private String title;
        private String author;
        private int pages;
        private String publisher;

        public void setTitle(Book this, String title) {
            System.out.println("this="+this);
            this.title = title;
        }
        public String getTitle(Book this){
            return this.title;
        }
        public void main(String[] args) {
            Book book1 = new Book(); //title|author|pages|publisher
            Book book2 = new Book(); //title|author|pages|publisher
            System.out.println("book1:"+book1);
            System.out.println("book2:"+book2);
            book2.setTitle("hiJava");
            System.out.println(book2.getTitle());

        }
    }
}
