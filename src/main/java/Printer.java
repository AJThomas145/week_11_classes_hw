public class Printer {

    public int numberOfPages;

    public Printer(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    public void printCopies(int numberOfCopies){
        if (this.numberOfPages >= numberOfCopies) {
            this.numberOfPages -= numberOfCopies;
        }

    }


}
