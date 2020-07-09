import java.util.*;

public class BuildOrder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int d = sc.nextInt();
        
        sc.nextLine();
        ArrayList<String> project = new ArrayList<>();
        for(String val:sc.nextLine().split(" ")){
            // System.out.print(val+" ");
            project.add(val);
        }
        
        ArrayList<ArrayList<String> > dependencies = new ArrayList<>();
        for(int i=0;i<d;i++){
            ArrayList<String> dependency = new ArrayList<>();
            for(String dep:sc.nextLine().split(" ")){
                dependency.add(dep);
            }
            dependencies.add(dependency);
        }
        ArrayList<String> ans = buildOrder(project,dependencies);

        for(String proj:ans){
            System.out.print(proj+" ");
        }
        sc.close();
    }
    public static ArrayList<String> buildOrder(ArrayList<String> project,ArrayList<ArrayList<String>> dependencies){

        int n = project.size();

        ArrayList<String> result = new ArrayList<String>();
        if (n <= 0)
            return result;
        
        HashMap<String, Integer> in_degree = new HashMap<>();
        HashMap<String, ArrayList<String>> adj_list = new HashMap<>();

        for (int i = 0; i < project.size(); i++) {
            in_degree.put(project.get(i), 0);
            adj_list.put(project.get(i), new ArrayList<String>());
        }

        for (int i = 0; i < dependencies.size(); i++) { // Adjacency list

            String node = dependencies.get(i).get(0);
            String neighbor = dependencies.get(i).get(1);
            adj_list.get(node).add(neighbor);

            // Increment InDegree
            in_degree.put(neighbor, in_degree.get(neighbor) + 1);
        }

        Queue<String> sources = new LinkedList<>();

        for (Map.Entry<String, Integer> entry : in_degree.entrySet()) {

            if (entry.getValue() == 0) // Sources with In Degree of 0
                sources.add(entry.getKey());
        }

        while (!sources.isEmpty()) {

            String vertex = sources.poll();
            result.add(vertex);
            List<String> neighbors = adj_list.get(vertex);
            for (String neighbor : neighbors) { // Decrement InDegree
                in_degree.put(neighbor, in_degree.get(neighbor) - 1);
                if (in_degree.get(neighbor) == 0)
                    sources.add(neighbor);
            }
        }

        if (result.size() != n) // Not possible
        {
            ArrayList<String> res = new ArrayList<String>();
            res.add("-1");
            return res;
        }

        return result;

    }

}
