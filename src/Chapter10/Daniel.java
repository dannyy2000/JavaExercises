package Chapter10;

public class Daniel extends Akinsanya {
//    @Override
//    public String toString() {
//        return "Daniel{" +
//                "name='" + name + '\'' +
//                ", height=" + height +
//                "pray" + pray() +
//                '}';
//    }

    private String name;
    private int height;

    @Override
    public void pray() {
        System.out.println("i dont pray");
//        return pray();
    }
}
