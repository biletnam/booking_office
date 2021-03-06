package com.github.dmitriylamzin.client.web;


import com.github.dmitriylamzin.domain.Seat;
import com.github.dmitriylamzin.service.TheatreBoxRemote;

import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Dmitriy_Lamzin on 6/6/2017.
 */
@Model
public class Info {

    @Inject
    private TheatreBoxRemote box;

    @Produces
    @Named
    public Collection<Seat> getSeats() {
        return new ArrayList<>(box.getSeats());
    }

}
