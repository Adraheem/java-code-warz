import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOutlierTest {
    private ArrayOutlier array;

    @BeforeEach
    void setUp(){
        array = new ArrayOutlier();
    }

    @Test
    void canTakeInArray(){
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        nums.add(10);
        assertEquals(3, ArrayOutlier.detect(nums));
    }

}