package factory;

import factory.ingredients.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Pizza {
   String name;
   Dough dough;
   Sauce sauce;
   Veggi[] veggies;
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

}
