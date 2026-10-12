
import java.util.*;

public class onepunch {

    static class Position {
        int x, y;
        boolean usedPunch;

        public Position(int x, int y, boolean usedPunch) {
            this.x = x;
            this.y = y;
            this.usedPunch = usedPunch;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.nextLine(); 

        
        char[][] maze = new char[n][m];
        for (int i = 0; i < n; i++) {
            maze[i] = scanner.nextLine().toCharArray();
        }

        
        for (int i = 0; i < q; i++) {
            int startX = scanner.nextInt() - 1;
            int startY = scanner.nextInt() - 1;
            int endX = scanner.nextInt() - 1;
            int endY = scanner.nextInt() - 1;
            int canPunch = scanner.nextInt();
            scanner.nextLine(); 

            if (canReach(maze, n, m, startX, startY, endX, endY, canPunch == 1)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        scanner.close();
    }

    
    private static boolean isWithinBounds(int x, int y, int n, int m) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    
    private static boolean canReach(char[][] maze, int n, int m, int startX, int startY, int endX, int endY, boolean canPunch) {
        Queue<Position> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(new Position(startX, startY, false));
        visited.add(startX + "," + startY + ",false");

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!queue.isEmpty()) {
            Position current = queue.poll();

            
            if (current.x == endX && current.y == endY) {
                return true;
            }

            
            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                
                if (isWithinBounds(nx, ny, n, m) && maze[nx][ny] == '.' && !visited.contains(nx + "," + ny + "," + current.usedPunch)) {
                    queue.add(new Position(nx, ny, current.usedPunch));
                    visited.add(nx + "," + ny + "," + current.usedPunch);
                }

                
                if (canPunch && !current.usedPunch && isWithinBounds(nx, ny, n, m) && maze[nx][ny] == '#' && !visited.contains(nx + "," + ny + ",true")) {
                    queue.add(new Position(nx, ny, true));
                    visited.add(nx + "," + ny + ",true");
                }
            }
        }

        
        return false;
    }
}