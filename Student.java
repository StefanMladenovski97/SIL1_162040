class Student {
	String index;
	String firstName;
	String lastName;

	//TODO constructor
	public Student(String i, String fn, String ln){
		index=i;
		firstName=fn;
		lastName=ln;
	}
	List<Integer> labPoints = new ArrayList<Integer>();
	labPoints.add(5);
	labPoints.add(8);
	labPoints.add(6);
	labPoints.add(7);
	labPoints.add(9);

	//TODO seters & getters
	public double getAverage(List<Integer> labPoints) {
		//TODO
		int sum = 0;
      for (int i=0; i< labPoints.size(); i++) {
            sum += i;
      }
      return sum / labPoints.size();
	}

	public boolean hasSignature() {
		//TODO
		if labPoints.size()>8
		{return true;}
		else
		{return false;}
	}
}
