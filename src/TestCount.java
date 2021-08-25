public class TestCount {

    static int noOfObjects = 0;

    // Instead of performing increment in the constructor
    // instance block is preferred to make this program generic.
    {
        noOfObjects += 1;
    }


    public TestCount() {
    }

    public TestCount(int n) {
    }

    public TestCount(String s) {
    }
}