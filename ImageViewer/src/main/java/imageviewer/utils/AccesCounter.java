package imageviewer.utils;

import java.util.HashMap;


public class AccesCounter {

    private final HashMap<Integer, Integer> accesses = new HashMap<>();


    private AccesCounter(){
        
    }
    
    private static final AccesCounter instance = new AccesCounter();
    
    public static AccesCounter getInstance(){
        return instance;
    }
    
    public Integer increment(Integer key){
        final Integer count;
        
        if(this.accesses.containsKey(key)){
            count = this.accesses.get(key) + 1;
        }else{
            count = 1;
        }
        this.accesses.put(key, count);
        return count;
    }
}
