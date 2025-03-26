package b3;

import A3.AbstractC0376j;
import A3.C0377k;
import X2.j;
import Z2.C0782v;
import Z2.C0785y;
import Z2.InterfaceC0784x;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.AbstractC1096h;

/* renamed from: b3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0961d extends com.google.android.gms.common.api.b implements InterfaceC0784x {

    /* renamed from: k, reason: collision with root package name */
    private static final a.g f11989k;

    /* renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0225a f11990l;

    /* renamed from: m, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f11991m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f11992n = 0;

    static {
        a.g gVar = new a.g();
        f11989k = gVar;
        C0960c c0960c = new C0960c();
        f11990l = c0960c;
        f11991m = new com.google.android.gms.common.api.a("ClientTelemetry.API", c0960c, gVar);
    }

    public C0961d(Context context, C0785y c0785y) {
        super(context, f11991m, c0785y, b.a.f13242c);
    }

    @Override // Z2.InterfaceC0784x
    public final AbstractC0376j c(final C0782v c0782v) {
        AbstractC1096h.a a8 = AbstractC1096h.a();
        a8.d(m3.d.f38962a);
        a8.c(false);
        a8.b(new j() { // from class: b3.b
            @Override // X2.j
            public final void accept(Object obj, Object obj2) {
                int i8 = C0961d.f11992n;
                ((C0958a) ((C0962e) obj).D()).p2(c0782v);
                ((C0377k) obj2).c(null);
            }
        });
        return i(a8.a());
    }
}
