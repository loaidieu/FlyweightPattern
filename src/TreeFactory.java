import java.util.HashMap;

public class TreeFactory {
	private HashMap<String, ITreeFlyweight> map = new HashMap<>();
	
	public ITreeFlyweight getTree(String type, String color, String texture) {
		ITreeFlyweight tree = map.get(type + "-" + color + "-" + texture);
		if(tree == null)
		{
			tree = new Tree(type, color, texture);
			map.put(type + "-" + color + "-" + texture, tree);
		}
		return tree;
	}
}
