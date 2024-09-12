package penyewaan;

public class DVD extends Product {
    private int length;
    private String rating;
    private String studio;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public DVD (){
          super();
        // number = 7;
        // name ="selamat jumpa lah";
        // quantity =9;
        // price= 15000.0;
      
        length =44;
        rating ="PG13";
        studio ="ngawi jaya";
       
    }
    public DVD(int length, String rating,String studio) {
        this.length = length;
        this.rating=rating;
        this.studio=studio;
      }
    @Override
    public void print(){
        super.print();
        System.out.println("number: "+ number);
        System.out.println("name: "+ name);
        System.out.println("quantity: "+ quantity);
        System.out.println("price: "+ price);
        System.out.println("length: "+ length);
        System.out.println("rating: "+ rating);
        System.out.println("studio: "+ studio);
    }

    
}
