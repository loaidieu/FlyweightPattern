
public class Driver {

	public static void main(String[] args) {
		TreeFactory factory = new TreeFactory();
		for(int i = 0; i <10; i++) {
			ITreeFlyweight oak = factory.getTree("oak", "black", "rough");
			System.out.println(System.identityHashCode(oak));
			oak.display(i, i*2);
			
			ITreeFlyweight pine = factory.getTree("pine", "white", "smooth");
			System.out.println(System.identityHashCode(pine));
			pine.display(i, i * 2);
		}
	}

}
