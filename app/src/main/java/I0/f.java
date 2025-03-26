package I0;

import J6.r;
import U6.M;
import java.util.List;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f2983a = new f();

    private f() {
    }

    public final e a(j jVar, J0.b bVar, List list, M m8, I6.a aVar) {
        r.e(jVar, "serializer");
        r.e(list, "migrations");
        r.e(m8, "scope");
        r.e(aVar, "produceFile");
        a aVar2 = bVar;
        if (bVar == null) {
            aVar2 = new J0.a();
        }
        return new l(aVar, jVar, AbstractC6987o.b(d.f2966a.b(list)), aVar2, m8);
    }
}
