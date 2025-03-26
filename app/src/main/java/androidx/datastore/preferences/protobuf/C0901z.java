package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0901z implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    private Iterator f9610o;

    public C0901z(Iterator it) {
        this.f9610o = it;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f9610o.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f9610o.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f9610o.remove();
    }
}
