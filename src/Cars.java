import java.util.Objects;

public class Cars {

    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Cars() {
    }

    Cars (String brand, String model, double engineVolume, String color, int year, String country){
        //noinspection ManualMinMaxCalculation
        if (engineVolume<=0.0) {this.engineVolume=0.0;} else { this.engineVolume=engineVolume; }
        this.year = Math.max(year, 0);
        if (brand==null^ Objects.equals(brand,"")){this.brand="No info";}       else{ this.brand=brand; }
        if (color==null^ Objects.equals(color,"")){this.color="No info";}       else{ this.color=color; }
        if (country==null^ Objects.equals(country,"")){this.country="No info";} else{ this.country=country; }
        if (model==null^ Objects.equals(model,"")){this.model="No info";}       else{ this.model=model; }
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year +
                " год выпуска, сборка " + country +
                ", цвет кузова " + color + ", обьем двиагателя - " + engineVolume + " литров";
    }
}

//