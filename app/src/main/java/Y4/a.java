package Y4;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final ReferenceQueue f6070a = new ReferenceQueue();

    /* renamed from: b, reason: collision with root package name */
    private final Set f6071b = DesugarCollections.synchronizedSet(new HashSet());

    /* renamed from: Y4.a$a, reason: collision with other inner class name */
    public interface InterfaceC0125a {
        void a();
    }

    private a() {
    }

    public static a a() {
        a aVar = new a();
        aVar.b(aVar, new Runnable() { // from class: Y4.l
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = aVar.f6070a;
        final Set set = aVar.f6071b;
        Thread thread = new Thread(new Runnable() { // from class: Y4.k
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                Set set2 = set;
                while (!set2.isEmpty()) {
                    try {
                        ((n) referenceQueue2.remove()).a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    public InterfaceC0125a b(Object obj, Runnable runnable) {
        n nVar = new n(obj, this.f6070a, this.f6071b, runnable, null);
        this.f6071b.add(nVar);
        return nVar;
    }
}
