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
        if (brand==null^ Objects.equals(brand,"")){this.brand="No info";}
        if (color==null^ Objects.equals(color,"")){this.color="No info";}
        if (country==null^ Objects.equals(country,"")){this.country="No info";}
        this.year = Math.max(year, 0);
        //noinspection ManualMinMaxCalculation
        if (engineVolume<=0.0) {this.engineVolume=0.0;} else { this.engineVolume=engineVolume; }
        if (model==null^ Objects.equals(model,"")){this.model="No info";}
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year +
                " год выпуска, сборка " + country +
                ", цвет кузова " + color + ", обьем двиагателя - " + engineVolume + " литров";
    }
}

//