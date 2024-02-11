import java.util.*;
import java.lang.*;

class regnumGenerate{
	private String course=null;
	Date d=new Date();
	int count;
	//private static regnumGenerate obj=null;
	private regnumGenerate(){
		course="icts";
		count=1;
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
		regnumGenerate a=new regnumGenerate();
		System.out.println(a.generate());
	}
}