package o6;

import a6.j;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class e extends a6.j {

    /* renamed from: d, reason: collision with root package name */
    private static final g f40012d = new g("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: c, reason: collision with root package name */
    final ThreadFactory f40013c;

    public e() {
        this(f40012d);
    }

    @Override // a6.j
    public j.c b() {
        return new f(this.f40013c);
    }

    public e(ThreadFactory threadFactory) {
        this.f40013c = threadFactory;
    }
}
