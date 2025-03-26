package k0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: k0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6091f implements InterfaceC6089d {

    /* renamed from: d, reason: collision with root package name */
    p f38420d;

    /* renamed from: f, reason: collision with root package name */
    int f38422f;

    /* renamed from: g, reason: collision with root package name */
    public int f38423g;

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC6089d f38417a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38418b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38419c = false;

    /* renamed from: e, reason: collision with root package name */
    a f38421e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f38424h = 1;

    /* renamed from: i, reason: collision with root package name */
    C6092g f38425i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f38426j = false;

    /* renamed from: k, reason: collision with root package name */
    List f38427k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List f38428l = new ArrayList();

    /* renamed from: k0.f$a */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C6091f(p pVar) {
        this.f38420d = pVar;
    }

    @Override // k0.InterfaceC6089d
    public void a(InterfaceC6089d interfaceC6089d) {
        Iterator it = this.f38428l.iterator();
        while (it.hasNext()) {
            if (!((C6091f) it.next()).f38426j) {
                return;
            }
        }
        this.f38419c = true;
        InterfaceC6089d interfaceC6089d2 = this.f38417a;
        if (interfaceC6089d2 != null) {
            interfaceC6089d2.a(this);
        }
        if (this.f38418b) {
            this.f38420d.a(this);
            return;
        }
        C6091f c6091f = null;
        int i8 = 0;
        for (C6091f c6091f2 : this.f38428l) {
            if (!(c6091f2 instanceof C6092g)) {
                i8++;
                c6091f = c6091f2;
            }
        }
        if (c6091f != null && i8 == 1 && c6091f.f38426j) {
            C6092g c6092g = this.f38425i;
            if (c6092g != null) {
                if (!c6092g.f38426j) {
                    return;
                } else {
                    this.f38422f = this.f38424h * c6092g.f38423g;
                }
            }
            d(c6091f.f38423g + this.f38422f);
        }
        InterfaceC6089d interfaceC6089d3 = this.f38417a;
        if (interfaceC6089d3 != null) {
            interfaceC6089d3.a(this);
        }
    }

    public void b(InterfaceC6089d interfaceC6089d) {
        this.f38427k.add(interfaceC6089d);
        if (this.f38426j) {
            interfaceC6089d.a(interfaceC6089d);
        }
    }

    public void c() {
        this.f38428l.clear();
        this.f38427k.clear();
        this.f38426j = false;
        this.f38423g = 0;
        this.f38419c = false;
        this.f38418b = false;
    }

    public void d(int i8) {
        if (this.f38426j) {
            return;
        }
        this.f38426j = true;
        this.f38423g = i8;
        for (InterfaceC6089d interfaceC6089d : this.f38427k) {
            interfaceC6089d.a(interfaceC6089d);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f38420d.f38470b.t());
        sb.append(":");
        sb.append(this.f38421e);
        sb.append("(");
        sb.append(this.f38426j ? Integer.valueOf(this.f38423g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f38428l.size());
        sb.append(":d=");
        sb.append(this.f38427k.size());
        sb.append(">");
        return sb.toString();
    }
}
