import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.BoundaryService;
import org.junit.jupiter.api.Test;

public class BoundaryServiceTest {

    @Test
    public void testFindMinWithSingleNumber() {
        int[] marks = {10};
        BoundaryService boundaryService = new BoundaryService();
        int result = boundaryService.findMin(marks);
        assertEquals(10, result);
    }

    @Test
    public void testFindMinWithPositiveNumbers() {
        int[] marks = {-10, -5, -8, -3, -7};
        BoundaryService boundaryService = new BoundaryService();
        int result = boundaryService.findMin(marks);
        assertEquals(3, result);
    }
}