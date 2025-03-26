package o6;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class g extends AtomicLong implements ThreadFactory {

    /* renamed from: o, reason: collision with root package name */
    final String f40016o;

    /* renamed from: s, reason: collision with root package name */
    final int f40017s;

    /* renamed from: t, reason: collision with root package name */
    final boolean f40018t;

    static final class a extends Thread {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public g(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f40016o + '-' + incrementAndGet();
        Thread aVar = this.f40018t ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f40017s);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f40016o + "]";
    }

    public g(String str, int i8) {
        this(str, i8, false);
    }

    public g(String str, int i8, boolean z7) {
        this.f40016o = str;
        this.f40017s = i8;
        this.f40018t = z7;
    }
}
