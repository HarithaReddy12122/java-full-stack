import java.util.HashMap;
import java.util.Map;
class Has{
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Eesha",1);
        map.put("Gowri",2);
        map.put("Anitha",3);
        map.put("Keerthi",4);
        System.out.println(map.containsKey("Haritha"));
        map.get("Anitha");
        for(Map.Entry<String,Integer> e:map.entrySet()){
            e.getKey();
            e.getValue();
        }

    }
}