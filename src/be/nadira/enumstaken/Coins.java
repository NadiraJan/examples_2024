package be.nadira.enumstaken;



public enum Coins {

    ONE_CENT(1),
    TWO_CENT(2),
    FIVE_CENT(5),
    TEN_CENT(10),
    TWENTY_CENT(20),
    FIFTY_CENT(50),
    ONE_EURO(100),
    TWO_EURO(200);

 private final int VALUE;

   Coins(int VALUE){
       this.VALUE = VALUE;
    }

 public int getVALUE(){
       return VALUE;
 }

    @Override
    public String toString() {
        return "Coins{" +
                "VALUE=" + VALUE +
                "} " ;
    }
}
