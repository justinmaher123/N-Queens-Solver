package NQueens.src;

import java.io.*;
import java.util.*;

public class NQueens {
    final static PrintWriter pw = new PrintWriter(System.out);
    final static Scanner sc = new Scanner(System.in);
    public static int n;
    public static boolean [][]queen;
    boolean check(int row,int col){
        for(int i=0;i<row;i++){
            if(queen[i][col]){
                return false;
            }
        }
        int i=row-1, j=col-1;
        while(i>=0&&j>=0){
            if(queen[i][j]){
                return false;
            }
            i--;
            j--;
        }
        i=row-1;
        j=col+1;
        while(i>=0&&j<n){
            if(queen[i][j]){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
    int cnt=1;
    void  ans(int row){
        if(row==n){
            pw.println("solution "+cnt);
            cnt++;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(queen[i][j]){
                        pw.print('Q');
                    }
                    else{
                        pw.print("[]");
                    }
                }
                pw.println();
            }
            pw.println();
            return;
        }
        for(int col=0;col<n;col++){
            if(check(row,col)){
                queen[row][col]=true;
                ans(row+1);
                queen[row][col]=false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        n= sc.nextInt();
        queen=new boolean[n][n];
        NQueens nQueens=new NQueens();
        nQueens.ans(0);
        pw.close();
    }

    static class Scanner {

            StringTokenizer st;
            BufferedReader br;
            public Scanner(InputStream s) {
                br = new BufferedReader(new InputStreamReader(s));
            }
            public Scanner(String file) throws IOException {
                br = new BufferedReader(new FileReader(file));
            }
            public Scanner(FileReader r) {
                br = new BufferedReader(r);
            }
            public String next() throws IOException {
                while (st == null || !st.hasMoreTokens())
                    st = new StringTokenizer(br.readLine());
                return st.nextToken();
            }
            public String readAllLines(BufferedReader reader) throws IOException {
                StringBuilder content = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
                return content.toString();
            }
            public int nextInt() throws IOException {
                return Integer.parseInt(next());
            }
            public long nextLong() throws IOException {
                return Long.parseLong(next());
            }
            public String nextLine() throws IOException {
                return br.readLine();
            }
            public double nextDouble() throws IOException {
                String x = next();
                StringBuilder sb = new StringBuilder("0");
                double res = 0, f = 1;
                boolean dec = false, neg = false;
                int start = 0;
                if (x.charAt(0) == '-') {
                    neg = true;
                    start++;
                }
                for (int i = start; i < x.length(); i++)
                    if (x.charAt(i) == '.') {
                        res = Long.parseLong(sb.toString());
                        sb = new StringBuilder("0");
                        dec = true;
                    } else {
                        sb.append(x.charAt(i));
                        if (dec)
                            f *= 10;
                    }
                res += Long.parseLong(sb.toString()) / f;
                return res * (neg ? -1 : 1);
            }
            public long[] nextlongArray(int n) throws IOException {
                long[] a = new long[n];
                for (int i = 0; i < n; i++)
                    a[i] = nextLong();
                return a;
            }
            public Long[] nextLongArray(int n) throws IOException {
                Long[] a = new Long[n];
                for (int i = 0; i < n; i++)
                    a[i] = nextLong();
                return a;
            }
            public int[] nextIntArray(int n) throws IOException {
                int[] a = new int[n];
                for (int i = 0; i < n; i++)
                    a[i] = nextInt();
                return a;
            }
            public Integer[] nextIntegerArray(int n) throws IOException {
                Integer[] a = new Integer[n];
                for (int i = 0; i < n; i++)
                    a[i] = nextInt();
                return a;
            }
            public boolean ready() throws IOException {
                return br.ready();
            }

        }
}
