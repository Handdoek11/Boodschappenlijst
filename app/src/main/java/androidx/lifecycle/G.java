package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    private final Map f10231a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Set f10232b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f10233c = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    final void a() {
        this.f10233c = true;
        Map map = this.f10231a;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator it = this.f10231a.values().iterator();
                    while (it.hasNext()) {
                        b(it.next());
                    }
                } finally {
                }
            }
        }
        Set set = this.f10232b;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator it2 = this.f10232b.iterator();
                    while (it2.hasNext()) {
                        b((Closeable) it2.next());
                    }
                } finally {
                }
            }
        }
        d();
    }

    Object c(String str) {
        Object obj;
        Map map = this.f10231a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f10231a.get(str);
        }
        return obj;
    }

    protected void d() {
    }

    Object e(String str, Object obj) {
        Object obj2;
        synchronized (this.f10231a) {
            try {
                obj2 = this.f10231a.get(str);
                if (obj2 == null) {
                    this.f10231a.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f10233c) {
            b(obj);
        }
        return obj;
    }
}
