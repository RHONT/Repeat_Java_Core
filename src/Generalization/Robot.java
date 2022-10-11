package Generalization;

import Generalization.Base.BodyWork;
import Generalization.Base.HeadWork;

public class Robot<T1 extends HeadWork<HeadWork>,T2 extends BodyWork> {
    T1 head;
    T2 body;

    public Robot(T1 head, T2 body) {
        this.head = head;
        this.body = body;
    }

    public T1 getHead() {
        return head;
    }

    public T2 getBody() {
        return body;
    }
}
