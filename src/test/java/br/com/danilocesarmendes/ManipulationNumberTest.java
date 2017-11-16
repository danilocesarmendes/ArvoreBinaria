package br.com.danilocesarmendes;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import br.com.danilocesarmendes.s2it.ManipulationNumber;

/**
 * 
 * @author Danilo Mendes
 */
public class ManipulationNumberTest {

    @Test
    public void testNumberNegative() {
        Integer desvendarNumero = ManipulationNumber.gerarC(10256, 512);
        Assertions.assertThat(desvendarNumero).isEqualTo(-1);
    }

    @Test
    public void compareValues1() {
        Integer desvendarNumero = ManipulationNumber.gerarC(43, 79);
        Assertions.assertThat(desvendarNumero).isEqualTo(4739);
    }

    @Test
    public void compareValues2() {
        Integer desvendarNumero = ManipulationNumber.gerarC(43, 793);
        Assertions.assertThat(desvendarNumero).isEqualTo(47393);
    }

}
