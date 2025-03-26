package N1;

import d2.AbstractC5709k;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f4057a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final b f4058b = new b();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final Lock f4059a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        int f4060b;

        a() {
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue f4061a = new ArrayDeque();

        b() {
        }

        a a() {
            a aVar;
            synchronized (this.f4061a) {
                aVar = (a) this.f4061a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        void b(a aVar) {
            synchronized (this.f4061a) {
                try {
                    if (this.f4061a.size() < 10) {
                        this.f4061a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    c() {
    }

    void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) this.f4057a.get(str);
                if (aVar == null) {
                    aVar = this.f4058b.a();
                    this.f4057a.put(str, aVar);
                }
                aVar.f4060b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f4059a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) AbstractC5709k.d(this.f4057a.get(str));
                int i8 = aVar.f4060b;
                if (i8 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f4060b);
                }
                int i9 = i8 - 1;
                aVar.f4060b = i9;
                if (i9 == 0) {
                    a aVar2 = (a) this.f4057a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f4058b.b(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f4059a.unlock();
    }
}
