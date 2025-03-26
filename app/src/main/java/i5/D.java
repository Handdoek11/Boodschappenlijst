package I5;

import J6.AbstractC0650j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public final class D {

    /* renamed from: k, reason: collision with root package name */
    public static final a f3159k;

    /* renamed from: l, reason: collision with root package name */
    private static final K f3160l;

    /* renamed from: a, reason: collision with root package name */
    private H f3161a;

    /* renamed from: b, reason: collision with root package name */
    private String f3162b;

    /* renamed from: c, reason: collision with root package name */
    private int f3163c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3164d;

    /* renamed from: e, reason: collision with root package name */
    private String f3165e;

    /* renamed from: f, reason: collision with root package name */
    private String f3166f;

    /* renamed from: g, reason: collision with root package name */
    private String f3167g;

    /* renamed from: h, reason: collision with root package name */
    private List f3168h;

    /* renamed from: i, reason: collision with root package name */
    private y f3169i;

    /* renamed from: j, reason: collision with root package name */
    private y f3170j;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f3159k = aVar;
        f3160l = J.b(E.a(aVar));
    }

    public D(H h8, String str, int i8, String str2, String str3, List list, x xVar, String str4, boolean z7) {
        J6.r.e(h8, "protocol");
        J6.r.e(str, "host");
        J6.r.e(list, "pathSegments");
        J6.r.e(xVar, "parameters");
        J6.r.e(str4, "fragment");
        this.f3161a = h8;
        this.f3162b = str;
        this.f3163c = i8;
        this.f3164d = z7;
        this.f3165e = str2 != null ? AbstractC0627a.m(str2, false, 1, null) : null;
        this.f3166f = str3 != null ? AbstractC0627a.m(str3, false, 1, null) : null;
        this.f3167g = AbstractC0627a.r(str4, false, false, null, 7, null);
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC6987o.l(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0627a.p((String) it.next()));
        }
        this.f3168h = arrayList;
        y e8 = M.e(xVar);
        this.f3169i = e8;
        this.f3170j = new L(e8);
    }

    private final void a() {
        if (this.f3162b.length() <= 0 && !J6.r.a(this.f3161a.d(), "file")) {
            K k8 = f3160l;
            this.f3162b = k8.g();
            if (J6.r.a(this.f3161a, H.f3173c.c())) {
                this.f3161a = k8.k();
            }
            if (this.f3163c == 0) {
                this.f3163c = k8.l();
            }
        }
    }

    public final void A(String str) {
        this.f3165e = str != null ? AbstractC0627a.m(str, false, 1, null) : null;
    }

    public final K b() {
        a();
        return new K(this.f3161a, this.f3162b, this.f3163c, m(), this.f3170j.a(), i(), q(), l(), this.f3164d, c());
    }

    public final String c() {
        a();
        String sb = ((StringBuilder) F.d(this, new StringBuilder(256))).toString();
        J6.r.d(sb, "appendTo(StringBuilder(256)).toString()");
        return sb;
    }

    public final String d() {
        return this.f3167g;
    }

    public final y e() {
        return this.f3169i;
    }

    public final String f() {
        return this.f3166f;
    }

    public final List g() {
        return this.f3168h;
    }

    public final String h() {
        return this.f3165e;
    }

    public final String i() {
        return AbstractC0627a.k(this.f3167g, 0, 0, false, null, 15, null);
    }

    public final String j() {
        return this.f3162b;
    }

    public final y k() {
        return this.f3170j;
    }

    public final String l() {
        String str = this.f3166f;
        if (str != null) {
            return AbstractC0627a.i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final List m() {
        List list = this.f3168h;
        ArrayList arrayList = new ArrayList(AbstractC6987o.l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0627a.i((String) it.next(), 0, 0, null, 7, null));
        }
        return arrayList;
    }

    public final int n() {
        return this.f3163c;
    }

    public final H o() {
        return this.f3161a;
    }

    public final boolean p() {
        return this.f3164d;
    }

    public final String q() {
        String str = this.f3165e;
        if (str != null) {
            return AbstractC0627a.i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final void r(String str) {
        J6.r.e(str, "<set-?>");
        this.f3167g = str;
    }

    public final void s(y yVar) {
        J6.r.e(yVar, "value");
        this.f3169i = yVar;
        this.f3170j = new L(yVar);
    }

    public final void t(String str) {
        this.f3166f = str;
    }

    public String toString() {
        String sb = ((StringBuilder) F.d(this, new StringBuilder(256))).toString();
        J6.r.d(sb, "appendTo(StringBuilder(256)).toString()");
        return sb;
    }

    public final void u(List list) {
        J6.r.e(list, "<set-?>");
        this.f3168h = list;
    }

    public final void v(String str) {
        this.f3165e = str;
    }

    public final void w(String str) {
        J6.r.e(str, "<set-?>");
        this.f3162b = str;
    }

    public final void x(int i8) {
        this.f3163c = i8;
    }

    public final void y(H h8) {
        J6.r.e(h8, "<set-?>");
        this.f3161a = h8;
    }

    public final void z(boolean z7) {
        this.f3164d = z7;
    }

    public /* synthetic */ D(H h8, String str, int i8, String str2, String str3, List list, x xVar, String str4, boolean z7, int i9, AbstractC0650j abstractC0650j) {
        this((i9 & 1) != 0 ? H.f3173c.c() : h8, (i9 & 2) != 0 ? "" : str, (i9 & 4) != 0 ? 0 : i8, (i9 & 8) != 0 ? null : str2, (i9 & 16) == 0 ? str3 : null, (i9 & 32) != 0 ? AbstractC6987o.e() : list, (i9 & 64) != 0 ? x.f3452b.a() : xVar, (i9 & 128) == 0 ? str4 : "", (i9 & 256) == 0 ? z7 : false);
    }
}
