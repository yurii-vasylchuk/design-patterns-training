package org.yvasylchuk.t2_singleton;

import java.util.Random;

public class Singleton {
    private int test = new Random().nextInt();

    public int getTest() {
        return test;
    }
}
