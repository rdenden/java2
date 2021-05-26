public class Account {
    String accoutNo;
    
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } 
        if (o == null) {
            return false;
        }
        if (!(o instanceof Account) {
            return false;
        }
        Account r = (Account)o;
        if (!this AccountNo.trim().equals(r.AccountNo.trim())) {
            return false;
        }
        return true;
    }
}

