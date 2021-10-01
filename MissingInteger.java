import java.util.HashSet;
public class MissingInteger {
    public int solution(int[] A) {
        HashSet<Integer> zeki = new HashSet<>();
        for(int i=1; i<=A.length+1;i++){
            zeki.add(i);
        }

        for(int a:A){
            zeki.remove(new Integer(a));
        }
        return zeki.iterator().next();
    }
    public static void main(String[] args) {
        MissingInteger missingInteger = new MissingInteger();
        System.out.println(missingInteger.solution(new int[]{1,3,6,4,1,2}));
    }
}
