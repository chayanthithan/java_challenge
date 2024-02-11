import java.util.*;
import java.lang.*;

class regnumGenerate{
	private String course=null;
	Date d=new Date();
	int count=1;
	
	public regnumGenerate(String courseName){
		this.course=courseName;
	}
	// static regnumGenerate getInstance(){
		// obj=new regnumGenerate();
	// }
	public String generate(){
		@SuppressWarnings("deprecation")
        int currentYearDate =d.getYear() + 1900;
		String Numformat=String.format("%02d",count);
		String reg=currentYearDate+course+count;
		count++;
		return reg;
	}
	
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your course-name here:");
		String cName=scan.nextLine();
		regnumGenerate a=new regnumGenerate(cName);
		System.out.println(a.generate());
	}
}
