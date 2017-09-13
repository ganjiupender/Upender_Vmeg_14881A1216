import java.util.Date;
import java.util.*;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	ArrayList<Student> al=new ArrayList(Arrays.asList(students));
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		if(students == null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			ArrayList<Student> ss=new ArrayList(Arrays.asList(students)); 
			al.addAll(ss);
			String[] s = al.toArray(new String[al.size()]);
		}
		
	}

	@Override
	public Student getStudent(int index) {
		if(index<0 || index>=students.length)
		{
			throw new IllegalArgumentException();
		}
		else
		{
				return students[index];
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		if(student == null || index<0 || index>=students.length)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			al.set(index,student);
		}
	}

	@Override
	public void addFirst(Student student) {
		if(student == null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			al.set(0,student);
		}
	}

	@Override
	public void addLast(Student student) {
		if(student == null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			al.set(al.size()+1,student);
		}
	}

	@Override
	public void add(Student student, int index) {
		if(student == null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			al.add(index,student);
		}
	}

	@Override
	public void remove(int index) {
		if(index<0 || index>students.length)
		{
			throw new IllegalArgumentException();
		}
		else{
			al.remove(index);
		}
	}

	@Override
	public void remove(Student student) {
		int c=0;
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i) == student)
			{
				al.remove(i);
				c++;
				break;
			}
		}
		if(c!=0 || student == null)
		{
			throw new IllegalArgumentException();
		}
		
	}

	@Override
	public void removeFromIndex(int index) {
		if(index<0 || index>students.length)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			for(int i=index;i<al.size();i++)
			{	
				al.remove(i);
			}
		}
		
	}

	@Override
	public void removeFromElement(Student student) {
		int c=0;
		if(student == null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			for(int i=0;i<al.size();i++)
			{
				if(al.get(i) == student)
				{
					al.remove(i);
					c=i;
					break;
				}
			}
			if(c>0)
			{
				for(int i=c;i<al.size();i++)
				{
					al.remove(i);
				}
			}
		}
		
	}

	@Override
	public void removeToIndex(int index) {
		if(index<0 || index>=students.length)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			for(int i=0;i<index;i++)
			{
				al.remove(i);
			}
		}
	}

	@Override
	public void removeToElement(Student student) {
		int c=0;
		if(student == null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			for(int i=0;i<al.size();i++)
			{
				if(al.get(i) == student)
				{
					al.remove(i);
					c=i;
					break;
				}
			}
			if(c>0)
			{
				for(int i=0;i<c;i++)
				{
					al.remove(i);
				}
			}
		}
	}

	@Override
	public void bubbleSort() {
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		if(date == null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
