package problem_solving;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.*;

class Students{
   private int id;
   private String fname;
   private double cgpa;
   public Students(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class JavaSort {

	   public static void main(String[] args){
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      
	      List<Students> studentList = new ArrayList<Students>();
	      while(testCases>0){
	         int id = in.nextInt();
	         String fname = in.next();
	         double cgpa = in.nextDouble();
	         
	         Students st = new Students(id, fname, cgpa);
	         studentList.add(st);
	         
	         testCases--;
	      }
	       Collections.sort(studentList, new Comparator<Students>() {
	              @Override
	               public int compare(Students s1, Students s2) {
	                    if(s2.getCgpa()>s1.getCgpa()){
	                        return 1;
	                    }else if(s2.getCgpa()<s1.getCgpa()){
	                        return -1;
	                    }
	                    return s1.getFname().compareTo(s2.getFname());
	                }
	        });
	      
	         for(Students st: studentList){
	         System.out.println(st.getFname());
	      }
	   }
}
