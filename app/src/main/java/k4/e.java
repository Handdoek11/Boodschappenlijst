package K4;

import com.google.firebase.installations.h;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class e {

    /* renamed from: d, reason: collision with root package name */
    private static final long f3647d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    private static final long f3648e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final h f3649a = h.c();

    /* renamed from: b, reason: collision with root package name */
    private long f3650b;

    /* renamed from: c, reason: collision with root package name */
    private int f3651c;

    e() {
    }

    private synchronized long a(int i8) {
        if (c(i8)) {
            return (long) Math.min(Math.pow(2.0d, this.f3651c) + this.f3649a.e(), f3648e);
        }
        return f3647d;
    }

    private static boolean c(int i8) {
        return i8 == 429 || (i8 >= 500 && i8 < 600);
    }

    private static boolean d(int i8) {
        return (i8 >= 200 && i8 < 300) || i8 == 401 || i8 == 404;
    }

    private synchronized void e() {
        this.f3651c = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f3651c     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            com.google.firebase.installations.h r0 = r4.f3649a     // Catch: java.lang.Throwable -> L14
            long r0 = r0.a()     // Catch: java.lang.Throwable -> L14
            long r2 = r4.f3650b     // Catch: java.lang.Throwable -> L14
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L12
            goto L16
        L12:
            r0 = 0
            goto L17
        L14:
            r0 = move-exception
            goto L19
        L16:
            r0 = 1
        L17:
            monitor-exit(r4)
            return r0
        L19:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K4.e.b():boolean");
    }

    public synchronized void f(int i8) {
        if (d(i8)) {
            e();
            return;
        }
        this.f3651c++;
        this.f3650b = this.f3649a.a() + a(i8);
    }
}
