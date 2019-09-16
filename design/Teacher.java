package observer.design;
/**
 * This class implements the observer interface
 * updates character action as per warning call number after overriding function in Observer
 * @author ishitathumati
 *
 */
public class Teacher implements Observer {
	private int warning;
	private Subject watchman;
	
	/*
	 * adds teacher as an observer
	 */
	public Teacher(Subject watchman) {
		this.watchman = watchman;
		watchman.registerObserver(this);
	}
	@Override
	public void update(int warning) {
		if(warning == 1) {
			System.out.println("Teacher: Helps get every kid home safe");
		}
		else {
			System.out.println("Teacher: Brings all students to the underground shelter");
		}
	}

}
