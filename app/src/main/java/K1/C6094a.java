package k1;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6094a {

    /* renamed from: a, reason: collision with root package name */
    private final String f38485a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f38486b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38487c;

    /* renamed from: d, reason: collision with root package name */
    private volatile long f38488d;

    /* renamed from: e, reason: collision with root package name */
    private volatile long f38489e;

    public C6094a(String str) {
        this(str, false);
    }

    public void a() {
        int decrementAndGet = this.f38486b.decrementAndGet();
        if (decrementAndGet == 0) {
            this.f38489e = SystemClock.uptimeMillis();
        }
        if (this.f38487c) {
            if (decrementAndGet == 0) {
                Log.i("CountingIdlingResource", "Resource: " + this.f38485a + " went idle! (Time spent not idle: " + (this.f38489e - this.f38488d) + ")");
            } else {
                Log.i("CountingIdlingResource", "Resource: " + this.f38485a + " in-use-count decremented to: " + decrementAndGet);
            }
        }
        if (decrementAndGet > -1) {
            return;
        }
        throw new IllegalStateException("Counter has been corrupted! counterVal=" + decrementAndGet);
    }

    public void b() {
        int andIncrement = this.f38486b.getAndIncrement();
        if (andIncrement == 0) {
            this.f38488d = SystemClock.uptimeMillis();
        }
        if (this.f38487c) {
            Log.i("CountingIdlingResource", "Resource: " + this.f38485a + " in-use-count incremented to: " + (andIncrement + 1));
        }
    }

    public C6094a(String str, boolean z7) {
        this.f38486b = new AtomicInteger(0);
        this.f38488d = 0L;
        this.f38489e = 0L;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("resourceName cannot be empty or null!");
        }
        this.f38485a = str;
        this.f38487c = z7;
    }
}
