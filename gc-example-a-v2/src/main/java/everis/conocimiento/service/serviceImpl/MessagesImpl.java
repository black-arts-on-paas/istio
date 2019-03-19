package everis.conocimiento.service.serviceImpl;

import everis.conocimiento.model.Message;
import io.reactivex.Flowable;

import javax.inject.Singleton;


@Singleton
public class MessagesImpl {

    public Flowable<Message> getMessages() {
        return Flowable.just(new Message("2","This message is the response for a request from MAC OS"));
    }
}
