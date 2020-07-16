package factory;

import java.util.Arrays;

public abstract class Pizza {
   String name;
   Dough dough;
   Sauce sauce;
   Veggies [] veggies;
   Cheese cheese;
   Pepperoni pepperoni;
   Clam clam;

   abstract void prepare();
   void bake() {
      System.out.println("bake for 25 mins @ 350");
   };
   void cut() {
      System.out.println("Cutting pizza into diagonal slices");
   };
   void box() {
      System.out.println("Placing pizza to pizza box");
   };

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "Pizza{" +
              "name='" + name + '\'' +
              ", dough=" + dough +
              ", sauce=" + sauce +
              ", veggies=" + Arrays.toString(veggies) +
              ", cheese=" + cheese +
              ", pepperoni=" + pepperoni +
              ", clam=" + clam +
              '}';
   }
}
