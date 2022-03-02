package hw;

public abstract class fruit {

    private Integer weightBox;

    public fruit(Integer weightBox) {
        this.weightBox = weightBox;
    }

    public Integer getWeight(){
        return weightBox;
    }

}
