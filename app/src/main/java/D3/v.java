package d3;

import A3.C0377k;
import c3.C0985g;
import c3.InterfaceC0979a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1093e;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class v extends AbstractBinderC5712b {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ AtomicReference f35259o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ C0377k f35260s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ InterfaceC0979a f35261t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ x f35262u;

    v(x xVar, AtomicReference atomicReference, C0377k c0377k, InterfaceC0979a interfaceC0979a) {
        this.f35262u = xVar;
        this.f35259o = atomicReference;
        this.f35260s = c0377k;
        this.f35261t = interfaceC0979a;
    }

    @Override // d3.AbstractBinderC5712b, d3.InterfaceC5718h
    public final void a7(Status status, C0985g c0985g) {
        if (c0985g != null) {
            this.f35259o.set(c0985g);
        }
        X2.l.b(status, null, this.f35260s);
        if (!status.E0() || (c0985g != null && c0985g.C0())) {
            this.f35262u.m(AbstractC1093e.c(this.f35261t, InterfaceC0979a.class.getSimpleName()), 27306);
        }
    }
}
