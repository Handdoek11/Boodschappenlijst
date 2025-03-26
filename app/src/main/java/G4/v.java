package g4;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
class v implements H4.b {

    /* renamed from: b, reason: collision with root package name */
    private volatile Set f36081b = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile Set f36080a = Collections.newSetFromMap(new ConcurrentHashMap());

    v(Collection collection) {
        this.f36080a.addAll(collection);
    }

    static v b(Collection collection) {
        return new v((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator it = this.f36080a.iterator();
            while (it.hasNext()) {
                this.f36081b.add(((H4.b) it.next()).get());
            }
            this.f36080a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(H4.b bVar) {
        try {
            if (this.f36081b == null) {
                this.f36080a.add(bVar);
            } else {
                this.f36081b.add(bVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // H4.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f36081b == null) {
            synchronized (this) {
                try {
                    if (this.f36081b == null) {
                        this.f36081b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f36081b);
    }
}
