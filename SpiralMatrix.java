import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		int rowCount = a.size();
		int columnCount = a.get(0).size();

		int t = 0;
		int b = rowCount - 1;
		int l = 0;
		int r = columnCount - 1;

		int direction = 0;
		// 0 for left to right
		// 1 for top to bottom
		// 2 for right to left
		// 3 for bottom to top

		while (t <= b && l <= r) {
			if (direction == 0) {
				for (int i = l; i <= r; i++) {
					result.add(a.get(t).get(i));
				}
				direction = 1;
				t++;
			} else if (direction == 1) {
				for (int i = t; i <= b; i++) {
					result.add(a.get(i).get(r));
				}
				direction = 2;
				r--;
			} else if (direction == 2) {
				for (int i = r; i >= l; i--) {
					result.add(a.get(b).get(i));
				}
				direction = 3;
				b--;
			} else if (direction == 3) {
				for (int i = b; i >= t; i--) {
					result.add(a.get(i).get(l));
				}
				direction = 0;
				l++;
			}

		}

		return result;
	}
}
