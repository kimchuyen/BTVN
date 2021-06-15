import static org.assertj.core.api.Java6Assertions.withinPercentage;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.withPrecision;
import org.assertj.core.api.AbstractDoubleAssert;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.*;
import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;
public class test {
    @DisplayName("test1")
    @Test
    public void bai1()
    {
        String str = "You Only Live Once. But if You do it right. one is Enough";
        assertThat(str).isNotEmpty().hasSize(41).isNotNull();
    }
}
