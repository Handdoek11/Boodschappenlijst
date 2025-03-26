package S;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static AtomicInteger f5011a = new AtomicInteger(0);

    public static final int a() {
        return f5011a.addAndGet(1);
    }
}
