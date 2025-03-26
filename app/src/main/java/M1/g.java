package M1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final a f3734a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Map f3735b = new HashMap();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final Object f3736a;

        /* renamed from: b, reason: collision with root package name */
        private List f3737b;

        /* renamed from: c, reason: collision with root package name */
        a f3738c;

        /* renamed from: d, reason: collision with root package name */
        a f3739d;

        a() {
            this(null);
        }

        public void a(Object obj) {
            if (this.f3737b == null) {
                this.f3737b = new ArrayList();
            }
            this.f3737b.add(obj);
        }

        public Object b() {
            int c8 = c();
            if (c8 > 0) {
                return this.f3737b.remove(c8 - 1);
            }
            return null;
        }

        public int c() {
            List list = this.f3737b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(Object obj) {
            this.f3739d = this;
            this.f3738c = this;
            this.f3736a = obj;
        }
    }

    g() {
    }

    private void b(a aVar) {
        e(aVar);
        a aVar2 = this.f3734a;
        aVar.f3739d = aVar2;
        aVar.f3738c = aVar2.f3738c;
        g(aVar);
    }

    private void c(a aVar) {
        e(aVar);
        a aVar2 = this.f3734a;
        aVar.f3739d = aVar2.f3739d;
        aVar.f3738c = aVar2;
        g(aVar);
    }

    private static void e(a aVar) {
        a aVar2 = aVar.f3739d;
        aVar2.f3738c = aVar.f3738c;
        aVar.f3738c.f3739d = aVar2;
    }

    private static void g(a aVar) {
        aVar.f3738c.f3739d = aVar;
        aVar.f3739d.f3738c = aVar;
    }

    public Object a(m mVar) {
        a aVar = (a) this.f3735b.get(mVar);
        if (aVar == null) {
            aVar = new a(mVar);
            this.f3735b.put(mVar, aVar);
        } else {
            mVar.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(m mVar, Object obj) {
        a aVar = (a) this.f3735b.get(mVar);
        if (aVar == null) {
            aVar = new a(mVar);
            c(aVar);
            this.f3735b.put(mVar, aVar);
        } else {
            mVar.a();
        }
        aVar.a(obj);
    }

    public Object f() {
        for (a aVar = this.f3734a.f3739d; !aVar.equals(this.f3734a); aVar = aVar.f3739d) {
            Object b8 = aVar.b();
            if (b8 != null) {
                return b8;
            }
            e(aVar);
            this.f3735b.remove(aVar.f3736a);
            ((m) aVar.f3736a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f3734a.f3738c;
        boolean z7 = false;
        while (!aVar.equals(this.f3734a)) {
            sb.append('{');
            sb.append(aVar.f3736a);
            sb.append(':');
            sb.append(aVar.c());
            sb.append("}, ");
            aVar = aVar.f3738c;
            z7 = true;
        }
        if (z7) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
