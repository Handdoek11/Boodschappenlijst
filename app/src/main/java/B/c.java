package B;

import B.e;
import I6.p;
import J6.r;
import J6.s;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: b, reason: collision with root package name */
    private final e f272b;

    /* renamed from: c, reason: collision with root package name */
    private final e f273c;

    static final class a extends s implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final a f274o = new a();

        a() {
            super(2);
        }

        @Override // I6.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, e.b bVar) {
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(e eVar, e eVar2) {
        this.f272b = eVar;
        this.f273c = eVar2;
    }

    @Override // B.e
    public /* synthetic */ e a(e eVar) {
        return d.a(this, eVar);
    }

    @Override // B.e
    public Object b(Object obj, p pVar) {
        return this.f273c.b(this.f272b.b(obj, pVar), pVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (r.a(this.f272b, cVar.f272b) && r.a(this.f273c, cVar.f273c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f272b.hashCode() + (this.f273c.hashCode() * 31);
    }

    public String toString() {
        return '[' + ((String) b("", a.f274o)) + ']';
    }
}
