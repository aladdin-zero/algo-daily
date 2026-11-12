public class Main {
    // 1부터 n까지의 합을 구한다. (환경 점검용)
    static int sum(int n) {
        long total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("환경 점검: 한글 출력 확인");
        System.out.println("1부터 100000까지의 합 = " + sum(100000));
    }
}
