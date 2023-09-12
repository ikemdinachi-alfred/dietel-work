package Chapter3;

public class PetrolPurchase {
    private String location;
    private  String typeOfPetrol;
    private int quantityOfPurchase;
    private double pricePerLitre;
    private double discount;

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setQuantityOfPurchase(int pricePerLitre) {
        this.quantityOfPurchase = pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;

    }


public double amountToBePaid(){
        return quantityOfPurchase*pricePerLitre-discount;
}
    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void setTypeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    }

    public String getLocation() {
        return location;
    }
}
