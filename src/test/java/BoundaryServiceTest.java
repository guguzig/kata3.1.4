import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.BoundaryService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BoundaryServiceTest {
    @Test
    @DisplayName("Минимальное значение для положительных чисел")
    public void testFindMinWithPositiveNumbers() {
        int[] marks = {10, 5, 8, 3, 7};
        BoundaryService boundaryService = new BoundaryService();
        int result = boundaryService.findMin(marks);
        int expected = 3;
        assertEquals(expected, result);
    }
}
