
public class EvacuationPath {
	public int idNode;
	public int population;
	public int max_rate;
	public int k;
	public int[] evacuationPath;
	public EvacuationPath()
	{
		
	}
	public void afficher()
	{
		System.out.println("Chemin d'évacuation du noeud " + idNode);
		System.out.println("population : " + population);
		System.out.println("Max rate : " + max_rate);
		System.out.println("k : " + k);
		System.out.println("Chemin : ");
		for(int noeud : evacuationPath)
		{
			System.out.print(noeud + "|");
		}
		System.out.println("\n");
	}
}
