package lesson3.task1;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Group {

	final static int GROUPSIZE = 10;

	private Student[] students = new Student[GROUPSIZE];

	public void addStudent(Student student) {
		for (int i = 0; i < GROUPSIZE; i++) {
			if (students[i] == null) {
				this.students[i] = student;
				return;
			}

		}
		try {
			throw new fullGroupException();
		}catch(fullGroupException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
	}

	public void delStudent(int d) {
		if ((d >= 0) && (d < GROUPSIZE) && (this.students[d] != null)) {
			this.students[d] = null;
		} else {
			System.out.println("Incorrect input or element is null");
		}
	}

	public void findStudent(String name) {
		for (int i = 0; i < GROUPSIZE; i++) {
			if (students[i].getName().equals(name)) {
				System.out.println(students[i].getName() + " is on the group ");
				break;
			}

		}
		System.out.println(name + " not in the group ");
	}

	public void sortStudent() {
		for (int j = 1; j < GROUPSIZE; j++) {
			for (int i = 1; i < GROUPSIZE-j+1; i++) {
				if (students[i - 1].getName().compareTo(students[i].getName()) > 0) {
					String temp = "";
					temp = students[i - 1].getName();
					students[i - 1].setName(students[i].getName());
					students[i].setName(temp);
				}
			}
		}
	}

	@Override
	public String toString() {
		this.sortStudent();
		return "Group [students=" + Arrays.toString(students);
	}

}
