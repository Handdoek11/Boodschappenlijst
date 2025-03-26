package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ob, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1613Ob {

    /* renamed from: b, reason: collision with root package name */
    int f17901b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f17900a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List f17902c = new LinkedList();

    public final void a(C1578Nb c1578Nb) {
        synchronized (this.f17900a) {
            try {
                if (this.f17902c.size() >= 10) {
                    H2.p.b("Queue is full, current size = " + this.f17902c.size());
                    this.f17902c.remove(0);
                }
                int i8 = this.f17901b;
                this.f17901b = i8 + 1;
                c1578Nb.g(i8);
                c1578Nb.k();
                this.f17902c.add(c1578Nb);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(C1578Nb c1578Nb) {
        synchronized (this.f17900a) {
            try {
                Iterator it = this.f17902c.iterator();
                while (it.hasNext()) {
                    C1578Nb c1578Nb2 = (C1578Nb) it.next();
                    if (C2.v.s().j().R()) {
                        if (!C2.v.s().j().O() && !c1578Nb.equals(c1578Nb2) && c1578Nb2.d().equals(c1578Nb.d())) {
                            it.remove();
                            return true;
                        }
                    } else if (!c1578Nb.equals(c1578Nb2) && c1578Nb2.c().equals(c1578Nb.c())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(C1578Nb c1578Nb) {
        synchronized (this.f17900a) {
            try {
                return this.f17902c.contains(c1578Nb);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
