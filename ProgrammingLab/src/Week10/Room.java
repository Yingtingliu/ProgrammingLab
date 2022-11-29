package Week10;

public class Room {
	private int row, col;
	public Room(int row, int col) {
		this.row = row;
		this.col = col;
	}
	public int getRow() { return row;}
	public int getCol() { return col;}
	public String toString() {
		return String.format("(%d,%d)",row,col);
	}
	public boolean equals(Object o) {
		if(o instanceof Room) {
			Room r = (Room)o;
			if(row == r.getRow() && col == r.getCol()) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
