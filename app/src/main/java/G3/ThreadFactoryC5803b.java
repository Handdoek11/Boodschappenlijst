package g3;

import Z2.r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: g3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ThreadFactoryC5803b implements ThreadFactory {

    /* renamed from: o, reason: collision with root package name */
    private final String f36010o;

    /* renamed from: s, reason: collision with root package name */
    private final ThreadFactory f36011s = Executors.defaultThreadFactory();

    public ThreadFactoryC5803b(String str) {
        r.m(str, "Name must not be null");
        this.f36010o = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f36011s.newThread(new c(runnable, 0));
        newThread.setName(this.f36010o);
        return newThread;
    }
}
