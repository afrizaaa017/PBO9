abstract public class Shape
{
   protected String name;

   public Shape (String eName)
   {
      name = eName;
   }

   
   public String toString()
   {
      String result = "Name: " + name + "\n";
      return result;
   }

   public abstract double area();
}


