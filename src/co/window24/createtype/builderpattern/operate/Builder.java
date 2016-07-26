package co.window24.createtype.builderpattern.operate;

import co.window24.createtype.builderpattern.builder.Sender;
import co.window24.createtype.builderpattern.builder.impl.MailSender;
import co.window24.createtype.builderpattern.builder.impl.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanfei on 7/13/16.
 */
public class Builder {

    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count) {

        for (int i = 0; i < count; i++) {

            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {

        for (int i = 0; i < count; i++) {

            list.add(new SmsSender());
        }
    }
}