package j2;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: j2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC6061j {
    static Executor a() {
        return new ExecutorC6065n(Executors.newSingleThreadExecutor());
    }
}
