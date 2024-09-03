
public class Tree implements ITreeFlyweight{
	private final String type;
	private final String color;
	private final String texture;
	
	public Tree(String type, String color, String texture)
	{
		this.type = type;
		this.color = color;
		this.texture = texture;
	}
	
	@Override
	public void display(int x, int y) {
		System.out.println(type + " " + color + " " + texture + " at (" + x + ", " + y);
	}
	

}
