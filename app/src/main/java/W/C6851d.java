package w;

import J6.r;
import java.util.Iterator;
import java.util.Map;
import v.InterfaceC6821b;
import y6.AbstractC6977e;

/* renamed from: w.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6851d extends AbstractC6977e implements InterfaceC6821b {

    /* renamed from: s, reason: collision with root package name */
    private final C6849b f44171s;

    public C6851d(C6849b c6849b) {
        this.f44171s = c6849b;
    }

    @Override // y6.AbstractC6973a
    public int b() {
        return this.f44171s.size();
    }

    @Override // y6.AbstractC6973a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return d((Map.Entry) obj);
        }
        return false;
    }

    public boolean d(Map.Entry entry) {
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        Object obj = this.f44171s.get(entry.getKey());
        return obj != null ? r.a(obj, entry.getValue()) : entry.getValue() == null && this.f44171s.containsKey(entry.getKey());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C6852e(this.f44171s.l());
    }
}
