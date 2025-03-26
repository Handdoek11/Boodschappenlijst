package Z2;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C1109h;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f6256a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private C1109h f6257b;

    public J(C1109h c1109h) {
        r.l(c1109h);
        this.f6257b = c1109h;
    }

    public final int a(Context context, int i8) {
        return this.f6256a.get(i8, -1);
    }

    public final int b(Context context, a.f fVar) {
        r.l(context);
        r.l(fVar);
        int i8 = 0;
        if (!fVar.i()) {
            return 0;
        }
        int j8 = fVar.j();
        int a8 = a(context, j8);
        if (a8 == -1) {
            int i9 = 0;
            while (true) {
                if (i9 >= this.f6256a.size()) {
                    i8 = -1;
                    break;
                }
                int keyAt = this.f6256a.keyAt(i9);
                if (keyAt > j8 && this.f6256a.get(keyAt) == 0) {
                    break;
                }
                i9++;
            }
            a8 = i8 == -1 ? this.f6257b.h(context, j8) : i8;
            this.f6256a.put(j8, a8);
        }
        return a8;
    }

    public final void c() {
        this.f6256a.clear();
    }
}
