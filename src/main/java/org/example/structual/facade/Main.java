package org.example.structual.facade;

import org.example.structual.facade.logging.authorization.Authorization;
import org.example.structual.facade.caching.Caching;
import org.example.structual.facade.facades.CrossCuttingConcernFacade;
import org.example.structual.facade.logging.Logging;
import org.example.structual.facade.services.ProductManager;

public class Main {
    public static void main(String[] args) {

        CrossCuttingConcernFacade crossCuttingConcernFacade = new CrossCuttingConcernFacade(new Authorization(),new Caching(),new Logging());

        ProductManager productManager = new ProductManager(crossCuttingConcernFacade);
        productManager.save();
    }
}
