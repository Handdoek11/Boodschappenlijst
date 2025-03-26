package m;

import java.util.HashMap;
import java.util.Map;
import m.C6182b;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6181a extends C6182b {

    /* renamed from: v, reason: collision with root package name */
    private final HashMap f38886v = new HashMap();

    @Override // m.C6182b
    protected C6182b.c c(Object obj) {
        return (C6182b.c) this.f38886v.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f38886v.containsKey(obj);
    }

    @Override // m.C6182b
    public Object n(Object obj, Object obj2) {
        C6182b.c c8 = c(obj);
        if (c8 != null) {
            return c8.f38892s;
        }
        this.f38886v.put(obj, j(obj, obj2));
        return null;
    }

    @Override // m.C6182b
    public Object o(Object obj) {
        Object o8 = super.o(obj);
        this.f38886v.remove(obj);
        return o8;
    }

    public Map.Entry p(Object obj) {
        if (contains(obj)) {
            return ((C6182b.c) this.f38886v.get(obj)).f38894u;
        }
        return null;
    }
}
