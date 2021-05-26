public class Hero {
    String name;
    int hp;
    
    public int hashCode() {
        return Objects.hash(this.name,this.hp);
    }
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof Hero)) {
            return false;
        }
        Hero r = (Hero) o;
        if (!this.name.trim().equals(r.name.trim())) {
            return false;
        }
        return true;
    }
}
