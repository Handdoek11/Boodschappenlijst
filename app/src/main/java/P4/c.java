package P4;

import g4.C5807c;
import g4.r;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f4403a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4404b;

    c(Set set, d dVar) {
        this.f4403a = e(set);
        this.f4404b = dVar;
    }

    public static C5807c c() {
        return C5807c.e(i.class).b(r.o(f.class)).f(new g4.h() { // from class: P4.b
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return c.d(eVar);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(g4.e eVar) {
        return new c(eVar.g(f.class), d.a());
    }

    private static String e(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb.append(fVar.b());
            sb.append('/');
            sb.append(fVar.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // P4.i
    public String a() {
        if (this.f4404b.b().isEmpty()) {
            return this.f4403a;
        }
        return this.f4403a + ' ' + e(this.f4404b.b());
    }
}
