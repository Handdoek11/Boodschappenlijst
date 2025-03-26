package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.gL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2725gL {

    /* renamed from: a, reason: collision with root package name */
    private final RC f22343a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2068aI f22344b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2506eK f22345c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet f22346d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque f22347e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f22348f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f22349g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f22350h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f22351i;

    public C2725gL(Looper looper, RC rc, InterfaceC2506eK interfaceC2506eK) {
        this(new CopyOnWriteArraySet(), looper, rc, interfaceC2506eK, true);
    }

    public static /* synthetic */ boolean g(C2725gL c2725gL, Message message) {
        Iterator it = c2725gL.f22346d.iterator();
        while (it.hasNext()) {
            ((FK) it.next()).b(c2725gL.f22345c);
            if (c2725gL.f22344b.z(1)) {
                break;
            }
        }
        return true;
    }

    private final void h() {
        if (this.f22351i) {
            AbstractC3796qC.f(Thread.currentThread() == this.f22344b.zza().getThread());
        }
    }

    public final C2725gL a(Looper looper, InterfaceC2506eK interfaceC2506eK) {
        return new C2725gL(this.f22346d, looper, this.f22343a, interfaceC2506eK, this.f22351i);
    }

    public final void b(Object obj) {
        synchronized (this.f22349g) {
            try {
                if (this.f22350h) {
                    return;
                }
                this.f22346d.add(new FK(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        h();
        if (this.f22348f.isEmpty()) {
            return;
        }
        if (!this.f22344b.z(1)) {
            InterfaceC2068aI interfaceC2068aI = this.f22344b;
            interfaceC2068aI.l(interfaceC2068aI.A(1));
        }
        boolean isEmpty = this.f22347e.isEmpty();
        this.f22347e.addAll(this.f22348f);
        this.f22348f.clear();
        if (isEmpty) {
            while (!this.f22347e.isEmpty()) {
                ((Runnable) this.f22347e.peekFirst()).run();
                this.f22347e.removeFirst();
            }
        }
    }

    public final void d(final int i8, final DJ dj) {
        h();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f22346d);
        this.f22348f.add(new Runnable() { // from class: com.google.android.gms.internal.ads.cJ
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    DJ dj2 = dj;
                    ((FK) it.next()).a(i8, dj2);
                }
            }
        });
    }

    public final void e() {
        h();
        synchronized (this.f22349g) {
            this.f22350h = true;
        }
        Iterator it = this.f22346d.iterator();
        while (it.hasNext()) {
            ((FK) it.next()).c(this.f22345c);
        }
        this.f22346d.clear();
    }

    public final void f(Object obj) {
        h();
        Iterator it = this.f22346d.iterator();
        while (it.hasNext()) {
            FK fk = (FK) it.next();
            if (fk.f15133a.equals(obj)) {
                fk.c(this.f22345c);
                this.f22346d.remove(fk);
            }
        }
    }

    private C2725gL(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, RC rc, InterfaceC2506eK interfaceC2506eK, boolean z7) {
        this.f22343a = rc;
        this.f22346d = copyOnWriteArraySet;
        this.f22345c = interfaceC2506eK;
        this.f22349g = new Object();
        this.f22347e = new ArrayDeque();
        this.f22348f = new ArrayDeque();
        this.f22344b = rc.b(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.BI
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C2725gL.g(this.f13772o, message);
                return true;
            }
        });
        this.f22351i = z7;
    }
}
