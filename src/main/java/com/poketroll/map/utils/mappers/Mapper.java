package com.poketroll.map.utils.mappers;

public interface Mapper<I, O> {

  O map(I input);
}
