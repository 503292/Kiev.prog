package lesson3.task1;

public class Group {

	final static int GROUPSIZE = 10;

	private Student[] studentsArr = new Student[GROUPSIZE];
	private String groupName;

	public Group() {
		super();
		this.groupName = "unknow";
	}

	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void addStudent(Student student) throws fullGroupException {
		if (student == null) {
			throw new IllegalArgumentException("Null student");
		}
		for (int i = 0; i < GROUPSIZE; i++) {
			if (studentsArr[i] == null) {
				student.setGroup(this.groupName);
				this.studentsArr[i] = student;
				return;
			}
		}
		throw new fullGroupException();
	}

	public Student findStudent(String lastName) {
		for (Student student : studentsArr) {
			if (student != null && student.getLastName().equals(lastName)) {
				return student;
			}
		}
		return null;
	}

	public boolean delStudent(int num) {
		for (int i = 0; i < GROUPSIZE; i++) {
			if (studentsArr[i] != null && studentsArr[i].getZachotka() == num) {
				studentsArr[i] = null;
				return true;
			}
		}
		return false;
	}

	public void sortStudent() {
		for (int i = 0; i < GROUPSIZE; i++) {
			for (int j = i + 1; j < GROUPSIZE; j++) {
				if (compareStudent(studentsArr[i], studentsArr[j]) > 0) {
					Student temp = studentsArr[i];
					studentsArr[i] = studentsArr[j];
					studentsArr[j] = temp;
				}
			}
		}
	}

	private int compareStudent(Student a, Student b) {
		if (a != null && b == null) {
			return 1;
		}
		if (a == null && b != null) {
			return -1;
		}
		if (a == null && b == null) {
			return 0;
		}
		return a.getLastName().compareTo(b.getLastName());

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Group: " + this.groupName).append(System.lineSeparator());
		int i = 0;
		sortStudent();
		for (Student student : studentsArr) {
			if (student != null) {
				sb.append((++i) + ") ").append(student);
				sb.append(System.lineSeparator());
			}
		}
		return sb.toString();
	}

}
