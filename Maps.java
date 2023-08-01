import java.util.HashMap;

class Maps{
    public static void main(String[] args){
        //creates a map of string to integer with the method Hashmap<key, value>
        //methods to use: 
        // put() to add a key and value pair and update if that key already exists.
        // get() to get the value based on the key as the argument.
        // containsKey() to see if there is key in the hashmap. Returns true or false
        // containsValue to see if there is a value in the hashmap. Returns true or false
        HashMap <String, Integer> empIds = new HashMap<>();
        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        System.out.println(empIds);

        System.out.println(empIds.get("John"));

        System.out.println(empIds.containsKey("george"));
        System.out.println(empIds.containsValue(123));

    }
}