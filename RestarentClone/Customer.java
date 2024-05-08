

 class Customer {
      String foodName;
      int count;
      public Customer(String foodName, int count) {
            this.foodName = foodName;
            this.count = count;
      }
      public String getFoodName() {
            return foodName;
      }
      public void setFoodName(String foodName) {
            this.foodName = foodName;
      }
      public int getCount() {
            return count;
      }
      public void setCount(int count) {
            this.count = count;
      }
      @Override
      public String toString() {
            // TODO Auto-generated method stub
            return "Food Name "+ foodName +" "+ "/n"+ "Count "+ count+"";
      }
      
      
}
