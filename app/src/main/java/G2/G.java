package G2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final List f2583a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f2584b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List f2585c = new ArrayList();

    public final G a(String str, double d8, double d9) {
        int i8 = 0;
        while (i8 < this.f2583a.size()) {
            double doubleValue = ((Double) this.f2585c.get(i8)).doubleValue();
            double doubleValue2 = ((Double) this.f2584b.get(i8)).doubleValue();
            if (d8 < doubleValue || (doubleValue == d8 && d9 < doubleValue2)) {
                break;
            }
            i8++;
        }
        this.f2583a.add(i8, str);
        this.f2585c.add(i8, Double.valueOf(d8));
        this.f2584b.add(i8, Double.valueOf(d9));
        return this;
    }

    public final I b() {
        return new I(this, null);
    }
}
