import java.io.BufferedReader;
/*
* @author Jaycie Thaemert
* @author Samson Olivero
*
* Project 1 is a simple class to calculate the hamming distance between
* two STIDs as well as count the number of hamming distances among the
* other STIDs in the list.
*/
public class HammingDist
{
	// declare instance variables to store STID Strings
	private String stid1;
	private String stid2;
	
	// declare instance variables to store distances for other nodes
	private int s1dist1 = 0;
	private int s1dist2 = 0;
	private int s1dist3 = 0;
	private int s1dist4 = 0;
	
	private int s2dist1 = 0;
	private int s2dist2 = 0;
	private int s2dist3 = 0;
	private int s2dist4 = 0;
	
	/* constructor for hamming distance. 
	* @param str1 first STID
	* @param str2 second STID
	*/
	public HammingDist(String str1, String str2)
	{
		stid1 = str1;
		stid2 = str2;
	}
	
	/* method to find hamming distance between the two input strings.
	* counts the number of chars at specified indices which are different
	* from one another.
	*/
	public void findHammingDist()
	{
		int count = 0;
		
		for(int i = 0; i < 4; ++i)
		{
			if (stid1.charAt(i) != (stid2.charAt(i)))
			{
				++count;
			}
		}
		
		return count;
	}
	/* method to find hamming distance between two input strings
	* and the rest of the strings in the file. utilizes nested for loops
	* to run through file and count hamming distances.
	*
	*/
	public void findNodes() throws IOException
	{
		// create buffered reader to read in Mesonet.txt file
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
		// read through first three lines
		String line = br.readLine();
		line = br.readLine();
		line = br.readLine();

		for(int i = 4; i <= 123; ++i)
		{
			line = br.readLine();
			int count = 0;
			for(int j = 0; j < 4; ++j)
			{
				if (stid1.charAt(j) != line.charAt(j+1))
				{
					++count;
				}
			}
			
			if (count == 1)
			{
				++s1dist1;
			}
			if (count == 2)
			{
				++s1dist2;
			}
			if (count == 3)
			{
				++s1dist3;
			}
			if (count == 4)
			{
				++s1dist4;
			}
			line = br.readLine();
		
		}
		br.close();
		
		BufferedReader br2 = new BufferedReader(new FileReader("Mesonet.txt"));
		line = br2.readLine();
		line = br2.readLine();
		line = br2.readLine();
		
		line = br2.readLine();
		
		for(int k = 4; k <= 123; ++k)
		{
			
			int count = 0;
			for(int l = 0; l < 4; ++l)
			{
				if (stid2.charAt(l) != line.charAt(l+1))
				{
					++count;
				}
			}
		
			if (count == 1)
			{
				++s2dist1;
			}
			if (count == 2)
			{
				++s2dist2;
			}
			if (count == 3)
			{
				++s2dist3;
			}
			if (count == 4)
			{
				++s2dist4;
			}
			line = br2.readLine();
		}
		br2.close();
	}
	
	/* override for normal toString method. prints out a string with 
	* various hamming distance characteristics in specified format.
	*/
	@Override
	public String toString()
	{
		return ("The Hamming Distance of %s and %s: %f.\n"
				+ "Out of 120, for %s, number of nodes are: %i, %i, %i, %i and\n"
				+ "for %s, number of nodes are: respectively.", stid1, stid2, findHammingDist(), )
	}
}
