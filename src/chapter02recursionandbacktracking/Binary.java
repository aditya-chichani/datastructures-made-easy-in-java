package chapter02recursionandbacktracking;

import java.util.Arrays;

public class Binary {
    int A[] = new int[3];
    String str="";
    public static void main(String[] args) {
        Binary b = new Binary();
        b.BinaryGen(3,0);
    }

    public void BinaryGen(int n,int count){
        if(count==n)
        {
            for(int x : A)
                System.out.print(x);
            System.out.println();
            count=0;
        }
        else{
            A[count]=0;
            BinaryGen(n,count+1);
            A[count]=1;
            BinaryGen(n,count+1);
        }
    }

}
