import java.util.*;

class Player {
    private int id;
    private String country;
    private String side;
    private double price;

    public Player(int id, String country, String side, double price) {
        this.id = id;
        this.country = country;
        this.side = side;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getSide() {
        return side;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Player p[] = new Player[4];

        // Read 4 Player objects
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine(); // consume newline
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            sc.nextLine(); // consume newline
            p[i] = new Player(a, b, c, d);
        }

        // Read search parameter
        String s = sc.nextLine();

        // Call searchPlayerForMatch
        Player arr[] = searchPlayerForMatch(p, s);

        if (arr != null && arr.length > 0) {
            // Sort IDs in ascending order
            Arrays.sort(arr, Comparator.comparingInt(Player::getId));

            // Print IDs
            for (Player player : arr) {
                System.out.println(player.getId());
            }
        } else {
            System.out.println("no such player");
        }
    }

    public static Player[] searchPlayerForMatch(Player p[], String s) {
        List<Player> result = new ArrayList<>();
        for (Player k : p) {
            if (k.getSide().equalsIgnoreCase(s)) {
                result.add(k);
            }
        }
        return result.toArray(new Player[0]);
    }
}
