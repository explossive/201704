package ru.otus.main.dbService.messages;

import ru.otus.main.dbService.FrontendService;
import ru.otus.main.front.MsgToFrontend;
import ru.otus.main.base.dataSets.User;
import ru.otus.main.messageSystem.Address;

public class MsgSaveUserAnswer extends MsgToFrontend {
    private final User user;

    public MsgSaveUserAnswer(Address from, Address to, User user) {
        super(from, to);
        this.user = user;
    }

    @Override
    public void exec(FrontendService frontendService) {
    }
}
