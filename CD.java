package penyewaan;

import java.util.Scanner;

public class CD extends Product {
    private String artist;
    private int totalsong;
    private String label;

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTotalsong() {
        return this.totalsong;
    }

    public void setTotalsong(int totalsong) {
        this.totalsong = totalsong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CD (){
        // number = 7;
        // name ="hari ini hari yang kau tunggu ";
        // quantity =11;
        // price= 12000.0;
        super();
        artist= "R-1";
        totalsong =9;
        label="ngawi music";
        
    }
    public CD(int totalsong, String artist,String label) {
        this.totalsong = totalsong;
        this.artist = artist;
        this.label=label;
      }
    @Override
    public void print(){
        super.print();
        System.out.println("number: "+ number);
        System.out.println("name: "+ name);
        System.out.println("quantity: "+ quantity);
        System.out.println("price: "+ price);
        System.out.println("artist: "+ artist);
        System.out.println("total song: "+ totalsong);
        System.out.println("label: "+ label);
    }
    


}