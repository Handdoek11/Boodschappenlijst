package com.headcode.ourgroceries.android;

import android.content.Context;
import android.print.PrintManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.headcode.ourgroceries.android.Z0;
import j$.util.DesugarCollections;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import s5.K;
import t5.AbstractC6803e;
import t5.AbstractC6804f;

/* renamed from: com.headcode.ourgroceries.android.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5688z0 implements Comparable, Iterable {

    /* renamed from: w, reason: collision with root package name */
    private static final Comparator f35133w = P1.f34314f;

    /* renamed from: x, reason: collision with root package name */
    public static final Comparator f35134x = new Comparator() { // from class: com.headcode.ourgroceries.android.y0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C5688z0.f0((C5688z0) obj, (C5688z0) obj2);
        }
    };

    /* renamed from: o, reason: collision with root package name */
    private s5.P f35135o;

    /* renamed from: s, reason: collision with root package name */
    private final ArrayList f35136s;

    /* renamed from: t, reason: collision with root package name */
    private final List f35137t;

    /* renamed from: u, reason: collision with root package name */
    private WebView f35138u = null;

    /* renamed from: v, reason: collision with root package name */
    private Map f35139v = null;

    /* renamed from: com.headcode.ourgroceries.android.z0$a */
    class a extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC5575j2 f35140a;

        a(AbstractActivityC5575j2 abstractActivityC5575j2) {
            this.f35140a = abstractActivityC5575j2;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            C5688z0 c5688z0 = C5688z0.this;
            c5688z0.y(webView, this.f35140a, c5688z0.W());
            C5688z0.this.f35138u = null;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return false;
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.z0$b */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35142a;

        static {
            int[] iArr = new int[s5.Q.values().length];
            f35142a = iArr;
            try {
                iArr[s5.Q.SHOPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35142a[s5.Q.RECIPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35142a[s5.Q.MASTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35142a[s5.Q.CATEGORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.z0$c */
    public enum c {
        ALPHABETICALLY,
        RECENT_AT_BOTTOM,
        RECENT_AT_TOP,
        BY_FREQUENCY,
        BY_DRAG_AND_DROP;

        public boolean c() {
            return this == RECENT_AT_BOTTOM || this == RECENT_AT_TOP;
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.z0$d */
    public enum d {
        ALPHABETICALLY,
        BY_DRAG_AND_DROP
    }

    public C5688z0(s5.Q q8, String str) {
        this.f35135o = s5.P.I().z(q8).A(str).y(s5.M.w().v(AbstractC6804f.a()).w(AbstractC6804f.a())).m();
        ArrayList arrayList = new ArrayList();
        this.f35136s = arrayList;
        this.f35137t = DesugarCollections.unmodifiableList(arrayList);
    }

    private C5688z0 C() {
        C5688z0 c5688z0 = new C5688z0(this.f35135o);
        c5688z0.t(this.f35136s);
        return c5688z0;
    }

    public static List F(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C5688z0) it.next()).C());
        }
        return arrayList;
    }

    private StringBuilder P(Context context, C5688z0 c5688z0, boolean z7) {
        StringBuilder sb = new StringBuilder();
        if (z7) {
            String format = DateFormat.getDateInstance(2).format(new Date());
            sb.append("<style type=\"text/css\" media=\"print\">\n@page {\n    size: auto;\n    margin: 19mm;\n}\nhtml {\n    background-color: #FFFFFF;\n    margin: 0px;\n}\nbody {\n    margin: 0mm;\n}\n.lists {\n    columns: 2;\n    clear: both;\n}\n</style>");
            sb.append("<div style='font-family: sans-serif;'><span style='float: right; text-align: right; color: #777; padding-left: 2em; padding-top: 0.5em;'><div style='margin-bottom: .5em;'>");
            sb.append(AbstractC6803e.i(format));
            sb.append("</div>Lists by<br>OurGroceries</span><h1 style='margin-top: 0; padding-top: 0;'>");
            sb.append(AbstractC6803e.i(W()));
            sb.append("</h1><div class='lists'>");
        }
        boolean z8 = false;
        if (U() == s5.Q.SHOPPING) {
            B0 e8 = B0.e(c5688z0);
            Iterator it = this.f35136s.iterator();
            while (it.hasNext()) {
                Z0 z02 = (Z0) it.next();
                if (!z02.P()) {
                    e8.a(z02);
                }
            }
            List<C5565i0> d8 = e8.d();
            if (d8.size() > 0 && ((C5565i0) d8.get(0)).g()) {
                z8 = true;
            }
            for (C5565i0 c5565i0 : d8) {
                Z0 z03 = (Z0) c5565i0.a();
                if (c5565i0.g()) {
                    if (z7) {
                        sb.append("<div style='padding: 1.5em 0 .5em 0; font-size: 12px;'>");
                        sb.append(AbstractC6803e.i(z03.E().toUpperCase()));
                        sb.append("</div>");
                    } else {
                        sb.append(z03.E());
                        sb.append('\n');
                    }
                }
                w(sb, c5565i0.c(), z7, z8);
            }
        } else {
            w(sb, Z(d.ALPHABETICALLY), z7, false);
        }
        if (z7) {
            sb.append("</div>");
        }
        String X7 = X();
        if (!X7.isEmpty()) {
            if (z7) {
                sb.append("<h3 style='margin: 2em 0 0;'>Notes</h3><p>");
                sb.append(AbstractC6803e.i(X7).replace("\n", "<br>"));
                sb.append("</p>");
            } else {
                sb.append("\n");
                sb.append(context.getString(M2.f34211w2));
                sb.append("\n\n");
                sb.append(X7);
                sb.append("\n");
            }
        }
        if (z7) {
            sb.append("</div>");
        }
        return sb;
    }

    private ArrayList Z(d dVar) {
        ArrayList arrayList = new ArrayList(this.f35136s.size());
        Iterator it = this.f35136s.iterator();
        while (it.hasNext()) {
            Z0 z02 = (Z0) it.next();
            if (!z02.P()) {
                arrayList.add(z02);
            }
        }
        if (dVar.ordinal() != 0) {
            Collections.sort(arrayList, Z0.f34625y);
        } else {
            Collections.sort(arrayList, Z0.f34626z);
        }
        return arrayList;
    }

    private void b0() {
        this.f35139v = null;
    }

    public static boolean d0(s5.Q q8) {
        return q8 == s5.Q.SHOPPING || q8 == s5.Q.RECIPE || q8 == s5.Q.MASTER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int f0(C5688z0 c5688z0, C5688z0 c5688z02) {
        int signum = Integer.signum(c5688z02.Q()) - Integer.signum(c5688z0.Q());
        return signum != 0 ? signum : c5688z0.compareTo(c5688z02);
    }

    private void w(StringBuilder sb, List list, boolean z7, boolean z8) {
        if (z7) {
            sb.append("<ul style='margin: 0;'>");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Z0 z02 = (Z0) it.next();
            if (z7) {
                sb.append("<li style='list-style-type: \"☐  \"; padding: .25em 0; font-size: 16px;'>");
                sb.append(AbstractC6803e.i(z02.E()));
                if (z02.C() == s5.r0.STAR_YELLOW) {
                    sb.append(" ⭐");
                }
                if (!z02.y().isEmpty()) {
                    sb.append("<div style='font-size: 12px; color: #888;'>");
                    sb.append(AbstractC6803e.i(z02.y()));
                    sb.append("</div>");
                }
                sb.append("</li>");
            } else {
                if (z8) {
                    sb.append("    ");
                }
                sb.append("• ");
                sb.append(z02.E());
                if (z02.C() == s5.r0.STAR_YELLOW) {
                    sb.append(" ⭐");
                }
                sb.append('\n');
                if (!z02.y().isEmpty()) {
                    if (z8) {
                        sb.append("    ");
                    }
                    sb.append("  (");
                    sb.append(z02.y());
                    sb.append(")\n");
                }
            }
        }
        if (z7) {
            sb.append("</ul>");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(WebView webView, AbstractActivityC5575j2 abstractActivityC5575j2, String str) {
        if (webView == null) {
            AbstractC5673x.a("printNull");
        } else {
            abstractActivityC5575j2.r1(((PrintManager) abstractActivityC5575j2.getSystemService("print")).print(str, webView.createPrintDocumentAdapter(str), null), T());
        }
    }

    public List H(String str, String str2) {
        Iterator it = this.f35136s.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            Z0 z02 = (Z0) it.next();
            if (!z02.P() && z02.L(str, str2)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(z02);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public Z0 I(String str) {
        Iterator it = this.f35136s.iterator();
        while (it.hasNext()) {
            Z0 z02 = (Z0) it.next();
            if (z02.E().equalsIgnoreCase(str)) {
                return z02;
            }
        }
        return null;
    }

    public Z0 J(String str) {
        return Z0.q(this.f35136s, str);
    }

    public List L(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f35136s.iterator();
        while (it.hasNext()) {
            Z0 z02 = (Z0) it.next();
            if (z02.t().equalsIgnoreCase(str)) {
                arrayList.add(z02);
            }
        }
        return arrayList;
    }

    public List N(String str) {
        Iterator it = this.f35136s.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            Z0 z02 = (Z0) it.next();
            if (z02.s().equals(str)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(z02);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public List O(String str, String str2) {
        Iterator it = this.f35136s.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            Z0 z02 = (Z0) it.next();
            if (z02.H(str, str2)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(z02);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public int Q() {
        Iterator it = this.f35136s.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (!((Z0) it.next()).P()) {
                i8++;
            }
        }
        return i8;
    }

    public m5.j R(m5.p pVar) {
        m5.j jVar = new m5.j(W(), pVar);
        r(jVar);
        return jVar;
    }

    public Map S() {
        if (this.f35139v == null) {
            this.f35139v = new HashMap(this.f35136s.size());
            Iterator it = this.f35136s.iterator();
            while (it.hasNext()) {
                Z0 z02 = (Z0) it.next();
                Z0.a m8 = z02.m();
                Z0 z03 = (Z0) this.f35139v.get(m8);
                if (z03 == null || z03.r() < z02.r()) {
                    this.f35139v.put(m8, z02);
                }
            }
        }
        return this.f35139v;
    }

    public String T() {
        return this.f35135o.u().p();
    }

    public s5.Q U() {
        return this.f35135o.v();
    }

    public String V() {
        int i8 = b.f35142a[U().ordinal()];
        if (i8 == 1) {
            return "Shopping";
        }
        if (i8 == 2) {
            return "Recipe";
        }
        if (i8 == 3) {
            return "Master";
        }
        if (i8 == 4) {
            return "Category";
        }
        throw new IllegalStateException("Unknown list type " + U());
    }

    public String W() {
        return this.f35135o.w();
    }

    public String X() {
        return this.f35135o.y();
    }

    public s5.K Y() {
        K.b y7 = s5.K.u().y(this.f35135o);
        Iterator it = this.f35136s.iterator();
        while (it.hasNext()) {
            y7.m(((Z0) it.next()).z());
        }
        return y7.p();
    }

    public String a0() {
        return this.f35135o.u().r();
    }

    public boolean c0() {
        return d0(U());
    }

    public Z0 e0(int i8) {
        return (Z0) this.f35136s.get(i8);
    }

    public Map g0() {
        HashMap hashMap = new HashMap(size());
        Iterator it = this.f35136s.iterator();
        while (it.hasNext()) {
            Z0 z02 = (Z0) it.next();
            hashMap.put(z02.w(), z02.E());
        }
        return hashMap;
    }

    public void i0(AbstractActivityC5575j2 abstractActivityC5575j2, C5688z0 c5688z0) {
        AbstractC5673x.a("print");
        AbstractC5673x.a("print" + V());
        StringBuilder P7 = P(abstractActivityC5575j2, c5688z0, true);
        WebView webView = new WebView(abstractActivityC5575j2);
        this.f35138u = webView;
        webView.setWebViewClient(new a(abstractActivityC5575j2));
        this.f35138u.loadDataWithBaseURL(null, P7.toString(), "text/HTML", "UTF-8", null);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f35137t.iterator();
    }

    public void j0(Z0 z02) {
        if (z02 == null) {
            return;
        }
        ListIterator listIterator = this.f35136s.listIterator();
        while (listIterator.hasNext()) {
            Z0 z03 = (Z0) listIterator.next();
            if (z03 == z02 || z03.w().equals(z02.w())) {
                listIterator.remove();
                b0();
            }
        }
    }

    public void k0(Z0 z02) {
        if (z02 == null) {
            return;
        }
        int size = this.f35136s.size();
        for (int i8 = 0; i8 < size; i8++) {
            Z0 z03 = (Z0) this.f35136s.get(i8);
            if (z03 == z02) {
                return;
            }
            if (z03.K(z02)) {
                this.f35136s.set(i8, z02);
                b0();
                return;
            }
        }
    }

    public void l0(Context context, C5688z0 c5688z0) {
        String string = context.getString(b.f35142a[U().ordinal()] != 2 ? M2.f34227y2 : M2.f34219x2, W());
        String upperCase = W().toUpperCase(Locale.getDefault());
        StringBuilder P7 = P(context, c5688z0, false);
        P7.append("\n---\n");
        P7.append(context.getString(M2.f34235z2));
        P7.append("\n");
        P7.insert(0, "\n\n").insert(0, upperCase);
        P1.N(context, string, P7.toString());
    }

    public void m0(String str) {
        this.f35135o = s5.P.J(this.f35135o).A(str).m();
    }

    public void n0(String str) {
        this.f35135o = s5.P.J(this.f35135o).B(str).m();
    }

    public void o0(s5.K k8) {
        this.f35135o = k8.r();
        this.f35136s.clear();
        Iterator it = k8.q().iterator();
        while (it.hasNext()) {
            this.f35136s.add(new Z0((s5.N) it.next()));
        }
        b0();
    }

    public void r(m5.j jVar) {
        Iterator it = this.f35136s.iterator();
        while (it.hasNext()) {
            Z0 z02 = (Z0) it.next();
            if (!z02.P()) {
                jVar.a(z02.G());
            }
        }
    }

    public void s(Z0 z02) {
        this.f35136s.add(z02);
        Map map = this.f35139v;
        if (map != null) {
            map.put(z02.m(), z02);
        }
    }

    public int size() {
        return this.f35136s.size();
    }

    public void t(List list) {
        this.f35136s.addAll(list);
        if (this.f35139v != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Z0 z02 = (Z0) it.next();
                this.f35139v.put(z02.m(), z02);
            }
        }
    }

    public String toString() {
        return W();
    }

    public void v(List list) {
        list.addAll(this.f35136s);
    }

    @Override // java.lang.Comparable
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public int compareTo(C5688z0 c5688z0) {
        return f35133w.compare(W(), c5688z0.W());
    }

    public C5688z0(s5.P p8) {
        this.f35135o = p8;
        ArrayList arrayList = new ArrayList();
        this.f35136s = arrayList;
        this.f35137t = DesugarCollections.unmodifiableList(arrayList);
    }

    public C5688z0(s5.K k8) {
        ArrayList arrayList = new ArrayList(k8.p());
        this.f35136s = arrayList;
        this.f35137t = DesugarCollections.unmodifiableList(arrayList);
        o0(k8);
    }
}
