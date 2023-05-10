package org.example.behavorial.chain.of.responsibilty;

public abstract class MiddleWare {
    private MiddleWare next;

    public static MiddleWare link(MiddleWare first, MiddleWare... chain)
    {
        MiddleWare head = first;
        for(MiddleWare nextInChain : chain)
        {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password){
        if(next==null)
            return true;
        return next.check(email,password);
    }
}
