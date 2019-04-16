
public class Graph {
	public int nbEvacNodes, nbNodes, nbEdges;
	public int idSafeNode;
	public int[] idEvacNodes;
	public Node[] nodes;
	public EvacuationPath[] paths;
	public Edges[][] M;
	public Graph()
	{
	}
	public void afficher()
	{
		System.out.println("nb noeud a evacuer : " + nbEvacNodes);
		System.out.println("id noeud safe : " + idSafeNode + "\n\n");
		for(EvacuationPath path : paths)
		{
			path.afficher();
		}
		
		for(Edges[] edges : M)
		{
			for(Edges edge : edges)
			{
				if(edge != null)
					System.out.print(edge.length/30 + "|");
			}
			System.out.println();
		}
		
	}
}
