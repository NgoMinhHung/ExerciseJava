public class Exercise26 {

    public int fineNumberCrazyFibonacci(int a, int b, int c, int d, int e, int n){

        int result = 0;

        switch (n){
            case 0: {
                result = -1;
                break;
            }
            case 1: {
                result = a;
                break;
            }
            case 2: {
                result = b;
                break;
            }
            case 3: {
                result = c;
                break;
            }
            case 4: {
                result = d;
                break;
            }
            case 5: {
                result = e;
                break;
            }
            default:{
                int i = 5;
                while (i < n){
                    result = (a + b + c + d + e) % 10;
                    a = b;
                    b = c;
                    c = d;
                    d = e;
                    e = result;
                    i++;
                }
            }
        }

        return result;
    }
}
