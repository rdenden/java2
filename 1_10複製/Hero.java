public class Hero implements Cloneable {
    String name;
    int hp;
    Sword sword;
    
    public Hero clone() {
        Hero result = new Hero();
        result.name = this.name;
        result.hp = this.name;
        result.sword = this.sword;
        return result;
    }

}
