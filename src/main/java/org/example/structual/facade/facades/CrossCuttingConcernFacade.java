package org.example.structual.facade.facades;

import org.example.structual.facade.logging.authorization.IAuthorization;
import org.example.structual.facade.caching.ICaching;
import org.example.structual.facade.logging.ILogging;

public class CrossCuttingConcernFacade {
    private IAuthorization authorization;
    private ICaching caching;
    private ILogging logging;


    public CrossCuttingConcernFacade(IAuthorization authorization, ICaching caching, ILogging logging) {
        this.authorization = authorization;
        this.caching = caching;
        this.logging = logging;
    }

    public IAuthorization getAuthorization() {
        return authorization;
    }

    public ICaching getCaching() {
        return caching;
    }

    public ILogging getLogging() {
        return logging;
    }
}
