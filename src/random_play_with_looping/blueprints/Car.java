package random_play_with_looping.blueprints;

public class Car {
    private String name;
    private String platNumbers;
    private String productionDate;

    public Car(String name, String platNumbers, String productionDate){
        this.name = name;
        this.platNumbers = platNumbers;
        this.productionDate = productionDate;
    }

    public String getCarName(){
        return this.name;
    }
    public String getPlatNumbers(){
        return this.getPlatNumbers();
    }
    public String getProductionDate(){
        return this.getProductionDate();
    }

    public void setCarName(String carName){
        this.name = carName;
    }
    public void setPlatNumbers(String platNumbers){
        this.platNumbers = platNumbers;
    }
    public void setProductionDate(String productionDate){
        this.productionDate = productionDate;
    }
}
