package com.example.mediator.core;

public interface Mediator {
    <TResponse> TResponse send(Request<TResponse> request);
}
