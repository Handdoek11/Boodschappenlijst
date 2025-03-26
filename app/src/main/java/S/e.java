package S;

import J6.r;
import androidx.compose.ui.platform.A;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import s.AbstractC6719b;
import x6.InterfaceC6925g;

/* loaded from: classes.dex */
public final class e implements o, Iterable, K6.a {

    /* renamed from: o, reason: collision with root package name */
    private final Map f5007o = new LinkedHashMap();

    /* renamed from: s, reason: collision with root package name */
    private boolean f5008s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f5009t;

    @Override // S.o
    public void b(n nVar, Object obj) {
        if (!(obj instanceof a) || !d(nVar)) {
            this.f5007o.put(nVar, obj);
            return;
        }
        Object obj2 = this.f5007o.get(nVar);
        r.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) obj2;
        Map map = this.f5007o;
        a aVar2 = (a) obj;
        String b8 = aVar2.b();
        if (b8 == null) {
            b8 = aVar.b();
        }
        InterfaceC6925g a8 = aVar2.a();
        if (a8 == null) {
            a8 = aVar.a();
        }
        map.put(nVar, new a(b8, a8));
    }

    public final boolean d(n nVar) {
        return this.f5007o.containsKey(nVar);
    }

    public final e e() {
        e eVar = new e();
        eVar.f5008s = this.f5008s;
        eVar.f5009t = this.f5009t;
        eVar.f5007o.putAll(this.f5007o);
        return eVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return r.a(this.f5007o, eVar.f5007o) && this.f5008s == eVar.f5008s && this.f5009t == eVar.f5009t;
    }

    public int hashCode() {
        return (((this.f5007o.hashCode() * 31) + AbstractC6719b.a(this.f5008s)) * 31) + AbstractC6719b.a(this.f5009t);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f5007o.entrySet().iterator();
    }

    public final Object j(n nVar, I6.a aVar) {
        Object obj = this.f5007o.get(nVar);
        return obj == null ? aVar.invoke() : obj;
    }

    public final Object n(n nVar, I6.a aVar) {
        Object obj = this.f5007o.get(nVar);
        return obj == null ? aVar.invoke() : obj;
    }

    public final boolean o() {
        return this.f5009t;
    }

    public final boolean p() {
        return this.f5008s;
    }

    public final void q(e eVar) {
        for (Map.Entry entry : eVar.f5007o.entrySet()) {
            n nVar = (n) entry.getKey();
            Object value = entry.getValue();
            Object obj = this.f5007o.get(nVar);
            r.c(nVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object b8 = nVar.b(obj, value);
            if (b8 != null) {
                this.f5007o.put(nVar, b8);
            }
        }
    }

    public final void r(boolean z7) {
        this.f5009t = z7;
    }

    public final void s(boolean z7) {
        this.f5008s = z7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.f5008s) {
            sb.append("");
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f5009t) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f5007o.entrySet()) {
            n nVar = (n) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(nVar.a());
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return A.a(this, null) + "{ " + ((Object) sb) + " }";
    }
}
