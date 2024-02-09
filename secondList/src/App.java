public class App {
    public static void main(String[] args) throws Exception {
        // FstExercise t1 = new FstExercise(8, 40, 15);
        // FstExercise t2 = new FstExercise(8);
        // FstExercise t3 = new FstExercise(8, 40);

        // FstExercise t4 = new FstExercise(t1);

        // System.out.println("Time (hh:mm:ss): 0"+t4.getHours()+":"+t4.getMinutes()+":"+t4.getSeconds());
        // System.out.println("Time (hh:mm:00): 0"+t3.getHours()+":"+t3.getMinutes()+":0"+t3.getSeconds());
        // System.out.println("Time (hh:00:00): 0"+t2.getHours()+":0"+t2.getMinutes()+":0"+t2.getSeconds());

        // SndExercise t1 = new SndExercise();
        // SndExercise t2 = new SndExercise(9.8, 6.6);

        // System.out.println("Coord 1, first dot: "+t1.getFstCoord());
        // System.out.println("Coord 2, first dot: "+t1.getSndCoord());

        // System.out.println("Coord 1, second dot: "+t2.getFstCoord());
        // System.out.println("Coord 2, second dot: "+t2.getSndCoord());
        
        // System.out.println(t1.calcDistance(t2));

        // ThdExercise account1 = new ThdExercise("Lucas Jabur", 1111, 123456789, "special");
        // ThdExercise account2 = new ThdExercise("Lucas Cardoso", 12312, 123654987, 100000 ,"special");
        // account1.showData();
        // System.out.println();
        // account2.showData();

        FrthExercise triangle1 = new FrthExercise(12, 8, 7);
        
        boolean exist = triangle1.existTriangle();
        System.out.println(exist);
        System.out.println("First side: "+triangle1.getFirstSide());
        System.out.println("Second side: "+triangle1.getSecondSide());
        System.out.println("Third side: "+triangle1.getThirdSide());

        double perimeter = triangle1.perTriangle();
        System.out.println("Perimeter: "+perimeter);


    }
}
