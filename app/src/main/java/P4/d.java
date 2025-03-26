package P4;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f4405b;

    /* renamed from: a, reason: collision with root package name */
    private final Set f4406a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f4405b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = f4405b;
                    if (dVar == null) {
                        dVar = new d();
                        f4405b = dVar;
                    }
                } finally {
                }
            }
        }
        return dVar;
    }

    Set b() {
        Set unmodifiableSet;
        synchronized (this.f4406a) {
            unmodifiableSet = DesugarCollections.unmodifiableSet(this.f4406a);
        }
        return unmodifiableSet;
    }
}
