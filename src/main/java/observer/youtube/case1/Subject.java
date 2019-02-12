package observer.youtube.case1;

public interface Subject {

	void addObserver(Observer subscriber);
	void deleteObserver(Observer subscriber);
	void notifyObservers(String title);

}
