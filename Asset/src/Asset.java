public class Asset {
    public String name;
    public int index;
    public String description;
    public String keywords;
    public String author;
    public Double price;
    public String license;

    public Asset(String name, String description, String keywords, String author, Double price, String license) {
        this.name = name;
        this.index = index++;
        this.description = description;
        this.keywords = keywords;
        this.author = author;
        this.price = price;
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public String getDescription() {
        return description;
    }

    public String getKeywords() {
        return keywords;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    public String getLicense() {
        return license;
    }
}