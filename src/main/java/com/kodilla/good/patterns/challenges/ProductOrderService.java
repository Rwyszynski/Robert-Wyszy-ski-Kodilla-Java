package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private HelpService helpService;
    private SellService sellService;
    private SellRepository sellRepository;
    public ProductOrderService(final HelpService helpService,
                           final SellService sellService,
                           final SellRepository sellRepository) {
        this.helpService = helpService;
        this.sellService = sellService;
        this.sellRepository = sellRepository;
    }
    public BuyBy process(final BuyProduct buyProduct) {
        boolean isBought = sellService.rent(buyProduct.getUser(), buyProduct.getFrom(),
                buyProduct.getTo());
        if (isBought) {
            helpService.inform(buyProduct.getUser());
            sellRepository.createBuy(buyProduct.getUser(), buyProduct.getFrom(), buyProduct.getTo());
            return new BuyBy(buyProduct.getUser(), true);
        } else {
            return new BuyBy(buyProduct.getUser(), false);
        }
    }
}
