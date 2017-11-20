
package tyresocvlambda;

import java.util.Vector;

public class TestMyCV {

	public static void main(String[] args) {

		Person p1 = new Person("Julijana Cvetkovska", "Tummelisas Gata 4, 16872 BrommaStockholm", "070 456 8409",
				"julijana@yahoo.com");
		Person p2 = new Person("Ivan Petrushevski", "Pippi longsrum 4, 16758 Knivsta Stockholm", "072 456 8409",
				"ivan@yahoo.com");
		Person p3 = new Person("Moni Karen", "Viulica 6, 16598 Bagermossen, Stockholm", "076 456 8488",
				"karen@yahoo.com");

		MyCv cv1 = new MyCv(p1);
		MyCv cv2 = new MyCv(p2);
		MyCv cv3 = new MyCv(p3);

		cv2.insertGoal("Jag har ingen mål :)");

		cv3.insertGoal("Att köpa din företag. ");

		MyCv[] cvs = new MyCv[] {cv1,cv2,cv3};
		

		for (MyCv cv : cvs) {
			cv.printCv();

	}
    }
}
