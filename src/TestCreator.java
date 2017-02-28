import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class TestCreator {
    public static void main(String[] args) throws Exception {
        //forAlgEx65(447);
        //forAlgEx571(10000);
        //forAlgEx571Rand();
        //forAlgEx56Increase(100000);
        //forAlgEx56Rand(10);
        //forAlgEx56FullRand();
        //randomTree(50, 100);
        randomTree(40);
        //randomDomino(50000);
    }

    private static void randomTree(int vertexNum, int maxValue) throws Exception {
        FileWriter writer = new FileWriter("tst.in");
        Random rand = new Random();
        for(int i = 0; i < vertexNum; i++) {
            writer.write(rand.nextInt(maxValue) + "\n");
        }
        writer.close();
    }

    private static void randomTree(int vertexNum) throws Exception {
        FileWriter writer = new FileWriter("tst.in");
        Random rand = new Random();
        Set<Integer> set = new LinkedHashSet<>();
        Iterator<Integer> iter;
        while (set.size() != vertexNum) {
            set.add(rand.nextInt(vertexNum) + 1);
        }
        iter = set.iterator();
        while (iter.hasNext()) {
            writer.write(iter.next() + "\n");
        }
        writer.close();
    }

    private static void randomDomino(int dominoNum) throws Exception {
        FileWriter writer = new FileWriter("in.txt");
        Random rand = new Random();
        writer.write(dominoNum + "\n");
        for (int i = 0; i < dominoNum; i++) {
            writer.write((rand.nextInt(6) + 1) + " ");
            writer.write((rand.nextInt(6) + 1) + "\n");
        }
        writer.close();
    }

    private static void forAlgEx65(int vertexNum) throws Exception {
        FileWriter writer = new FileWriter("input.txt");
        writer.write(vertexNum + " ");
        writer.write(vertexNum * (vertexNum - 1) / 2 + " \n");
        for (int i = 1; i <= vertexNum; i++) {
            for (int j = i + 1; j <= vertexNum; j++) {
                writer.write(i + " ");
                writer.write(j + "\n");
            }
        }
        writer.close();
    }

    private static void forAlgEx571(int n) throws Exception {
        FileWriter writer = new FileWriter("input.txt");
        Random rand = new Random();
        int maxKeyValue = (int)Math.pow(10, 9);
        int m = rand.nextInt(10001 - n) + n;
        int c = rand.nextInt(m - 2) + 1;
        while (!isRelativelyPrime(m, c)) {
            c = rand.nextInt(m - 2) + 1;
        }
        writer.write(m + " ");
        writer.write(c + " ");
        writer.write(n + "\n");
        for (int i = 0; i < n; i++) {
            writer.write(rand.nextInt(maxKeyValue + 1) + "\n");
        }
        writer.close();
    }

    private static void forAlgEx571Rand() throws Exception {
        FileWriter writer = new FileWriter("input.txt");
        Random rand = new Random();
        int n = rand.nextInt(10001);
        int maxKeyValue = (int)Math.pow(10, 9);
        int m = rand.nextInt(10001 - n) + n;
        int c = rand.nextInt(m - 2) + 1;
        while (!isRelativelyPrime(m, c)) {
            c = rand.nextInt(m - 2) + 1;
        }
        writer.write(m + " ");
        writer.write(c + " ");
        writer.write(n + "\n");
        for (int i = 0; i < n; i++) {
            writer.write(rand.nextInt(maxKeyValue + 1) + "\n");
        }
        writer.close();
    }

    private static void forAlgEx56Increase(int n) throws Exception {
        FileWriter writer = new FileWriter("input.txt");
        writer.write(n + "\n");
        for(int i = 0; i < n; i++){
            writer.write(i + " ");
        }
        writer.close();
    }

    private static void forAlgEx56Rand(int n) throws Exception {
        FileWriter writer = new FileWriter("input.txt");
        int max = (int)Math.pow(10, 9);
        Random rand = new Random();
        writer.write(n + "\n");
        for(int i = 0; i < n; i++){
            writer.write((rand.nextInt(2 * max + 1) - max) + " ");
        }
        writer.close();
    }

    private static void forAlgEx56FullRand() throws Exception {
        FileWriter writer = new FileWriter("input.txt");
        Random rand = new Random();
        int max = (int)Math.pow(10, 9);
        int n = rand.nextInt(100000) + 1;
        writer.write(n + "\n");
        for(int i = 0; i < n; i++){
            writer.write((rand.nextInt(2 * max + 1) - max) + " ");
        }
        writer.close();
    }

    private static boolean isRelativelyPrime(int a, int b) {
        if (algEuclid(a, b) != 1) {
            return false;
        } else {
            return true;
        }
    }

    private static int algEuclid(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return algEuclid(b, a % b);
        }
    }

    private static int factorial(int num) {
        if (num != 0) {
            num *= factorial(num - 1);
        } else {
            return 1;
        }
        return num;
    }
}
