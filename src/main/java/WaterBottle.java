public class WaterBottle {

    public int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public void drinkFromBottle(){
        this.volume -= 10;
    }

    public void emptyTheContentsOfBottle(){
        this.volume = 0;
    }

    public void fillUpBottle(){
        this.volume = 100;
    }
}
