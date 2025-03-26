package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class SP {

    /* renamed from: e, reason: collision with root package name */
    private static SP f18895e;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f18896a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f18897b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Object f18898c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private int f18899d = 0;

    private SP(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new RO(this, null), intentFilter);
    }

    public static synchronized SP b(Context context) {
        SP sp;
        synchronized (SP.class) {
            try {
                if (f18895e == null) {
                    f18895e = new SP(context);
                }
                sp = f18895e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sp;
    }

    static /* synthetic */ void c(SP sp, int i8) {
        synchronized (sp.f18898c) {
            try {
                if (sp.f18899d == i8) {
                    return;
                }
                sp.f18899d = i8;
                Iterator it = sp.f18897b.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    SI0 si0 = (SI0) weakReference.get();
                    if (si0 != null) {
                        si0.f18863a.j(i8);
                    } else {
                        sp.f18897b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int a() {
        int i8;
        synchronized (this.f18898c) {
            i8 = this.f18899d;
        }
        return i8;
    }

    public final void d(final SI0 si0) {
        Iterator it = this.f18897b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.f18897b.remove(weakReference);
            }
        }
        this.f18897b.add(new WeakReference(si0));
        this.f18896a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.LN
            @Override // java.lang.Runnable
            public final void run() {
                si0.f18863a.j(this.f16821o.a());
            }
        });
    }
}
