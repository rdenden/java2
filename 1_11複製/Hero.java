public class Hero implements Cloneable {
    String name;
    int hp;
    Sword sword;
    public void setSword(Sword sword) {
        this.sword = sword;
    }
    public Sword getSword() {
        return this.sword;
    }
    public Hero(String name,int hp) {
        this.name = name;
        this.hp = hp;
    }
    public Hero clone() {
        Hero result = new Hero(this.name,this.hp);
        result.name = this.name;
        result.hp = this.hp;
        result.sword = this.sword;
        return result;
    }

}