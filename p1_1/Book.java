import java.util.*;

public class Book implements Comparable<Book>,Cloneable {
    private String title;
    private Date publishDate;
    private String comment;
    
    public int hashCode() {
        return Objects.hash(this.title,this.publishDate,this.comment);
    }
    
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        Book b = (Book) o;
        if (!this.publishDate.equals(b.publishDate)) {
            return false;
        }
        if (!this.title.equals(b.title)) {
            return false;
        }
        return true;
    }
    public int compareTo(Book o) {
        // 変数1.compareTo(変数2)
        // メソッドの呼び出し元の値(変数1)が、引数の値(変数2)より小さい場合は”負の値”
        // メソッドの呼び出し元の値(変数1)が、引数の値(変数2)より大きい場合は”正の値”
        // メソッドの呼び出し元の値(変数1)が、引数の値(変数2)と同じ場合は”0”
        return this.publishDate.compareTo(o.publishDate);
    }
    public Book clone() {
        Book result = new Book();
        result.title = this.title;
        // なぜキャストしなければならないか
        result.publishDate = (Date)this.publishDate.clone();
        result.comment = this.comment;
        return result;
    }
    
    
}
