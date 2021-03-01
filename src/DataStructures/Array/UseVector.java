package Array;

import java.util.Vector;

/**
 * @author supremepole
 */
public class UseVector {
    public static void main(String[] args){
        Vector vector=new Vector(4,2);
        System.out.println("初始大小："+vector.size());//0
        System.out.println("初始容量："+vector.capacity());//4
        vector.add(0);//实现List接口重写的方法，返回值为boolean
        vector.addElement(1);//vector类特有的方法，返回值为void
        vector.add(2,3);
        System.out.println("添加两个元素后大小："+vector.size());//3
        System.out.println("添加两个元素后容量："+vector.capacity());//4
        vector.add(3,4);
        System.out.println("添加两个元素后大小："+vector.size());//4
        System.out.println("添加两个元素后容量："+vector.capacity());//4
        vector.add(4,5);
        System.out.println("添加两个元素后大小："+vector.size());//5
        System.out.println("添加两个元素后容量："+vector.capacity());//6
    }
}
