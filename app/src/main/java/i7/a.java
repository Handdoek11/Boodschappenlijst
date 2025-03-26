package i7;

import J6.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f36692a;

    /* renamed from: b, reason: collision with root package name */
    private List f36693b;

    /* renamed from: c, reason: collision with root package name */
    private final List f36694c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f36695d;

    /* renamed from: e, reason: collision with root package name */
    private final List f36696e;

    /* renamed from: f, reason: collision with root package name */
    private final List f36697f;

    /* renamed from: g, reason: collision with root package name */
    private final List f36698g;

    public a(String str) {
        r.e(str, "serialName");
        this.f36692a = str;
        this.f36693b = AbstractC6987o.e();
        this.f36694c = new ArrayList();
        this.f36695d = new HashSet();
        this.f36696e = new ArrayList();
        this.f36697f = new ArrayList();
        this.f36698g = new ArrayList();
    }

    public static /* synthetic */ void b(a aVar, String str, f fVar, List list, boolean z7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            list = AbstractC6987o.e();
        }
        if ((i8 & 8) != 0) {
            z7 = false;
        }
        aVar.a(str, fVar, list, z7);
    }

    public final void a(String str, f fVar, List list, boolean z7) {
        r.e(str, "elementName");
        r.e(fVar, "descriptor");
        r.e(list, "annotations");
        if (!this.f36695d.add(str)) {
            throw new IllegalArgumentException(("Element with name '" + str + "' is already registered").toString());
        }
        this.f36694c.add(str);
        this.f36696e.add(fVar);
        this.f36697f.add(list);
        this.f36698g.add(Boolean.valueOf(z7));
    }

    public final List c() {
        return this.f36693b;
    }

    public final List d() {
        return this.f36697f;
    }

    public final List e() {
        return this.f36696e;
    }

    public final List f() {
        return this.f36694c;
    }

    public final List g() {
        return this.f36698g;
    }

    public final void h(List list) {
        r.e(list, "<set-?>");
        this.f36693b = list;
    }
}
