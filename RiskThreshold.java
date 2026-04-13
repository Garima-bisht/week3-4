public class RiskThreshold {

    static int floor(int[] arr, int target) {
        int res = -1;
        for (int x : arr)
            if (x <= target) res = x;
        return res;
    }

    static int ceiling(int[] arr, int target) {
        for (int x : arr)
            if (x >= target) return x;
        return -1;
    }

    static int binaryInsert(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 50, 100};

        System.out.println("Floor: " + floor(arr, 30));
        System.out.println("Ceiling: " + ceiling(arr, 30));
        System.out.println("Insert Pos: " + binaryInsert(arr, 30));
    }
}
