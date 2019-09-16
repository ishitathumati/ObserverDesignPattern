package observer.design;
/**
 * This class implements the observer interface
 * updates character action as per warning call number after overriding function in Observer
 * @author ishitathumati
 *
 */
public class ShopOwner implements Observer {
	private int warning;
	private Subject watchman;
	
	public ShopOwner(Subject watchman) {
		this.watchman = watchman;
		watchman.registerObserver(this);	
	}
	
	@Override
	public void update(int warning) {
		if(warning == 1) {
			System.out.println("Shop Owner: Close down shop and head home");
		}
		else {
			System.out.println("Shop Owner: Drops everything and finds nearest hideout");
		}
	}

}
