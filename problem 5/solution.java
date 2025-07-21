class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[3];

        // Read 3 names
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextLine();
        }

        // Sort names in dictionary order
        Arrays.sort(arr);

        // Print sorted names
        for (String name : arr) {
            System.out.println(name);
        }
    }
}
