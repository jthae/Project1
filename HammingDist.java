/*
* @author Jaycie Thaemert
* @author Samson Olivero
*
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
