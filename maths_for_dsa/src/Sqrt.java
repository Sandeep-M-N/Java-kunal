public class Sqrt {
    public static void main(String[] args) {
        int n=40;
        int p = 3;
        int z=20;
        System.out.println(squareroot(n,p));
        System.out.println(Math.sqrt(20));
    }
    static double squareroot(int n ,int p ){
        double root=0.0;
        int s=0;
        int e=n;
        while(s<=e){
            int m = s+ (e-s)/2;
            if(m*m==n){
                return m;
            }
            if(m*m>n){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        double incr=0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root+=incr;

            }
            root-=incr;
            incr++;
        }
        return root;
    }
}
// time : O(log N)