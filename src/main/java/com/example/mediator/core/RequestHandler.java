package com.example.mediator.core;

public interface RequestHandler<TRequest extends Request<TResponse>, TResponse> {
    TResponse handle(TRequest request);
}
