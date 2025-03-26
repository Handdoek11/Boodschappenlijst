package d3;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.C0377k;
import A3.InterfaceC0375i;
import android.app.Activity;
import android.content.Context;
import c3.C0980b;
import c3.C0984f;
import c3.C0985g;
import c3.InterfaceC0979a;
import c3.InterfaceC0982d;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.AbstractC1093e;
import com.google.android.gms.common.api.internal.AbstractC1096h;
import com.google.android.gms.common.api.internal.C1092d;
import com.google.android.gms.common.api.internal.C1095g;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class x extends com.google.android.gms.common.api.b implements InterfaceC0982d {

    /* renamed from: k, reason: collision with root package name */
    private static final a.g f35264k;

    /* renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0225a f35265l;

    /* renamed from: m, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f35266m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f35267n = 0;

    static {
        a.g gVar = new a.g();
        f35264k = gVar;
        r rVar = new r();
        f35265l = rVar;
        f35266m = new com.google.android.gms.common.api.a("ModuleInstall.API", rVar, gVar);
    }

    public x(Activity activity) {
        super(activity, f35266m, (a.d) a.d.f13231a, b.a.f13242c);
    }

    static final C5711a y(boolean z7, W2.c... cVarArr) {
        Z2.r.m(cVarArr, "Requested APIs must not be null.");
        Z2.r.b(cVarArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (W2.c cVar : cVarArr) {
            Z2.r.m(cVar, "Requested API must not be null.");
        }
        return C5711a.C0(Arrays.asList(cVarArr), z7);
    }

    @Override // c3.InterfaceC0982d
    public final AbstractC0376j b(InterfaceC0979a interfaceC0979a) {
        return m(AbstractC1093e.c(interfaceC0979a, InterfaceC0979a.class.getSimpleName()), 27306);
    }

    @Override // c3.InterfaceC0982d
    public final AbstractC0376j d(C0984f c0984f) {
        final C5711a A02 = C5711a.A0(c0984f);
        final InterfaceC0979a b8 = c0984f.b();
        Executor c8 = c0984f.c();
        if (A02.B0().isEmpty()) {
            return AbstractC0379m.e(new C0985g(0));
        }
        if (b8 == null) {
            AbstractC1096h.a a8 = AbstractC1096h.a();
            a8.d(m3.i.f38966a);
            a8.c(true);
            a8.e(27304);
            a8.b(new X2.j() { // from class: d3.p
                @Override // X2.j
                public final void accept(Object obj, Object obj2) {
                    ((C5719i) ((y) obj).D()).q2(new u(this.f35252a, (C0377k) obj2), A02, null);
                }
            });
            return j(a8.a());
        }
        Z2.r.l(b8);
        C1092d s8 = c8 == null ? s(b8, InterfaceC0979a.class.getSimpleName()) : AbstractC1093e.b(b8, c8, InterfaceC0979a.class.getSimpleName());
        final BinderC5714d binderC5714d = new BinderC5714d(s8);
        final AtomicReference atomicReference = new AtomicReference();
        X2.j jVar = new X2.j() { // from class: d3.l
            @Override // X2.j
            public final void accept(Object obj, Object obj2) {
                ((C5719i) ((y) obj).D()).q2(new v(this.f35242a, atomicReference, (C0377k) obj2, b8), A02, binderC5714d);
            }
        };
        X2.j jVar2 = new X2.j() { // from class: d3.m
            @Override // X2.j
            public final void accept(Object obj, Object obj2) {
                ((C5719i) ((y) obj).D()).r3(new w(this.f35247a, (C0377k) obj2), binderC5714d);
            }
        };
        C1095g.a a9 = C1095g.a();
        a9.g(s8);
        a9.d(m3.i.f38966a);
        a9.c(true);
        a9.b(jVar);
        a9.f(jVar2);
        a9.e(27305);
        return l(a9.a()).t(new InterfaceC0375i() { // from class: d3.n
            @Override // A3.InterfaceC0375i
            public final AbstractC0376j a(Object obj) {
                int i8 = x.f35267n;
                AtomicReference atomicReference2 = atomicReference;
                return atomicReference2.get() != null ? AbstractC0379m.e((C0985g) atomicReference2.get()) : AbstractC0379m.d(new ApiException(Status.f13221y));
            }
        });
    }

    @Override // c3.InterfaceC0982d
    public final AbstractC0376j e(W2.c... cVarArr) {
        final C5711a y7 = y(false, cVarArr);
        if (y7.B0().isEmpty()) {
            return AbstractC0379m.e(new C0980b(true, 0));
        }
        AbstractC1096h.a a8 = AbstractC1096h.a();
        a8.d(m3.i.f38966a);
        a8.e(27301);
        a8.c(false);
        a8.b(new X2.j() { // from class: d3.o
            @Override // X2.j
            public final void accept(Object obj, Object obj2) {
                ((C5719i) ((y) obj).D()).p2(new s(this.f35250a, (C0377k) obj2), y7);
            }
        });
        return j(a8.a());
    }

    @Override // c3.InterfaceC0982d
    public final AbstractC0376j f(W2.c... cVarArr) {
        final C5711a y7 = y(false, cVarArr);
        if (y7.B0().isEmpty()) {
            return AbstractC0379m.e(null);
        }
        AbstractC1096h.a a8 = AbstractC1096h.a();
        a8.d(m3.i.f38966a);
        a8.e(27302);
        a8.c(false);
        a8.b(new X2.j() { // from class: d3.q
            @Override // X2.j
            public final void accept(Object obj, Object obj2) {
                ((C5719i) ((y) obj).D()).q2(new t(this.f35254a, (C0377k) obj2), y7, null);
            }
        });
        return j(a8.a());
    }

    public x(Context context) {
        super(context, f35266m, a.d.f13231a, b.a.f13242c);
    }
}
