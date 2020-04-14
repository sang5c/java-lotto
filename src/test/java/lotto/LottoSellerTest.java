package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LottoSellerTest {

    @DisplayName("n천원으로 n장 구매")
    @ParameterizedTest
    @CsvSource({"1000,1", "1500,1", "2000,2"})
    public void buyLotto(int money, int expected) {
        List<Lotto> lottos = LottoSeller.buy(money);
        assertThat(lottos.size()).isEqualTo(expected);
    }
}