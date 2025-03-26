package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import x6.C6916E;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f6658a;

    /* renamed from: b, reason: collision with root package name */
    private final I6.a f6659b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f6660c;

    /* renamed from: d, reason: collision with root package name */
    private int f6661d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6662e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6663f;

    /* renamed from: g, reason: collision with root package name */
    private final List f6664g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f6665h;

    public s(Executor executor, I6.a aVar) {
        J6.r.e(executor, "executor");
        J6.r.e(aVar, "reportFullyDrawn");
        this.f6658a = executor;
        this.f6659b = aVar;
        this.f6660c = new Object();
        this.f6664g = new ArrayList();
        this.f6665h = new Runnable() { // from class: androidx.activity.r
            @Override // java.lang.Runnable
            public final void run() {
                s.d(this.f6657o);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(s sVar) {
        J6.r.e(sVar, "this$0");
        synchronized (sVar.f6660c) {
            try {
                sVar.f6662e = false;
                if (sVar.f6661d == 0 && !sVar.f6663f) {
                    sVar.f6659b.invoke();
                    sVar.b();
                }
                C6916E c6916e = C6916E.f44463a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f6660c) {
            try {
                this.f6663f = true;
                Iterator it = this.f6664g.iterator();
                while (it.hasNext()) {
                    ((I6.a) it.next()).invoke();
                }
                this.f6664g.clear();
                C6916E c6916e = C6916E.f44463a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z7;
        synchronized (this.f6660c) {
            z7 = this.f6663f;
        }
        return z7;
    }
}
