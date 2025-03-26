package m5;

import android.content.Context;
import android.view.ViewGroup;
import com.headcode.ourgroceries.android.AbstractC5673x;
import java.util.Iterator;
import w2.AbstractC6878d;
import w2.C6881g;
import w2.C6882h;

/* loaded from: classes2.dex */
public class m extends u {

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC6878d f39200h;

    /* renamed from: i, reason: collision with root package name */
    private w2.i f39201i;

    public m(Context context, k kVar, ViewGroup viewGroup, p pVar) {
        super(context, kVar, viewGroup, pVar);
        this.f39200h = new a();
        this.f39201i = null;
    }

    protected String A() {
        return this.f39206d.c() ? "ca-app-pub-9811003882361938/7688204283" : "ca-app-pub-9811003882361938/1148088033";
    }

    @Override // m5.u, m5.n
    public void b() {
        super.b();
        this.f39201i = null;
    }

    @Override // m5.n
    public void e() {
        w2.i iVar = this.f39201i;
        if (iVar != null) {
            iVar.a();
        }
        super.e();
    }

    @Override // m5.n
    public void g() {
        w2.i iVar = this.f39201i;
        if (iVar != null) {
            iVar.c();
        }
    }

    @Override // m5.n
    public void h() {
        w2.i iVar = this.f39201i;
        if (iVar != null) {
            iVar.d();
        }
    }

    @Override // m5.u
    protected void r() {
        this.f39201i = new w2.i(this.f39203a);
        C6882h s8 = s();
        this.f39201i.setAdSize(s8);
        this.f39201i.setAdUnitId(A());
        this.f39201i.setAdListener(this.f39200h);
        this.f39204b.removeAllViews();
        this.f39204b.addView(this.f39201i);
        y(s8);
    }

    @Override // m5.u
    protected void x(j jVar) {
        if (this.f39201i == null) {
            return;
        }
        C6881g.a aVar = new C6881g.a();
        Iterator it = jVar.b().iterator();
        while (it.hasNext()) {
            aVar.a((String) it.next());
        }
        try {
            this.f39201i.b(aVar.g());
        } catch (IllegalStateException unused) {
            AbstractC5673x.a("admobLoadAdExc");
        }
    }

    class a extends AbstractC6878d {
        a() {
        }

        @Override // w2.AbstractC6878d
        public void i(w2.m mVar) {
            AbstractC5673x.a("admobFail" + mVar.a());
            m.this.f39205c.b();
        }

        @Override // w2.AbstractC6878d
        public void o() {
        }
    }
}
