
import java.util.*;
public class Des {
   
    static String s;
    static int num;
    static char arr[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
   
    public static int gcd(int a, int b)
    {
        // Everything divides 0  
        if (a == 0)
          return b;
        if (b == 0)
          return a;
        // base case
        if (a == b)
            return a;
        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
   
    public static int[] con(String n){
        int number=0;
        int num[]=new int[n.length()];
        char te[]=new char[n.length()];
        for(int i=0;i<n.length();i++){
            te[i]=n.charAt(i);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<te.length;j++){
                if(te[j]==arr[i]){
              num[j]=i;
                }
            }
        }  
        return num;
    }
   
    public static String encmsg(int ar[]){
        String dec="";
        char charr[]=new char[ar.length];
        for(int i=0;i<ar.length;i++){
            charr[i]=arr[ar[i]];
            dec=dec+Character.toString(charr[i]);
        }
        return dec;
    }
   
   
    public static int[] kg(String a){
        int key[]=new int[2];
        try{
            char temp=a.charAt(0);
            char temp1=a.charAt(a.length()-1);
            key[0]=9;//because there should be multiplicative inverse of mod 26 so we should take any number
            for(int i=0;i<arr.length;i++){
                if(temp1==arr[i]){
                    key[1]=i;
                }
            }
            System.out.println("\n\nKeys for this name\n"+key[0]+" "+key[1]+"\nWe are taking 9 as defaulf key of a out of a,b\n and b will be last letter of the name we given\n");
        }
        catch(Exception e){ System.out.println("Enter valid name");System.exit(0);}
        return key;
    }
   
    public static int[] enc(int a[],int k[]){
        int dec[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            dec[i]=((k[0]*a[i])+k[1])%26;
        }
        return dec;
    }
   
    public static int[] decr(int a[],int k[]){
        int dec[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            if(a[i]<k[1]){
                dec[i]=(k[0]*(a[i]-k[1]))%26;
                dec[i]=dec[i]+26;
            }
            else{
                dec[i]=(k[0]*(a[i]-k[1]))%26;
            }
        }
        return dec;
    }
   
    public static int modInverse(int a, int m)
    {
        a = a % m;
        for (int x = 1; x < m; x++)
           if ((a * x) % m == 1)
              return x;
        return 1;
    }
   
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.nextLine();
        name=name.toUpperCase();
        if(name==""){System.exit(0);}
       
        int N[]=con(name);
       
        int tbt=0;
        System.out.println("Total books taken : "+tbt);
        int key[]=kg(name);
        // for(int i=0;i<key.length;i++){System.out.print(key[i]);}
        int de[]=enc(N,key);
        String decry=encmsg(de);

        int stop=0;
     
        while (stop==0) {            
            System.out.println("Please select one option to continue");
            System.out.println("1)withdrawing a book \n 2)droping a book");
            int ch=sc.nextInt();
            switch(ch){
           
                case 1:if(tbt>=2){System.out.println("\n\nBOOKS ARE EXCEEDED\n\n");System.exit(0);}
                System.out.println("Enter the password to generate the key ");
                int pa=sc.nextInt();
                if(pa==1234){}else{System.out.println("Wrong password\n");;System.exit(0);}
                key[0]=9;
                for(int i=0;i<key.length;i++){System.out.print(key[i]+" ");}
                System.out.println();
                for(int i=0;i<de.length;i++){System.out.print(de[i]+" ");}
                System.out.println();
                System.out.println(decry);
                tbt=tbt+1;
                System.out.println("Total books taken : "+tbt);
                   
                break;
           
                case 2:System.out.println("Enter the password to generate the key ");
                int pass=sc.nextInt();
                if(pass==1234){}else{System.out.println("Wrong password\n");;System.exit(0);}
                if(tbt<=0){System.out.println("No book is there to drop\n");System.exit(0);}
                System.out.println("Please enter decryted text");          
                String msg=decry;
                System.out.println(msg);
                key[0]=modInverse(key[0], 26);
                System.out.println(key[0]);
                int dn[]=con(msg);
                int en[]=decr(dn,key);
                for(int i=0;i<en.length;i++){System.out.print(en[i]+" ");}
                System.out.println();
                String encry=encmsg(en);
                System.out.println(encry);
                if(encry.equals(name)){
                    tbt=tbt-1;
                    System.out.println("Total books taken : "+tbt);
                }
                else{System.out.println("Error in returning the book");}
                break;
                default:System.out.println("type correct number");
            }
            System.out.println("Press 1 if you want to stop the processs \nPress 0 to execute again");
            int st=sc.nextInt();
           
                if(st==1||st==0){stop=st;}
           
        }
       
       
    }
   
}


