package Day8.com;
public class Krushkal {
    static class Subset{
        int parent,rank;
    }
    int vertices,edges;
    Edge[] edgeArray;
    public Krushkal(int vertices,int edges){
        this.vertices=vertices;
        this.edges=edges;
        edgeArray=new Edge[edges];
    }
    public int find(Subset[] subsets,int i){
        if(subsets[i].parent!=i){
            subsets[i].parent=find(subsets,subsets[i].parent);
        }
        return subsets[i].parent;
    }
    void union(Subset[] subsets,int x,int y){
        int xroot=find(subsets,x);
        int yroot=find(subsets,y);
        if(subsets[xroot].rank<subsets[yroot].rank){
            subsets[xroot].parent=yroot;
        }
        else if(subsets[xroot].rank>subsets[yroot].rank){
            subsets[yroot].parent=xroot;
        }
        else{
            subsets[yroot].parent=xroot;
            subsets[xroot].rank++;
        }
    }
    public void MST(){
        Edge result=new Edge[vertices];
        int e=0;
        int i=0;
        Arrays.sort(edgeArray);
        Subset subset=new Subset[vertices];
        for(int v=0;v<vertices;++v){
            subsets[v]=new Subset();
            subsets[v].parent=v;
            subsets[v].rank=0;
        }
        while(e<vertices -1){
            Edge nextEdge=edgeArray[i++];
            int x=find(subsets,nextEdge.src);
            int y=find(subsets,nextEdge.dest);
            if(x!=y){
                result[e++]=nextEdge;
                union(subsets,x,y);
            }
        }
        for(i=0;i<e;++i){
            System.out.println(result[i].src+" -- "+result[i].dest+" -- "+result[i].weight);
        }
    }
    public static void main(String[] args) {
        int vertices=8;
        int edges=14;
        Krushkal graph=new Krushkal(vertices,edges);
        graph.edgeArray[0]=new Edge(0,1,4);
        graph.edgeArray[1]=new Edge(0,7,8);
        graph.edgeArray[2]=new Edge(1,2,8);
        graph.edgeArray[3]=new Edge(1,7,11);
        graph.edgeArray[4]=new Edge(2,3,7);
        graph.edgeArray[5]=new Edge(2,8,2);
        graph.edgeArray[6]=new Edge(2,5,4);
        graph.edgeArray[7]=new Edge(3,4,9);
        graph.edgeArray[8]=new Edge(3,5,14);
        graph.edgeArray[9]=new Edge(4,5,10);
        graph.edgeArray[10]=new Edge(5,6,2);
        graph.edgeArray[11]=new Edge(6,7,1);
        graph.edgeArray[12]=new Edge(6,8,6);
        graph.edgeArray[13]=new Edge(7,8,7);
        graph.MST();
    }
}
