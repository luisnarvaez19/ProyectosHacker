package com.rappi;

import java.util.HashSet;

public class IsThisATree {

    private static final int AS=(int) "A".charAt(0);

    /*
     * Complete the 'SExpression' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING nodes as parameter.
     */
    public static String SExpression(String s){
        boolean[][] graph = new boolean [26][26];
        HashSet<Character> nodes = new HashSet<>();
        //construct graph and check error E2: duplicate edges
        boolean E2 = false;
        for(int i=1;i<s.length();i+=6){
            int x = (int)s.charAt(i)-AS;   //  For the index to be 0
            int y = (int)s.charAt(i+2)-AS; //  For the index to be 0 (-AS)
            // E2: Duplicate Edges
            if(graph[x][y])
                E2 = true;
            graph[x][y] = true;
            nodes.add(s.charAt(i));
            nodes.add(s.charAt(i+2));
        }
        //check error E1: more than 2 children
        boolean E1 = false;
        for(int i=0;i<26;i++){
            int count = 0; //number of child
            for(int j=0;j<26;j++){
                if(graph[i][j])
                    count++;
            }
            if(count>2)
                return "E1";
        }
        if(E2) return "E2"; //return E2 after checking E1

        //check E3: cycle present and E4: multiple roots
        int numOfRoots = 0;
        Character root = ' ';
        for (Character node:  nodes){ //only check char that in the tree
            for(int i=0;i<26;i++){
                int j= (int)node-AS;
                if(graph[i][j])
                    break;
                if(i==25){
                    numOfRoots++;
                    root = node;
                    boolean[] visited = new boolean[26];
                    if(IsCycle(node, graph, visited))
                        return "E3";
                }
            }
        }
        if(numOfRoots==0) return "E3"; //if no root, must be a cycle
        if(numOfRoots>1) return "E4"; //if more than one roots
        if(root==' ') return "E5"; //if no edge in input string, invalid input error
        return GetExpressionHelper(root, graph);

    }

    //true means there is a cycle, false means no cycle
    private static boolean IsCycle(Character node, boolean[][] graph, boolean[] visited){
        int j = (int) node - AS;
        if(visited[j]) //node has already been visited, must has a cycle
            return true;
        visited[j] = true;
        for(int i=0;i<26;i++){
            if(graph[j][i]){
                if (IsCycle((char)(i+AS), graph, visited))
                    return true;
            }
        }
        return false;
    }

    //Recursive DFS to get the expression/construct the tree
    private static String GetExpressionHelper(Character root, boolean[][] graph){
        String left = "";
        String right = ""; //if no children, left and right should be empty
        int raiz= (int) root-AS;
        for(int i=0;i<26;i++){
            if(graph[raiz][i]){
                left = GetExpressionHelper((char)(i+AS), graph);
                for(int j=i+1;j<26;j++){
                    if(graph[raiz][j]){
                        right = GetExpressionHelper((char)(j+AS) ,graph);
                        break;
                    }
                }
                break;
            }
        }
        return "("+root+left+right+")";
    }

    public static void main(String[] args) {
        int ascii1 = (int) "A".charAt(0);
        int ascii2 = (int) "B".charAt(0);
        String caso1="(A,B) (A,C) (B,G) (C,H) (E,F) (B,D) (C,E)";
        String caso2="(B,D) (D,E) (A,B) (C,F) (E,G) (A,C)";
        String caso3="(A,B) (A,C) (B,D) (D,C)";
        System.out.println("x: "+(char)((1)+AS));
        System.out.println("x: "+SExpression(caso1));
    }
}
