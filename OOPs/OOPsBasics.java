public class OOPsBasics {
    public static void main (String args[]){
        Pen p1 = new Pen();
        p1.setColor("yellow");
        System.out.println(p1.getColor());
    }
    
}

class Pen {
    // prop + func 
    private String color = "blue";
    int tip;

    String getColor(){
        return this.color;
    }

    void setTip(int newTip){
        tip = newTip;
    }

    void setColor(String newColor){
        color = newColor;
    }
}