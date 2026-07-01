import java.util.Scanner;

class Student {
	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public double calculateAverage() {
		if (marks == null || marks.length == 0) {
			return 0.0;
		}

		int total = 0;
		for (int mark : marks) {
			total += mark;
		}

		return (double) total / marks.length;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter student name: ");
		String name = scanner.nextLine();

		System.out.print("Enter number of marks: ");
		int n = scanner.nextInt();

		int[] marks = new int[n < 0 ? 0 : n];
		for (int i = 0; i < marks.length; i++) {
			System.out.print("Enter mark " + (i + 1) + ": ");
			marks[i] = scanner.nextInt();
		}

		Student s = new Student(name, marks);
		System.out.println(s.calculateAverage());

		scanner.close();
	}
}
