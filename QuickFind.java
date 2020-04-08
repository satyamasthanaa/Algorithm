public class QuickFind{
	private int[] id;
	public QuickFind(int n){
		id = new int[N];
		for(int i=0;i<N;i++){
			id[i]=i;
		}
		boolean connected(int p;, int q;){
			return id[p]==id[q];
		}
		void union(int p, int q)
		{
			int pid = id[p];
			int qid = id[q];
			for (int i=0;i<id.lenght;i++)
			if(id[i]==pid) 
			id[i]=qid;
		}
	}
}
