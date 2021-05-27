public class Account implements Comparable<Account> {
    int number;
    int zandaka;
    public int compareTo(Account obj) {
        if (this.number < obj.number) {
            return -1;
        }
        if (this.number > obj.number) {
            return 1;
        }
        return 0;
    }
    
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else {
            return false;
        }
    }
        
    
    public String toString() {
        return String.valueOf(number);
    }
}

