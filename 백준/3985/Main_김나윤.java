import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_김나윤 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        boolean[] isEaten = new boolean[L];
        int eIndex = 0, eCake = 0, rIndex = 0, rCake = 0;

        for(int i = 1; i < N + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());

            if (end - start + 1 > eCake) {
                eIndex = i;
                eCake = end - start + 1;
            }
            int result = 0;
            for(int j = start - 1; j < end; j++) {
                if (isEaten[j]) continue;
                isEaten[j] = true;
                result++;
            }
            if (result > rCake) {
                rCake = result;
                rIndex = i;
            }
        }

        System.out.println(eIndex);
        System.out.println(rIndex);

    }
}
