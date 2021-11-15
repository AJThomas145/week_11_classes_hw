public class Printer {

    public int numberOfPages;
    public int tonerVolume;

    public Printer(int numberOfPages, int tonerVolume){
        this.numberOfPages = numberOfPages;
        this.tonerVolume = tonerVolume;
    }

    public void print(int numberOfCopies){
        if (this.numberOfPages >= numberOfCopies) {
            this.numberOfPages -= numberOfCopies;
            this.tonerVolume -= numberOfCopies;
        }
    }




}
