package machine;

public class Machine {
    private int currentWater;
    private int currentMilk;
    private int currentCoffeeBeans;
    private int currentCups;
    private int currentBalance;

    public int getCurrentWater() {
        return currentWater;
    }

    public int getCurrentMilk() {
        return currentMilk;
    }

    public int getCurrentCoffeeBeans() {
        return currentCoffeeBeans;
    }

    public int getCurrentCups() {
        return currentCups;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentWater(int currentWater) {
        this.currentWater = currentWater;
    }

    public void setCurrentMilk(int currentMilk) {
        this.currentMilk = currentMilk;
    }

    public void setCurrentCoffeeBeans(int currentCoffeeBeans) {
        this.currentCoffeeBeans = currentCoffeeBeans;
    }

    public void setCurrentCups(int currentCups) {
        this.currentCups = currentCups;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Machine(int currentWater, int currentMilk, int currentCoffeeBeans, int currentCups, int currentBalance) {
        this.currentWater = currentWater;
        this.currentMilk = currentMilk;
        this.currentCoffeeBeans = currentCoffeeBeans;
        this.currentCups = currentCups;
        this.currentBalance = currentBalance;
    }

    public void pourEspresso() {
        if (this.currentWater - 250 >= 0) {
            this.currentWater -= 250;
        } else {
            System.out.println("Sorry, not enough water!");
            return;
        }
        if (this.currentCoffeeBeans - 16 >= 0) {
            this.currentCoffeeBeans -= 16;
        } else {
            System.out.println("Sorry, not enough coffee!");
            return;
        }
        if (this.currentCups - 1 >= 0) {
            this.currentCups -= 1;
        } else {
            System.out.println("Sorry, not enough cups!");
            return;
        }
        this.currentBalance += 4;
    }

    public void pourLatte(){
        if (this.currentWater - 350 >= 0) {
            this.currentWater -= 350;
        }else{
            System.out.println("Sorry, not enough water!");
            return;
        }
        if (this.currentCoffeeBeans - 20 >= 0) {
            this.currentCoffeeBeans -= 20;
        } else {
            System.out.println("Sorry, not enough coffee!");
            return;
        }
        if (this.currentCups - 1 >= 0) {
            this.currentCups -= 1;
        } else {
            System.out.println("Sorry, not enough cups!");
            return;
        }
        if (this.currentMilk - 75 >= 0) {
            this.currentMilk -= 75;
        } else {
            System.out.println("Sorry, not enough milk!");
            return;
        }
        this.currentBalance += 7;
    }

    public void pourCappuccino(){
        if (this.currentWater - 200 >= 0) {
            this.currentWater -= 200;
        }else{
            System.out.println("Sorry, not enough water!");
            return;
        }
        if (this.currentCoffeeBeans - 12 >= 0) {
            this.currentCoffeeBeans -= 12;
        } else {
            System.out.println("Sorry, not enough coffee!");
            return;
        }
        if (this.currentCups - 1 >= 0) {
            this.currentCups -= 1;
        } else {
            System.out.println("Sorry, not enough cups!");
            return;
        }
        if (this.currentMilk - 100 >= 0) {
            this.currentMilk -= 100;
        } else {
            System.out.println("Sorry, not enough milk!");
            return;
        }
        this.currentBalance += 6;
    }
}
