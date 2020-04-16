package lotto;

import lotto.domain.Lotto;
import lotto.domain.LottoSeller;
import lotto.ui.InputView;
import lotto.ui.ResultView;

import java.util.List;

public class LottoGameApplication {

    public static void main(String[] args) {
        int money = InputView.inputMoney();
        int buyCount = money / 1000;
        ResultView.printBuyCount(buyCount);

        List<Lotto> lottos = LottoSeller.buy(buyCount);
        ResultView.printLottos(lottos);

        String winningLottoNumbers = InputView.inputWinningLottoNumbers();
        // TODO: strings to lotto number
        List<Lotto> results = LottoSeller.match(lottos, winningLottoNumbers);
        ResultView.printResults(results);
    }

}
