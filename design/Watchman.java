package observer.design;

	import java.util.ArrayList;
/**
 * This class implements the interface Subject
 * allows adding, removing and notifying observers to update warning message
 * @author ishitathumati
 *
 */
	public class Watchman implements Subject {
		private ArrayList<Observer> observers;
		private int warning;
		
		/*
		 * create a mutable list of observers
		 */
		public Watchman() {
			observers = new ArrayList<Observer>();
		}
		
		/*
		 *these methods are actually implemented as opposed to the ones in the interface
		 */
		@Override
		public void registerObserver(Observer observer) {
			observers.add(observer);
		}
		@Override
		public void removeObserver(Observer observer) {
			observers.remove(observer);
			
		}
		@Override
		public void notifyObservers() {
			for(Observer observer : observers) {
				observer.update(warning);
			}
		}
		
		/*
		 * updates the trumpet warning call and displays appropriate message
		 */
		public void issueWarning(int warning) {
			this.warning = warning;
			if(warning == 1) {
				System.out.println("Warning: " +warning+ " trumpet was played!");
			}
			else {
				System.out.println("Warning: " +warning+ " trumpets were played!");
			}
			notifyObservers();
		}
}
