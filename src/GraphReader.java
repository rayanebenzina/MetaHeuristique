import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GraphReader {
	public GraphReader()
	{
		
	}
	public Graph readFile(String filename) throws IOException
	{
		BufferedReader f;
		Graph graph = new Graph();
		f = new BufferedReader(new FileReader( new File(filename)));
		String line;
		f.readLine();
		line = f.readLine();
		graph.nbEvacNodes = Integer.valueOf(line.split(" ")[0]);
		graph.idSafeNode = Integer.valueOf(line.split(" ")[1]);
		graph.idEvacNodes = new int[graph.nbEvacNodes];
		graph.paths = new EvacuationPath[graph.nbEvacNodes];
		for(int i =0; i < graph.nbEvacNodes; i++)
		{
			line = f.readLine();
			graph.paths[i] = new EvacuationPath();
			graph.paths[i].idNode = Integer.valueOf(line.split(" ")[0]);
			graph.idEvacNodes[i]=graph.paths[i].idNode;
			graph.paths[i].population = Integer.valueOf(line.split(" ")[1]);
			graph.paths[i].max_rate = Integer.valueOf(line.split(" ")[2]);
			graph.paths[i].k = Integer.valueOf(line.split(" ")[3]);
			graph.paths[i].evacuationPath = new int[graph.paths[i].k];
			for(int j = 0; j< graph.paths[i].k;j++ )
			{
				graph.paths[i].evacuationPath[j] = Integer.valueOf(line.split(" ")[4+j]);;
			}
		}
		f.readLine();
		line = f.readLine();
		graph.nbNodes = Integer.valueOf(line.split(" ")[0]);
		graph.nbEdges = Integer.valueOf(line.split(" ")[1]);
		graph.M = new Edges[graph.nbNodes][graph.nbNodes];
		for(int i = 0; i<graph.nbEdges; i++)
		{
			line = f.readLine();
			Edges edge = new Edges();
			int a = Integer.valueOf(line.split(" ")[0]);
			int b = Integer.valueOf(line.split(" ")[1]);
			edge.dueDate = Long.valueOf(line.split(" ")[2]);
			edge.length = Float.valueOf(line.split(" ")[3]);
			edge.capacity = Float.valueOf(line.split(" ")[4]);
			graph.M[a][b] = edge;
			graph.M[b][a] = edge;
		}
		
		f.close();
		return graph;
		
	}
}
