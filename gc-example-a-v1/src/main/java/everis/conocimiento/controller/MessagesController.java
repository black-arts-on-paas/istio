package everis.conocimiento.controller;

import everis.conocimiento.model.Color;
import everis.conocimiento.service.serviceImpl.ColorsImpl;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.reactivex.Flowable;

@Controller("/messages")
public class MessagesController {

    private final MessagesImpl service;

    public MessagesController(MessagesImpl service) {
        this.service = service;
    }

    @Get("/")
    @Produces(MediaType.APPLICATION_JSON_STREAM)
    public Flowable<Message> getMessages(){
        return service.getMessages();
    }
}
