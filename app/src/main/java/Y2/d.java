package Y2;

import Z2.AbstractC0777p;
import Z2.r;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: o, reason: collision with root package name */
    protected final DataHolder f6065o;

    /* renamed from: s, reason: collision with root package name */
    protected int f6066s;

    /* renamed from: t, reason: collision with root package name */
    private int f6067t;

    public d(DataHolder dataHolder, int i8) {
        this.f6065o = (DataHolder) r.l(dataHolder);
        f(i8);
    }

    protected byte[] a(String str) {
        return this.f6065o.B0(str, this.f6066s, this.f6067t);
    }

    protected int b(String str) {
        return this.f6065o.C0(str, this.f6066s, this.f6067t);
    }

    protected String c(String str) {
        return this.f6065o.F0(str, this.f6066s, this.f6067t);
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (AbstractC0777p.a(Integer.valueOf(dVar.f6066s), Integer.valueOf(this.f6066s)) && AbstractC0777p.a(Integer.valueOf(dVar.f6067t), Integer.valueOf(this.f6067t)) && dVar.f6065o == this.f6065o) {
                return true;
            }
        }
        return false;
    }

    protected final void f(int i8) {
        boolean z7 = false;
        if (i8 >= 0 && i8 < this.f6065o.getCount()) {
            z7 = true;
        }
        r.p(z7);
        this.f6066s = i8;
        this.f6067t = this.f6065o.G0(i8);
    }

    public int hashCode() {
        return AbstractC0777p.b(Integer.valueOf(this.f6066s), Integer.valueOf(this.f6067t), this.f6065o);
    }
}
