package com.driver;

public class Pizza {

    public int basePrice;

    public Boolean isVeg;
    public String bill;
    public int cheesePrice;
    public int toppingsPrice;
    public int paperBagPrice;
    public boolean isExtraCheeseAdded;
    public boolean isExtraToppingsAdded;
    public boolean isPaperBagAdded;
    public boolean isBillGenerated;
    public int totalPrice;



    public Pizza(Boolean isVeg){
        // your code goes here
        if(isVeg){
            basePrice=300;
            toppingsPrice=70;
        }
        else{
            // Non-veg price
            basePrice=400;
            toppingsPrice=120;
        }
        paperBagPrice=20;
        cheesePrice=80;

        totalPrice= basePrice;

        isExtraToppingsAdded = false;
        isExtraCheeseAdded = false;
        isPaperBagAdded = false;
        isBillGenerated=false;

        bill ="Base Price Of The Pizza: " + basePrice+ "\n";
    }

   public int getPrice(){
     return totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheeseAdded==false) {
            totalPrice = totalPrice + cheesePrice;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraToppingsAdded==false){
            totalPrice = totalPrice + toppingsPrice;
            isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway() {
            // your code goes here
            if (isPaperBagAdded==false) {
                totalPrice = totalPrice + paperBagPrice;
                isPaperBagAdded = true;
            }
        }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false){

            if(isExtraCheeseAdded==true){
                bill= bill +"Extra Cheese Added: "+ cheesePrice+"\n";
            }
            if(isExtraToppingsAdded==true){
                bill= bill +"Extra Toppings Added: "+ toppingsPrice +"\n";
            }
            if(isPaperBagAdded==true){
                bill= bill +"Paperbag Added: "+ paperBagPrice+"\n";
            }
            bill = bill + "Total Price: "+ totalPrice +"\n";

            isBillGenerated=true;
        }
        return bill;
    }
}
