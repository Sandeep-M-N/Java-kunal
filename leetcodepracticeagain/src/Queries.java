public class Queries {
    public static void main(String[] args) {
        int[][] arr={
                {1,56,67,89},
                {2,89,54,90},
                {3,78,91,83},
                {4,69,72,95}
                
        };
        char str1='C';
        String str2="A>70";
        int col=0;
        int row=0;
        int col2=0;
        if(str1=='R'){
            col=0;
        
            
        }
        if(str1=='A'){
            col=1;
        }
        if(str1=='B'){
            col=2;
        }
        if(str1=='C'){
            col=3;
        }

        if(str2.charAt(0)=='A'){
            col2=1;
        }
        if(str2.charAt(0)=='B'){
            col2=2;
        }
        if(str2.charAt(0)=='C'){
            col2=3;
        }
        int number=Integer.parseInt(str2.substring(str2.length()-2,str2.length()));
      int rs=0;
      int re= arr.length-1;
      int cs=0;
      int ce=arr[0].length-1;
      while(rs<=re && cs<=ce){
          if(str2.charAt(1)=='<'){
              if(arr[row][col2]<number){
                  System.out.println(arr[row][col]);


              }
              row++;
          }
          if(str2.charAt(1)=='>'){
              if(arr[row][col2]>number){
                  System.out.println(arr[row][col]);


              }
              row++;
          }
          if(str2.charAt(1)=='='){
              if(arr[row][col2]==number){
                  System.out.println(arr[row][col]);


              }
              row++;
          }
          rs++;
          cs++;
      }
        
    }
}
