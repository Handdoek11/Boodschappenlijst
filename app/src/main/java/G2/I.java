package G2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f2586a;

    /* renamed from: b, reason: collision with root package name */
    private final double[] f2587b;

    /* renamed from: c, reason: collision with root package name */
    private final double[] f2588c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f2589d;

    /* renamed from: e, reason: collision with root package name */
    private int f2590e;

    /* synthetic */ I(G g8, H h8) {
        int size = g8.f2584b.size();
        this.f2586a = (String[]) g8.f2583a.toArray(new String[size]);
        this.f2587b = c(g8.f2584b);
        this.f2588c = c(g8.f2585c);
        this.f2589d = new int[size];
        this.f2590e = 0;
    }

    private static final double[] c(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i8 = 0; i8 < size; i8++) {
            dArr[i8] = ((Double) list.get(i8)).doubleValue();
        }
        return dArr;
    }

    public final List a() {
        I i8 = this;
        ArrayList arrayList = new ArrayList(i8.f2586a.length);
        int i9 = 0;
        while (true) {
            String[] strArr = i8.f2586a;
            if (i9 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i9];
            double[] dArr = i8.f2588c;
            double[] dArr2 = i8.f2587b;
            int[] iArr = i8.f2589d;
            double d8 = dArr[i9];
            double d9 = dArr2[i9];
            int i10 = iArr[i9];
            arrayList.add(new F(str, d8, d9, i10 / i8.f2590e, i10));
            i9++;
            i8 = this;
        }
    }

    public final void b(double d8) {
        this.f2590e++;
        int i8 = 0;
        while (true) {
            double[] dArr = this.f2588c;
            if (i8 >= dArr.length) {
                return;
            }
            double d9 = dArr[i8];
            if (d9 <= d8 && d8 < this.f2587b[i8]) {
                int[] iArr = this.f2589d;
                iArr[i8] = iArr[i8] + 1;
            }
            if (d8 < d9) {
                return;
            } else {
                i8++;
            }
        }
    }
}
