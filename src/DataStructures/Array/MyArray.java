package Array;

import java.sql.SQLOutput;
import java.util.Vector;

/**
 * @author supremepole
 */
public class MyArray {
    public static void main(String[] args){
        //数组静态初始化
        int[] array1={1, 2, 3, 4};
        //数组动态初始化
        int[] array2=new int[1];

        //数组扩容
        int length= array2.length+1;
        int[] arrayNew=new int[length];
        for(int i=0;i<array2.length;i++){
            arrayNew[i]=array2[i];
        }
        array2=arrayNew;

        //删除元素
        int number=0;
        for(int i=0;i<array1.length;i++){
            if(array1[i]==number){
                for(int j=i;j<array1.length-1;j++){//array.length-1是为了防止后面j+1数组越界
                    array1[j]=array1[j+1];
                }
            }
        }
        System.out.println();


    }

}
