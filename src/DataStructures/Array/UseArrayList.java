package Array;

import java.util.ArrayList;

/**
 * @author supremepole
 */
public class UseArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("https://cs.supremepole.com");
        arrayList.add("https://www.github.com");
        arrayList.set(1,"https://www.gitee.com");
        //arrayList.remove(1);
        System.out.println(arrayList.get(0));
        System.out.println(""+arrayList.size());//size length
    }
}
