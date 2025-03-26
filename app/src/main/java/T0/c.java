package T0;

import I6.l;
import J6.r;
import androidx.lifecycle.H;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List f5164a = new ArrayList();

    public final void a(Q6.b bVar, l lVar) {
        r.e(bVar, "clazz");
        r.e(lVar, "initializer");
        this.f5164a.add(new f(H6.a.a(bVar), lVar));
    }

    public final H.b b() {
        f[] fVarArr = (f[]) this.f5164a.toArray(new f[0]);
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
