package mypack;

import java.sql.SQLException;
import java.util.*;

public class shoppingCart {
  public HashMap<String,Integer> items = null;
  int numberOfItems = 0;

  public shoppingCart() {
      items = new HashMap<>();
  }

  public synchronized void add(String itemId, int quantity) {
    if(items.containsKey(itemId)) {
        items.put(itemId, items.get(itemId) + quantity);
        numberOfItems ++;
    } else {
        items.put(itemId, quantity);
        numberOfItems ++;
    }
  }
  
  public synchronized void add(String itemId) {
	    if(items.containsKey(itemId)) {
	        items.put(itemId, items.get(itemId) + 1);
	        numberOfItems++;
	    } else {
	        items.put(itemId, 1);
	        numberOfItems++;
	    }
	  }

  public synchronized void dec(String itemId) {
    items.remove(itemId);
    numberOfItems--;
  }
  public synchronized void remove(String itemId){
	  items.remove("itemId");
  }
  public synchronized Set<String> getItems() {
      return items.keySet();
  }
 
  public int getQuantity(String itemId){
	  return items.get(itemId);
  }
  protected void finalize() throws Throwable {
      items.clear();
  }

  public synchronized int getNumberOfItems() {
      return numberOfItems;
  }
  public synchronized double getTotal() throws SQLException {
    double amount = 0.0;
    for(Iterator<String> i = getItems().iterator(); i.hasNext(); ) {
    	String id = i.next();
        amount += items.get(id) * itemDB.getPrice(id);
    }
    return roundOff(amount);
  }
  
 
  public synchronized double getPrice(String itemId) throws SQLException{
	  return roundOff(itemDB.getPrice(itemId) * items.get(itemId));
  }
  public static double roundOff(double x) {
      long val = Math.round(x*100); // cents
      return val/100.0;
  }

  public synchronized void clear() {
      items.clear();
      numberOfItems = 0;
  }
  
 
}
