import java.io.IOException;

public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		HammingDist HammDist = new HammingDist("WEST", "BESS");
		
		HammDist.findNodes();
		
		System.out.println(HammDist);
	}
}
