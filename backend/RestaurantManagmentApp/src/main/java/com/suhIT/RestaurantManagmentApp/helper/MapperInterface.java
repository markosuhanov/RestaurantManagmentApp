package com.suhIT.RestaurantManagmentApp.helper;

public interface MapperInterface<Entity, Dto> {

    Entity toEntity(Dto dto);

    Dto toDto(Entity entity);
}
