public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int n = m.length;

        if (i == j)
            return 0;

        int[] distances = new int[n];

        for (int k = 0; k < n; k++)
            distances[k] = -1;

        distances[i] = 0;

        for (int step = 0; step < n - 1; step++) {
            boolean changed = false;

            for (int from = 0; from < n; from++) {
                if (distances[from] == -1)
                    continue;

                for (int to = 0; to < n; to++) {
                    if (m[from][to] == 1) {
                        int newDistance = distances[from] + 1;

                        if (distances[to] == -1 || newDistance < distances[to]) {
                            distances[to] = newDistance;
                            changed = true;
                        }
                    }
                }
            }

            if (!changed)
                break;
        }

        return distances[j];
    }

    public static void main(String[] args) {
        System.out.println(
                findShortestPath(new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }, 0, 1)); // -1
        System.out.println(
                findShortestPath(new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }, 1, 1)); // 0
        System.out.println(
                findShortestPath(new int[][] { { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 }, { 1, 0, 0, 0 } }, 0, 2)); // 2
        System.out.println(
                findShortestPath(new int[][] { { 0, 1, 0, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 } }, 0, 2)); // 2
    }
}