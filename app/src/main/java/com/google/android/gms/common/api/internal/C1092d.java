package com.google.android.gms.common.api.internal;

import android.os.Looper;
import g3.ExecutorC5802a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1092d {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f13309a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f13310b;

    /* renamed from: c, reason: collision with root package name */
    private volatile a f13311c;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f13312a;

        /* renamed from: b, reason: collision with root package name */
        private final String f13313b;

        a(Object obj, String str) {
            this.f13312a = obj;
            this.f13313b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f13312a == aVar.f13312a && this.f13313b.equals(aVar.f13313b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f13312a) * 31) + this.f13313b.hashCode();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.d$b */
    public interface b {
        void a(Object obj);

        void b();
    }

    C1092d(Looper looper, Object obj, String str) {
        this.f13309a = new ExecutorC5802a(looper);
        this.f13310b = Z2.r.m(obj, "Listener must not be null");
        this.f13311c = new a(obj, Z2.r.f(str));
    }

    public void a() {
        this.f13310b = null;
        this.f13311c = null;
    }

    public a b() {
        return this.f13311c;
    }

    public void c(final b bVar) {
        Z2.r.m(bVar, "Notifier must not be null");
        this.f13309a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f13373o.d(bVar);
            }
        });
    }

    final void d(b bVar) {
        Object obj = this.f13310b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e8) {
            bVar.b();
            throw e8;
        }
    }

    C1092d(Executor executor, Object obj, String str) {
        this.f13309a = (Executor) Z2.r.m(executor, "Executor must not be null");
        this.f13310b = Z2.r.m(obj, "Listener must not be null");
        this.f13311c = new a(obj, Z2.r.f(str));
    }
}
