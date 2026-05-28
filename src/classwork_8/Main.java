package classwork_8;

public class Main {
//	// 2
//	class Student{
//		 String name;
//		 int[] grades;
//
//		 Student(String n,int[] g){
//		  name=n;
//		  grades=g;
//		 }
//
//		 double averageGrade(){
//		  int sum=0;
//
//		  for(int i=0;i<grades.length;i++){
//		   sum+=grades[i];
//		  }
//
//		  return (double)sum/grades.length;
//		 }
//
//		 void info(){
//		  System.out.println(name);
//		  System.out.println(averageGrade());
//		 }
//		}
	class Student{
		 String name;
		 int[] grades;

		 Student(String n,int[] g){
		  name=n;
		  grades=g;
		 }

		 double averageGrade(){
		  int sum=0;

		  for(int i=0;i<grades.length;i++){
		   sum+=grades[i];
		  }

		  return (double)sum/grades.length;
		 }

		 void info(){
		  System.out.println(name);
		  System.out.println(averageGrade());
		 }
		}

		public class Main{
		 public static void main(String[] args){

		  int[] g={5,4,5};

		  Student s=new Student("Nadir",g);

		  s.info();

		 }
		}

	
	
	}


	


