
public class Q4
{
	public static void main(String[] args) {
	    
	    //04 - i
	    String[] months = new String[11];
	    
	    months[0] = "January";
	    months[3] = "April";
	    months[5] = "June";
	    months[7] = "August";
	    months[10] = "November";
	    
	    
	    //04 - ii
	    char[] capitalLetters = new char[26];
	    
	    //04 - iii
	    for (int i=0;i < 26 ;i++ ) {
	        capitalLetters[i] = (char)(65+i);
	    } 
	    
	    //04 - iv
	    int[] array = {12,-43,6,83,14,-57,109,-18,0,63};
	    
	    //04 - v
	    int index = 0;
	    int min = array[index];
	    
	    for (int i = 1;i<array.length ;i++ ){
	        if(array[i] <= min) {
	            min = array[i];
	            index = i;
	        }
	    } 
	    System.out.println("Smallest number: "+min);
	    System.out.println("Smallest number's location: "+(index+1)+"th position");	    
	}
}
