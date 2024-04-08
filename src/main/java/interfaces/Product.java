package interfaces;

public interface Product {
    String getName();
    void setName(String string );

    default double getPrice(){
        return 50;
    }
    default void setPrice(double price){

    }


}
