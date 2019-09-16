package observer.design;
/**
 * This class implements the observer interface
 * updates character action as per warning call number after overriding function in Observer
 * @author ishitathumati
 *
 */
public class Knight implements Observer {
	private int warning;
	private Subject watchman;
	
	public Knight(Subject watchman) {
		this.watchman = watchman;
		watchman.registerObserver(this);
	}
	
	@Override
	public void update(int warning) {
		if(warning == 1) {
			System.out.println("Knight: Helps everyone get home safe");
		}
		else {
			System.out.println("Knight: Prepares for battle");
		}
	}
}
