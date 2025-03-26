package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.gF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2714gF {

    /* renamed from: o, reason: collision with root package name */
    protected final Map f22268o = new HashMap();

    protected AbstractC2714gF(Set set) {
        j1(set);
    }

    public final synchronized void W0(C3041jG c3041jG) {
        f1(c3041jG.f23223a, c3041jG.f23224b);
    }

    public final synchronized void f1(Object obj, Executor executor) {
        this.f22268o.put(obj, executor);
    }

    public final synchronized void j1(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            W0((C3041jG) it.next());
        }
    }

    protected final synchronized void l1(final InterfaceC2605fF interfaceC2605fF) {
        for (Map.Entry entry : this.f22268o.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.eF
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        interfaceC2605fF.a(key);
                    } catch (Throwable th) {
                        C2.v.s().w(th, "EventEmitter.notify");
                        AbstractC0608p0.l("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
