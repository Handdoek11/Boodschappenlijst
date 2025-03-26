package c4;

import java.io.Serializable;

/* renamed from: c4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1003f extends G implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    final b4.c f12173o;

    /* renamed from: s, reason: collision with root package name */
    final G f12174s;

    C1003f(b4.c cVar, G g8) {
        this.f12173o = (b4.c) b4.h.i(cVar);
        this.f12174s = (G) b4.h.i(g8);
    }

    @Override // c4.G, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f12174s.compare(this.f12173o.apply(obj), this.f12173o.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1003f)) {
            return false;
        }
        C1003f c1003f = (C1003f) obj;
        return this.f12173o.equals(c1003f.f12173o) && this.f12174s.equals(c1003f.f12174s);
    }

    public int hashCode() {
        return b4.f.b(this.f12173o, this.f12174s);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f12174s);
        String valueOf2 = String.valueOf(this.f12173o);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
