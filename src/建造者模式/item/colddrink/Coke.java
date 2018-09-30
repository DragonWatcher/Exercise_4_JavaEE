package 建造者模式.item.colddrink;

public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }
    
    @Override
    public float price() {
        return 30.0f;
    }
}
