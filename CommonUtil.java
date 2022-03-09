package oppbasics;

public class CommonUtil {
  public String getpropername(String name){
	  String names[]=name.split(" ");
	  String propername=" ";
	  for(String n : names){
	  propername +=(String.valueOf(n.charAt(0)).toUpperCase()+n.substring(1).toLowerCase()+"");
	  }
	return propername;
  }
}