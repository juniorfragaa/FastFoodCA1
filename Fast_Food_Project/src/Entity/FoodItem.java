package Entity;


import java.time.LocalDate;
import java.time.LocalDateTime;


public class FoodItem {

    // Keeping private access modifiers for achieving Encapsulation(Keep fields private+ Add through Constructor + Get from Getters)
    private String name;
    private double weight;
    private LocalDate bestBefore;
    private LocalDateTime addedTime;

    //Constructor to add the values to the fields
    FoodItem(String name, double weight, LocalDate bestBefore, LocalDateTime addedTime){
     this.name=name;
    this.weight=weight;
    this.bestBefore=bestBefore;
    this.addedTime=addedTime;
    // Using this because it helps to point instance variable
    }

    // getters are used for response

    public String getName(){
     return name;
    }

    public double getWeight(){
     return weight;
    }

    public LocalDate getBestBefore(){
     return bestBefore;
    }

    public LocalDateTime getAddedTime(){
     return addedTime;
    }

}
