package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class OI0 {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f17868a = new CopyOnWriteArrayList();

    public final void a(Handler handler, PI0 pi0) {
        c(pi0);
        this.f17868a.add(new NI0(handler, pi0));
    }

    public final void b(final int i8, final long j8, final long j9) {
        Iterator it = this.f17868a.iterator();
        while (it.hasNext()) {
            final NI0 ni0 = (NI0) it.next();
            if (!ni0.f17502c) {
                ni0.f17500a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.MI0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ni0.f17501b.z(i8, j8, j9);
                    }
                });
            }
        }
    }

    public final void c(PI0 pi0) {
        Iterator it = this.f17868a.iterator();
        while (it.hasNext()) {
            NI0 ni0 = (NI0) it.next();
            if (ni0.f17501b == pi0) {
                ni0.c();
                this.f17868a.remove(ni0);
            }
        }
    }
}
