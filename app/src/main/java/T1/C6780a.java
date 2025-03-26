package t1;

import android.os.Handler;
import android.os.Looper;
import s1.q;

/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6780a implements q {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f43789a = v0.h.a(Looper.getMainLooper());

    @Override // s1.q
    public void a(long j8, Runnable runnable) {
        this.f43789a.postDelayed(runnable, j8);
    }

    @Override // s1.q
    public void b(Runnable runnable) {
        this.f43789a.removeCallbacks(runnable);
    }
}
