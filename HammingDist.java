
public class HammingDist
{
	private String stid1;
	private String stid2;
	
	private int dist;
	
	private int s1dist1;
	private int s1dist2;
	private int s1dist3;
	private int s1dist4;
	
	private int s2dist1;
	private int s2dist2;
	private int s2dist3;
	private int s2dist4;
	
	public HammingDist(String str1, String str2)
	{
		stid1 = str1;
		stid2 = str2;
	}
	
	public void findHammingDist()
	{
	
	}
	
	public String toString()
	{
		return ("The Hamming Distance of %s and %s: %f.\n"
				+ "Out of 120, for %s, number of nodes are: %i, %i, %i, %i and\n"
				+ "for %s, number of nodes are: respectively.", stid1, stid2, dist, )
	}
}
