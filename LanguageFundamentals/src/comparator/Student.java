package comparator;

public class Student implements Comparable<Student>
{
		private String name;
		private int rollno;
		
		public Student(String name, int rollno) {
			this.name = name;
			this.rollno = rollno;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the rollno
		 */
		public int getRollno() {
			return rollno;
		}

		/**
		 * @param rollno the rollno to set
		 */
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return "name = "+ name + "  rollno : " + rollno;
		}
		
		@Override
		public int compareTo(Student o) {
		
		return this.name.compareToIgnoreCase(o.name);
		}
		
		
}
