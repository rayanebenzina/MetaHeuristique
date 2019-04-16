import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		GraphReader gr = new GraphReader();
		Graph graph = null;
		try {
			graph = gr.readFile("sparse.full");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		graph.afficher();;
	}

}
