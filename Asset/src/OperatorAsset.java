public class OperatorAsset extends Asset{

    public int id;

    public OperatorAsset(String name, String description, String keywords, String author, Double price, String license) {
        super(name, description, keywords, author, price, license);
        this.name = name;
        this.id = id;
    }
}
