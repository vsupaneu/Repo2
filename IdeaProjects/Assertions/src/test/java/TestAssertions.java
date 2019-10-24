import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestAssertions {

    @Test
    public void assertNumbers() {
        int a = 5;
        int b = 6;
        int c = 5;
        Assert.assertEquals(a, c);
  //      Assert.assertEquals(a, b, "NOOOT EQUAAAALLLL!!!!!!!!!!!");
    }

    @Test
    public void assertStrings() {
        String a = "New String";
        String b = "Old String";
        String c = "New String";
    //    Assert.assertEquals(a, b);
        Assert.assertEquals("Old String", b);
        Assert.assertEquals(a, c);
    //    Assert.assertEquals(a, b, "STRINGS ARE NOT EQUUAAAAAAALLLLLLLLLL!!!!!!!!!!!!!");
    }

    @Test
    public void assertStringPartially() {
        String a = "New String";
        String b = "New";
        String c = "String";
        Assert.assertTrue(a.contains(b));
        Assert.assertTrue(a.contains(c));
    //    Assert.assertTrue(b.contains(c));
    }

    @Test
    public void assertArrays() {
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        Assert.assertEquals(arrayList1, arrayList2);

/*        arrayList2.set(1, 3);
        Assert.assertEquals(arrayList1, arrayList2);*/

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        Assert.assertEquals(array1, array2);

        String[] str1 = {"a", "b", "c"};
        String[] str2 = {"a", "b", "c"};
        Assert.assertEquals(str1, str2);
    }

}
