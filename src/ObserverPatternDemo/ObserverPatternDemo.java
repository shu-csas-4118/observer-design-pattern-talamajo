package ObserverPatternDemo;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student updater = new Student("Garett", "Chang", 123456, "changgar@shu.edu");
		
		IdNumberObserver idObserver =  new IdNumberObserver();
		FirstNameObserver firstNameObserver = new FirstNameObserver();
		
		student.attachObserver(FirstNameObserver);
		student.attachObserver(IdNumberObserver);
		student.attachObserver(EmailObserver);
		student.attachObserver(CoursesObserver);
		
		student.addCourses("Software Engineering");
		student.addCourses("Automata")
		student.setFirstName("Garrett");
		student.setIdNumber(54321);
		
	}

}
