package d3;

import Z2.AbstractC0777p;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import c3.C0984f;
import com.google.android.gms.common.C1105d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5711a extends AbstractC0813a {
    public static final Parcelable.Creator<C5711a> CREATOR = new C5716f();

    /* renamed from: v, reason: collision with root package name */
    private static final Comparator f35234v = new Comparator() { // from class: d3.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            C1105d c1105d = (C1105d) obj;
            C1105d c1105d2 = (C1105d) obj2;
            Parcelable.Creator<C5711a> creator = C5711a.CREATOR;
            return !c1105d.getName().equals(c1105d2.getName()) ? c1105d.getName().compareTo(c1105d2.getName()) : (c1105d.A0() > c1105d2.A0() ? 1 : (c1105d.A0() == c1105d2.A0() ? 0 : -1));
        }
    };

    /* renamed from: o, reason: collision with root package name */
    private final List f35235o;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f35236s;

    /* renamed from: t, reason: collision with root package name */
    private final String f35237t;

    /* renamed from: u, reason: collision with root package name */
    private final String f35238u;

    public C5711a(List list, boolean z7, String str, String str2) {
        Z2.r.l(list);
        this.f35235o = list;
        this.f35236s = z7;
        this.f35237t = str;
        this.f35238u = str2;
    }

    public static C5711a A0(C0984f c0984f) {
        return C0(c0984f.a(), true);
    }

    static C5711a C0(List list, boolean z7) {
        TreeSet treeSet = new TreeSet(f35234v);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((W2.c) it.next()).a());
        }
        return new C5711a(new ArrayList(treeSet), z7, null, null);
    }

    public List B0() {
        return this.f35235o;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5711a)) {
            return false;
        }
        C5711a c5711a = (C5711a) obj;
        return this.f35236s == c5711a.f35236s && AbstractC0777p.a(this.f35235o, c5711a.f35235o) && AbstractC0777p.a(this.f35237t, c5711a.f35237t) && AbstractC0777p.a(this.f35238u, c5711a.f35238u);
    }

    public final int hashCode() {
        return AbstractC0777p.b(Boolean.valueOf(this.f35236s), this.f35235o, this.f35237t, this.f35238u);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.w(parcel, 1, B0(), false);
        AbstractC0814b.c(parcel, 2, this.f35236s);
        AbstractC0814b.s(parcel, 3, this.f35237t, false);
        AbstractC0814b.s(parcel, 4, this.f35238u, false);
        AbstractC0814b.b(parcel, a8);
    }
}
