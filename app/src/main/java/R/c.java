package r;

import J6.r;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f42383a;

    public c(int i8, float f8) {
        this.f42383a = new LinkedHashMap(i8, f8, true);
    }

    public final Object a(Object obj) {
        r.e(obj, "key");
        return this.f42383a.get(obj);
    }

    public final Set b() {
        Set entrySet = this.f42383a.entrySet();
        r.d(entrySet, "map.entries");
        return entrySet;
    }

    public final boolean c() {
        return this.f42383a.isEmpty();
    }

    public final Object d(Object obj, Object obj2) {
        r.e(obj, "key");
        r.e(obj2, "value");
        return this.f42383a.put(obj, obj2);
    }

    public final Object e(Object obj) {
        r.e(obj, "key");
        return this.f42383a.remove(obj);
    }
}
