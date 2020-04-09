package com.menos.framework;

import io.vavr.Function2;
import java.util.function.Function;

public class Serialization<T> {

    private Function<byte[], T> serializeFun;

    private Function2<byte[], String, T> deserializerFun;

    public Serialization(Function<byte[], T> serializeFun, Function2<byte[], String, T> deserializerFun) {
        this.serializeFun = serializeFun;
        this.deserializerFun = deserializerFun;
    }

    public Function<byte[], T> getSerializeFun() {
        return serializeFun;
    }

    public void setSerializeFun(Function<byte[], T> serializeFun) {
        this.serializeFun = serializeFun;
    }

    public Function2<byte[], String, T> getDeserializerFun() {
        return deserializerFun;
    }

    public void setDeserializerFun(Function2<byte[], String, T> deserializerFun) {
        this.deserializerFun = deserializerFun;
    }
}
