package q070;

public class Q_70 {
	public static void main(String[] args) {
        int x = 10;
        int y = ++x;
        int z = 0;

        if(y >= 10 | y<= ++x){
            z = x;
        }else {
            z = x++;
        }
        System.out.println(z);
    }

}
/*
What is the result?
A. 11
B. 10
C. 12
D. A compile time error occurs.
 */