import java.util.ArrayList;

public class Freamework_eg{
    public static void main(String[] args){
        
        ArrayList<String> list = new ArrayList<>();

        list.add("Rahul");
        list.add("Sayali");
        list.add("Amit");
        list.add("Rahul");

         System.out.println(list);
         
         list.remove("Amit");
         System.out.println(list);

         System.out.println(list.contains("Sayali"));

            
    }
}