class Coffee_Maker{
      public static void main(String[] args) {
           
            Coffee_Macine co=new Coffee_Macine();
           

            co.addStock("hot_water", 100);
            co.addStock("sugar_syrup",200);
            Quantity q=new Quantity(co);
            q.display();
             Bevearage a=new Bevearage("blackTea");
             Bevearage b=new Bevearage("")
             
      }

}
class Coffee_Macine{
      int hot_water=500;
      int hot_milk=500;
      int coffee_decoction=100;
      int sugar_syrup=100;
      int tea_leaves_syrup=100;
      int green_tea_syrup=100;
      public Coffee_Macine(){

      }
      void addStock(String  type,int val){
         if(type.equals("hot_water")){
            hot_water+=val;
         }
         else if(type.equals("hot_milk")){
            hot_milk+=val;
         }
         else if(type.equals("coffee_decoction")){
            coffee_decoction+=val;
         }
         else if(type.equals("sugar_syrup")){
            sugar_syrup+=val;
         }
         else if(type.equals("tea_leaves_syrup")){
            tea_leaves_syrup+=val;
         }else{
            green_tea_syrup+=val;
         }
      }
      public int getHot_water() {
            return hot_water;
      }
      public int getHot_milk() {
            return hot_milk;
      }
      public int getCoffee_decoction() {
            return coffee_decoction;
      }
      public int getSugar_syrup() {
            return sugar_syrup;
      }
      public int getTea_leaves_syrup() {
            return tea_leaves_syrup;
      }
      public int getGreen_tea_syrup() {
            return green_tea_syrup;
      }
      

}
class Quantity{
     // int hw,hm,cd,ss,tls,gts;   
     private Coffee_Macine macine;   
     public Quantity(Coffee_Macine macine){
        this.macine=macine;
     }
   void display(){
       System.out.println("Hot Water: "+macine.hot_water);
       System.out.println("Hot Milk: "+macine.hot_milk);
       System.out.println("Coffee Decoction: "+macine.coffee_decoction);
       System.out.println("Sugar Syrup: "+macine.sugar_syrup);
       System.out.println("Tea Leaves Syrup: "+macine.tea_leaves_syrup);
       System.out.println("Green Tea Syrup: "+macine.green_tea_syrup);
   }
}
class Bevearage{
      
      private Coffee_Macine macine=new Coffee_Macine();
      public Bevearage(String choose){
           
            
         if(choose.equals("HotCoffee")){
           if(macine.hot_water>=100 && macine.hot_milk>=400 && macine.coffee_decoction>=50 && macine.sugar_syrup>=50){
            String a=hotTea();
            System.out.println(a);
           }else{
            notPossible();
           }
         }
         else if(choose.equals("HotTea")){
           if(macine.hot_water>=20  && macine.hot_milk>=100 && macine.sugar_syrup>=30 && macine.tea_leaves_syrup>=30){
           String a= hotCoffee();
           System.out.println(a);
           }else{
            notPossible();
           }
         }
         else if(choose.equals("greenTea")){
          if(macine.hot_water>=200 && macine.sugar_syrup>=20 && macine.green_tea_syrup>=30){
            String a=greenTea();
            System.out.println(a);
          }else{
            notPossible();
          }
         }
         else{
            if(macine.hot_water>=300 && macine.sugar_syrup>=20 && macine.tea_leaves_syrup>=30){
                  String a=blackTea();
                  System.out.println(a);
            }
            else{
                  notPossible();
            }
         }
      }
      String hotTea(){
       return "Take Your HotTea";
      }
      String hotCoffee(){
         return "Take Your HotCoffee";
      }
      String greenTea(){
         return "Take Your GreenTea";
      }
      String blackTea(){
         return "Take Your BlackTea";
      }
      void notPossible(){
            System.out.println("The Ingredients quantity low we can not make it. Please choose another type");
      }
}
