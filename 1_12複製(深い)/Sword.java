public class Sword implements Cloneable {
    private String name;
    public Sword(String name) {
        this.name = name;
    }
    // クローンメソッドを定義
    public Sword clone() {
        Sword result = new Sword(this.name);
        result.name = this.name;
        return result;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
