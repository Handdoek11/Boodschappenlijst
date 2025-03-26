package l3;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.C0377k;
import android.content.Context;
import com.google.android.gms.common.C1109h;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.AbstractC1096h;

/* loaded from: classes.dex */
public final class p extends com.google.android.gms.common.api.b implements S2.b {

    /* renamed from: m, reason: collision with root package name */
    private static final a.g f38797m;

    /* renamed from: n, reason: collision with root package name */
    private static final a.AbstractC0225a f38798n;

    /* renamed from: o, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f38799o;

    /* renamed from: k, reason: collision with root package name */
    private final Context f38800k;

    /* renamed from: l, reason: collision with root package name */
    private final C1109h f38801l;

    static {
        a.g gVar = new a.g();
        f38797m = gVar;
        n nVar = new n();
        f38798n = nVar;
        f38799o = new com.google.android.gms.common.api.a("AppSet.API", nVar, gVar);
    }

    p(Context context, C1109h c1109h) {
        super(context, f38799o, a.d.f13231a, b.a.f13242c);
        this.f38800k = context;
        this.f38801l = c1109h;
    }

    @Override // S2.b
    public final AbstractC0376j a() {
        return this.f38801l.h(this.f38800k, 212800000) == 0 ? j(AbstractC1096h.a().d(S2.h.f5082a).b(new X2.j() { // from class: l3.m
            @Override // X2.j
            public final void accept(Object obj, Object obj2) {
                ((g) ((d) obj).D()).J0(new S2.d(null, null), new o(this.f38795a, (C0377k) obj2));
            }
        }).c(false).e(27601).a()) : AbstractC0379m.d(new ApiException(new Status(17)));
    }
}
