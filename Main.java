import java.io.IOException;
/*
* @author Jaycie Thaemert
* @author Samson Olivero
*
* Main method to run Hamming Distance class.
*/
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		HammingDist HammDist = new HammingDist("WEST", "BESS");
		
		HammDist.findNodes();
		
		System.out.println(HammDist);
	}
}
