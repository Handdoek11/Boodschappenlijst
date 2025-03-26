package x1;

import A1.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w1.InterfaceC6865a;
import y1.AbstractC6940d;

/* renamed from: x1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6900c implements InterfaceC6865a {

    /* renamed from: a, reason: collision with root package name */
    private final List f44422a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private Object f44423b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC6940d f44424c;

    /* renamed from: d, reason: collision with root package name */
    private a f44425d;

    /* renamed from: x1.c$a */
    public interface a {
        void a(List list);

        void b(List list);
    }

    AbstractC6900c(AbstractC6940d abstractC6940d) {
        this.f44424c = abstractC6940d;
    }

    private void h(a aVar, Object obj) {
        if (this.f44422a.isEmpty() || aVar == null) {
            return;
        }
        if (obj == null || c(obj)) {
            aVar.b(this.f44422a);
        } else {
            aVar.a(this.f44422a);
        }
    }

    @Override // w1.InterfaceC6865a
    public void a(Object obj) {
        this.f44423b = obj;
        h(this.f44425d, obj);
    }

    abstract boolean b(p pVar);

    abstract boolean c(Object obj);

    public boolean d(String str) {
        Object obj = this.f44423b;
        return obj != null && c(obj) && this.f44422a.contains(str);
    }

    public void e(Iterable iterable) {
        this.f44422a.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (b(pVar)) {
                this.f44422a.add(pVar.f95a);
            }
        }
        if (this.f44422a.isEmpty()) {
            this.f44424c.c(this);
        } else {
            this.f44424c.a(this);
        }
        h(this.f44425d, this.f44423b);
    }

    public void f() {
        if (this.f44422a.isEmpty()) {
            return;
        }
        this.f44422a.clear();
        this.f44424c.c(this);
    }

    public void g(a aVar) {
        if (this.f44425d != aVar) {
            this.f44425d = aVar;
            h(aVar, this.f44423b);
        }
    }
}
