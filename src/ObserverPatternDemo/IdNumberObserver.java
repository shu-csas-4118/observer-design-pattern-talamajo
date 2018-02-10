package ObserverPatternDemo;

public class IdNumberObserver implements IObserver {
	private Student student updater;
	
	public IdNumberObserver() {
		
	}
	
	public void update(Student student updater) {
		if student.attachObserver(CoursesObserver);
		System.out.println("Student's id number is " + student.getIdNumber());
	}

}
