package org.jug.algeria.controller;

import org.jug.algeria.domain.*;
import org.jug.algeria.repository.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class HomeController {

    @Inject
    EvenementRepository evenementRepository;

    @RequestMapping(value = "/evenement/{nomEvt}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Evenement create(@PathVariable String nomEvt) {
        return evenementRepository.save(new Evenement(nomEvt));
    }

    @RequestMapping(value = "/evenement", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Evenement> findAll() {
        final List<Evenement> resultList = new ArrayList<>();
        final Iterable<Evenement> all = evenementRepository.findAll();
        all.forEach(new Consumer<Evenement>() {
            @Override
            public void accept(Evenement evenement) {
                resultList.add(evenement);
            }
        });
        return resultList;
    }

}
