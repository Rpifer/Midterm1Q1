package People;

public enum eRank {
	Freshman(1),
	Sophomore(2),
	Junior(3),
	Senior(4);
	
	private eRank(final int rank){
		this.rank = rank;
	}
private int rank;
	
	public int getRank(){
		return rank;
	}
}