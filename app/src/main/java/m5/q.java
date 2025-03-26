package m5;

import android.content.Context;
import android.view.ViewGroup;
import com.headcode.ourgroceries.android.AbstractC5673x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import w2.AbstractC6878d;
import w2.C6882h;
import x2.C6902a;
import x2.C6903b;

/* loaded from: classes2.dex */
public class q extends u {

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f39218j = Pattern.compile("[\\Q\"'=!+#*~;^()<>[],& \\E]+");

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC6878d f39219h;

    /* renamed from: i, reason: collision with root package name */
    private C6903b f39220i;

    public q(Context context, k kVar, ViewGroup viewGroup, p pVar) {
        super(context, kVar, viewGroup, pVar);
        this.f39219h = new a();
        this.f39220i = null;
    }

    static String B(String str) {
        return str == null ? "" : f39218j.matcher(str).replaceAll(" ").trim();
    }

    private static List C(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String B7 = B((String) it.next());
            if (!B7.isEmpty()) {
                arrayList.add(B7);
            }
        }
        return arrayList;
    }

    protected String A() {
        return this.f39206d.c() ? "/21738673830/AndroidItemDetailsBanner" : "/21738673830/AndroidListBanner";
    }

    @Override // m5.u, m5.n
    public void b() {
        super.b();
        this.f39220i = null;
    }

    @Override // m5.n
    public void e() {
        C6903b c6903b = this.f39220i;
        if (c6903b != null) {
            c6903b.a();
        }
        super.e();
    }

    @Override // m5.n
    public void g() {
        C6903b c6903b = this.f39220i;
        if (c6903b != null) {
            c6903b.c();
        }
    }

    @Override // m5.n
    public void h() {
        C6903b c6903b = this.f39220i;
        if (c6903b != null) {
            c6903b.d();
        }
    }

    @Override // m5.u
    protected void r() {
        this.f39220i = new C6903b(this.f39203a);
        C6882h s8 = s();
        this.f39220i.setAdSize(s8);
        this.f39220i.setAdUnitId(A());
        this.f39220i.setAdListener(this.f39219h);
        this.f39204b.removeAllViews();
        this.f39204b.addView(this.f39220i);
        y(s8);
    }

    @Override // m5.u
    protected void x(j jVar) {
        if (this.f39220i == null) {
            return;
        }
        C6902a.C0348a c0348a = new C6902a.C0348a();
        Iterator it = jVar.b().iterator();
        while (it.hasNext()) {
            c0348a.a((String) it.next());
        }
        c0348a.g("item", C(jVar.b()));
        try {
            this.f39220i.e(c0348a.h());
        } catch (IllegalStateException unused) {
            AbstractC5673x.a("gamLoadAdExc");
        }
    }

    class a extends AbstractC6878d {
        a() {
        }

        @Override // w2.AbstractC6878d
        public void i(w2.m mVar) {
            AbstractC5673x.a("gamFail" + mVar.a());
            q.this.f39205c.b();
        }

        @Override // w2.AbstractC6878d
        public void o() {
        }
    }
}
