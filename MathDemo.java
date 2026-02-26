public class MathDemo {
    int min(int a, int b){
        if (b < a) return b;
        return a;

    }
    int max(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }

    int sum(int[] args){
        int total = 0;
        for(int num:args){
            total+=num;
        }
        return total;

    }
    public static void main(String[] args) {
        MathDemo obj = new MathDemo();

        System.out.println(obj.min(5, 3));
        System.out.println(obj.max(5, 3));
        System.out.println(obj.sum(new int[]{5, 3}));
    }


}

