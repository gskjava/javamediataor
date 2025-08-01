package com.example.mediator.core;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SimpleMediator implements Mediator {

    private final ApplicationContext context;

    public SimpleMediator(ApplicationContext context) {
        this.context = context;
    }

    @SuppressWarnings("unchecked")
    public <TResponse> TResponse send(Request<TResponse> request) {
        String handlerName = request.getClass().getSimpleName() + "Handler";
        handlerName = Character.toLowerCase(handlerName.charAt(0)) + handlerName.substring(1);
        RequestHandler<Request<TResponse>, TResponse> handler =
            (RequestHandler<Request<TResponse>, TResponse>) context.getBean(handlerName);
        return handler.handle(request);
    }
}
