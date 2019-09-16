package observer.design;
/**
 * Interface implemented by other classes in the package
 * functions to add, remove and notify observers 
 * @author ishitathumati
 *
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
