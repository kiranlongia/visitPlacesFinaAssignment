package com.example.FavouritePlaces;

import java.util.List;

public interface PlaceService {

    List<Places> getAll();

    void insertAll(Places... places);

    void delete(Places place);

    void update(Places place);
}
