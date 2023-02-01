package Week10;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Maze {
	/*
	 * Class to represent a maze
	 * maze is stored as a 2D char array
	 * one position is labeled 'S' (start)
	 * one position is labeled 'F' (finish)
	 * other positions are either 0 (room) or X (wall)
	 * Here is an example (co-ordinates are just for illustration):
	 * 
	 * 		0 1 2 3 4 5 6
	 * 
	 *  0	X X X X 0 X X 
		1	X 0 0 0 0 X X 
		2	X 0 X 0 0 X 0 
		3	X 0 0 X 0 0 0 
		4	S 0 X X 0 X 0 
		5	X 0 X X X 0 0 
		6	X 0 X F 0 0 X 
	 * 
	 * In this example, start is at (4,0)
	 * and finish is at (6,3)
	 * 
	 */
	private int nRow,nCol;
	private char[][] mazeArray;
	private Room start;
	private Room finish;
	public Maze(String fileName) {
		loadFromFile(fileName);
	}
	// maze is initialised from a file (see example provided)
	private void loadFromFile(String fileName) {
		FileReader f = null;
		try {
			f = new FileReader(fileName);
			Scanner s = new Scanner(f);
			String[] topline = s.nextLine().split(" ");
			nRow = Integer.parseInt(topline[0]);
			nCol = Integer.parseInt(topline[1]);
			System.out.println(String.format("Size = %d,%d",nRow,nCol));
			
			mazeArray = new char[nRow][nCol];
			for(int r=0;r<nRow;r++) {
				String[] tokens = s.nextLine().split(" ");
				for(int c=0;c<nCol;c++) {
					mazeArray[r][c] = tokens[c].charAt(0);
				}
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(f!=null) {
				try {
					f.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		start = findFirst('S');
		finish = findFirst('F');
	}
	/*
	 * method to find the first instance
	 * of a particular character in the maze
	 * (used to find the start and finish position)
	 * See Room class for details of how a Room is stored
	 */
	private Room findFirst(char c) {
		for(int i=0;i<nRow;i++) {
			for(int j=0;j<nCol;j++) {
				if(mazeArray[i][j] == c) {
					return new Room(i,j);
				}
			}
		}
		return null;
	}
	
	// Set a position to have been visited
	private void setVisited(Room r) {
		mazeArray[r.getRow()][r.getCol()] = '1';
	}
	
	/*
	 *  Method called to find the way out 
	 */
	public ArrayList<Room> solve() {
		return search(start);
	}
	
	/*
	 * Recursive search method
	 */
	public ArrayList<Room> search(Room room) {
		if(room.equals(finish)) {
			ArrayList<Room> a = new ArrayList<Room>();
			a.add(room);
			return a;
		}
		setVisited(room);
		ArrayList<Room> toVisit = getUnvisitedFromRoom(room);
		for(Room r: toVisit) {
			ArrayList<Room> a = search(r);
			if(a != null) {
				a.add(room);
				return a;
			}
		}
		return null;
	}
	
	/*
	 * method to find the neighbours of a room
	 * neighbours are just the ones above and 
	 * below, and left and right
	 * (i.e. no diagonal moves)
	 */
	private ArrayList<Room> getNeighbours(Room room) {
		ArrayList<Room> neighbours = new ArrayList<Room>();
		int row = room.getRow();
		int col = room.getCol();
		for(int x=row-1;x<=row+1;x+=2) {
			if(x>=0 && x<nCol) {
				neighbours.add(new Room(x,col));
			}
		}
		for(int y=col-1;y<=col+1;y+=2) {
			if(y>=0 && y<nRow) {
				neighbours.add(new Room(row,y));
			}
		}
		return neighbours;
		
	}
	/*
	 * Make a list of the unvisited rooms from a particular room
	 */
	private ArrayList<Room> getUnvisitedFromRoom(Room room) {
		ArrayList<Room> neighbours = getNeighbours(room);
		ArrayList<Room> exits = new ArrayList<Room>();
		for(Room r: neighbours) {
			char temp = mazeArray[r.getRow()][r.getCol()];
			if(temp == 'F' || temp == '0') {
				exits.add(r);
			}
		}
		return exits;
	}
	
	
	// Make a nice string of the maze
	public String toString() {
		String output = "\n";
		for(char[] a: mazeArray) {
			for(char b: a) {
				output += "" + b + " ";
			}
			output += "\n";
		}
		return output;
	}
	/*
	 * Example main
	 * Change the file path!
	 */
	public static void main(String[] args) {
		Maze m = new Maze("/Users/simon/maze.txt");
		System.out.println(m);
		
		ArrayList<Room> r = m.solve();
		System.out.println("Route from finish back to start...");
		for(Room a: r) {
			System.out.println(a);
		}
	}
}
