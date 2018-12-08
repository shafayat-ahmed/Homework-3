
public class Student extends Teacher {
	//Inheritance
	public void konwledge() {
		System.out.println("Students say = So much memorization");
	}
		//Polymorphism
		public int subjectsPerClass (int a, int b) {  //How many subjects in 2 class
			int total=((a+b)+1);
			return total;
	}

}
