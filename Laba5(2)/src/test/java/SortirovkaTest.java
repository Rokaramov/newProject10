/*import static org.junit.Assert.*;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SortirovkaTest {

    Sortirovka sort = new Sortirovka();



    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

        System.out.println("Приступаю к тестированию...");

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {

        System.out.println("Тестирование окончено.");

    }

    @Test
    public void test() {

        boolean check = false;

        int[] testArray;
        testArray = new int[5];
        testArray[0] = 2;
        testArray[1] = 1;
        testArray[2] = 5;
        testArray[3] = 3;
        testArray[4] = 5;

        Sortirovka.bubbleSort(testArray);
        for (int i = 0; i < 4; i++) {
            if (testArray[i] < testArray[i+1]) {
                check = true;
            } else  {
                check = true;
            }
        }
        assertTrue(check);
    }
} */
