package t16;


public final class Drink implements Item{
    private float cost;
    private String title;
    private String description;

    Drink(String name, String description)
    {
        cost = 0;
        this.description = description;
        this.title = title;
    }

    Drink(String title, String description, int cost) {
        this.cost = cost;
        this.title = title;
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

    @Override
    public float getCost() {
        return 0;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String GetDescription() {
        return null;
    }

    @Override
    public String
    toString() {
        return "Drink{" +
                "cost=" + cost +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
