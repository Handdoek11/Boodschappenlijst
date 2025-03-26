package r7;

import java.util.Queue;
import s7.e;

/* loaded from: classes2.dex */
public class a implements q7.a {

    /* renamed from: o, reason: collision with root package name */
    String f42628o;

    /* renamed from: s, reason: collision with root package name */
    e f42629s;

    /* renamed from: t, reason: collision with root package name */
    Queue f42630t;

    public a(e eVar, Queue queue) {
        this.f42629s = eVar;
        this.f42628o = eVar.getName();
        this.f42630t = queue;
    }

    private void c(b bVar, q7.c cVar, String str, Object[] objArr, Throwable th) {
        d dVar = new d();
        dVar.j(System.currentTimeMillis());
        dVar.c(bVar);
        dVar.d(this.f42629s);
        dVar.e(this.f42628o);
        dVar.f(cVar);
        dVar.g(str);
        dVar.h(Thread.currentThread().getName());
        dVar.b(objArr);
        dVar.i(th);
        this.f42630t.add(dVar);
    }

    private void d(b bVar, q7.c cVar, String str, Throwable th) {
        c(bVar, cVar, str, null, th);
    }

    @Override // q7.a
    public void a(String str) {
        d(b.WARN, null, str, null);
    }

    @Override // q7.a
    public void b(String str) {
        d(b.TRACE, null, str, null);
    }

    @Override // q7.a
    public String getName() {
        return this.f42628o;
    }
}
