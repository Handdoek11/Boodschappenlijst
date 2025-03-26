package J0;

import A6.d;
import I6.l;
import J6.r;
import androidx.datastore.core.CorruptionException;

/* loaded from: classes.dex */
public final class b implements I0.a {

    /* renamed from: a, reason: collision with root package name */
    private final l f3455a;

    public b(l lVar) {
        r.e(lVar, "produceNewData");
        this.f3455a = lVar;
    }

    @Override // I0.a
    public Object a(CorruptionException corruptionException, d dVar) {
        return this.f3455a.invoke(corruptionException);
    }
}
