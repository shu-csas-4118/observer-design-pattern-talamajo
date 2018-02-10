package ObserverPatternDemo;

public class FirstNameObserver implements IObserver {
	private Student student updater;
	
	public FirstNameObserver() {
		
	}
	
	public void update(Student student updater) {
		if student.attachObserver(FirstNameObserver);
		System.out.println("Student's first name is " + student.getFirstName());
	}
}
