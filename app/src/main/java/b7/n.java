package b7;

import J6.G;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f12063b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f12064c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f12065d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f12066e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f12067a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    private final h b(h hVar) {
        if (d() == 127) {
            return hVar;
        }
        if (hVar.f12051s.b() == 1) {
            f12066e.incrementAndGet(this);
        }
        int i8 = f12064c.get(this) & ModuleDescriptor.MODULE_VERSION;
        while (this.f12067a.get(i8) != null) {
            Thread.yield();
        }
        this.f12067a.lazySet(i8, hVar);
        f12064c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar == null || hVar.f12051s.b() != 1) {
            return;
        }
        f12066e.decrementAndGet(this);
    }

    private final int d() {
        return f12064c.get(this) - f12065d.get(this);
    }

    private final h i() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12065d;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 - f12064c.get(this) == 0) {
                return null;
            }
            int i9 = i8 & ModuleDescriptor.MODULE_VERSION;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 + 1) && (hVar = (h) this.f12067a.getAndSet(i9, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    private final boolean j(d dVar) {
        h i8 = i();
        if (i8 == null) {
            return false;
        }
        dVar.a(i8);
        return true;
    }

    private final h k(boolean z7) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f12063b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null) {
                if ((hVar.f12051s.b() == 1) == z7) {
                }
            }
            int i8 = f12065d.get(this);
            int i9 = f12064c.get(this);
            while (i8 != i9) {
                if (z7 && f12066e.get(this) == 0) {
                    return null;
                }
                i9--;
                h m8 = m(i9, z7);
                if (m8 != null) {
                    return m8;
                }
            }
            return null;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, hVar, null));
        return hVar;
    }

    private final h l(int i8) {
        int i9 = f12065d.get(this);
        int i10 = f12064c.get(this);
        boolean z7 = i8 == 1;
        while (i9 != i10) {
            if (z7 && f12066e.get(this) == 0) {
                return null;
            }
            int i11 = i9 + 1;
            h m8 = m(i9, z7);
            if (m8 != null) {
                return m8;
            }
            i9 = i11;
        }
        return null;
    }

    private final h m(int i8, boolean z7) {
        int i9 = i8 & ModuleDescriptor.MODULE_VERSION;
        h hVar = (h) this.f12067a.get(i9);
        if (hVar != null) {
            if ((hVar.f12051s.b() == 1) == z7 && Z5.c.a(this.f12067a, i9, hVar, null)) {
                if (z7) {
                    f12066e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    private final long o(int i8, G g8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f12063b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f12051s.b() != 1 ? 2 : 1) & i8) == 0) {
                return -2L;
            }
            long a8 = l.f12059f.a() - hVar.f12050o;
            long j8 = l.f12055b;
            if (a8 < j8) {
                return j8 - a8;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, hVar, null));
        g8.f3547o = hVar;
        return -1L;
    }

    public final h a(h hVar, boolean z7) {
        if (z7) {
            return b(hVar);
        }
        h hVar2 = (h) f12063b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int e() {
        return f12063b.get(this) != null ? d() + 1 : d();
    }

    public final void f(d dVar) {
        h hVar = (h) f12063b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (j(dVar)) {
        }
    }

    public final h g() {
        h hVar = (h) f12063b.getAndSet(this, null);
        return hVar == null ? i() : hVar;
    }

    public final h h() {
        return k(true);
    }

    public final long n(int i8, G g8) {
        h i9 = i8 == 3 ? i() : l(i8);
        if (i9 == null) {
            return o(i8, g8);
        }
        g8.f3547o = i9;
        return -1L;
    }
}
