package com.google.android.gms.internal.ads;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.ads.Gj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1348Gj0 extends AbstractC3411mj0 {

    /* renamed from: A, reason: collision with root package name */
    private static final AbstractC1204Cj0 f15427A;

    /* renamed from: B, reason: collision with root package name */
    private static final C3304lk0 f15428B = new C3304lk0(AbstractC1348Gj0.class);

    /* renamed from: y, reason: collision with root package name */
    private volatile Set f15429y = null;

    /* renamed from: z, reason: collision with root package name */
    private volatile int f15430z;

    static {
        AbstractC1204Cj0 c1276Ej0;
        Throwable th;
        AbstractC1312Fj0 abstractC1312Fj0 = null;
        try {
            c1276Ej0 = new C1240Dj0(AtomicReferenceFieldUpdater.newUpdater(AbstractC1348Gj0.class, Set.class, "y"), AtomicIntegerFieldUpdater.newUpdater(AbstractC1348Gj0.class, "z"));
            th = null;
        } catch (Throwable th2) {
            c1276Ej0 = new C1276Ej0(abstractC1312Fj0);
            th = th2;
        }
        f15427A = c1276Ej0;
        if (th != null) {
            f15428B.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    AbstractC1348Gj0(int i8) {
        this.f15430z = i8;
    }

    final int D() {
        return f15427A.a(this);
    }

    final Set F() {
        Set set = this.f15429y;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        J(newSetFromMap);
        f15427A.b(this, null, newSetFromMap);
        Set set2 = this.f15429y;
        Objects.requireNonNull(set2);
        return set2;
    }

    final void I() {
        this.f15429y = null;
    }

    abstract void J(Set set);
}
