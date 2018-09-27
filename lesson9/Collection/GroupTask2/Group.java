package lesson9.Collection.GroupTask2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class Group implements Voencom, Serializable {

	private static final long serialVersionUID = 1L;
	private List<Student> students;
	private String groupName;
	private int MAX_GROUP_SIZE = 10;

	public Group() {
		super();
		students = new ArrayList<>();
		this.groupName = "unknow";
	}

	public Group(String groupName) {
		super();
		students = new ArrayList<>();
		this.groupName = groupName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void addStudentInteractive() throws fullGroupException {
		try {
			String name = getName("Input student name");
			String lastName = getName("Input student lastname");
			int age = getAge();
			boolean sex = getSex("Input sex -> man or women");
			long zach = getZach("Input zach number");
			String group = this.groupName;
			Student st = new Student(name, lastName, age, sex, zach, group);
			this.addStudent(st);
		} catch (NullPointerException e) {
			System.out.println("Canceled");
			return;
		}
	}

	public void addStudent(Student student) throws fullGroupException {
		if (student == null) {
			throw new IllegalArgumentException("Null student");
		}
		if (students.size() >= MAX_GROUP_SIZE) {
			throw new fullGroupException();
		}else {
		students.add(student);
		}

		
	}

	public Student search(String lastName) {
		for (Student student : students) {
			if (student != null && student.getLastname().equals(lastName)) {
				return student;
			}
		}
		return null;
	}

	public boolean deleteStudent(long number) {
		Iterator<Student> itr = this.students.iterator();
		for (; itr.hasNext();) {
			Student student = itr.next();
			if (student.getZach() == number) {
				itr.remove();
				return true;
			}
		}
		return false;

	}




	private int getAge() throws NullPointerException {
		boolean done = false;
		int age = 0;
		for (; !done;) {
			try {
				age = Integer.valueOf(JOptionPane.showInputDialog("Input student age"));
				done = true;
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Invalid ");
			}
		}
		return age;
	}

	private String getName(String message) throws NullPointerException {

		boolean done = false;
		String name = "";
		for (; !done;) {
			try {
				name = JOptionPane.showInputDialog(message);
				done = true;
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Invalid format");
			}
		}
		return name;
	}

	private boolean getSex(String message) throws NullPointerException {
		boolean done = false;
		boolean name = false;
		for (; !done;) {
			try {
				name = JOptionPane.showInputDialog(message).equals("man");
				done = true;
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Invalid format");
			}
		}
		return name;
	}

	private long getZach(String message) throws NullPointerException {
		boolean done = false;
		long name = 0;
		for (; !done;) {
			try {
				name = Long.valueOf(JOptionPane.showInputDialog(message));
				done = true;
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Invalid format");
			}
		}
		return name;
	}

	public void sortByParametr(int i) {
		this.students.sort(new StudentComparator(i));
	}

	public void sortByParametr(int i, boolean forward) {
		this.students.sort(new StudentComparator(i, forward));
	}

	public Student[] getStudentArray() {
		return this.students.toArray(new Student[0]);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Group: " + this.groupName).append(System.lineSeparator());
		int i = 0;
		// sort();
		for (Student student : students) {
			if (student != null) {
				sb.append((++i) + ") ").append(student);
				sb.append(System.lineSeparator());
			}
		}
		return sb.toString();
	}

	@Override
	public Student[] getRecruter() {
		int n = 0;
		for (Student student : students) {
			if (student != null && student.isSex() && student.getAge() >= 18) {
				n += 1;
			}
		}
		Student[] recruterArray = new Student[n];
		int i = 0;
		for (Student student : this.students) {
			if (student != null && student.isSex() && student.getAge() >= 18) {
				recruterArray[i++] = student;
			}
		}
		return recruterArray;
	}

}