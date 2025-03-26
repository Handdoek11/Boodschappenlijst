package Y2;

import Z2.r;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class e extends a {

    /* renamed from: s, reason: collision with root package name */
    private boolean f6068s;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList f6069t;

    protected e(DataHolder dataHolder) {
        super(dataHolder);
        this.f6068s = false;
    }

    private final void X() {
        synchronized (this) {
            try {
                if (!this.f6068s) {
                    int count = ((DataHolder) r.l(this.f6062o)).getCount();
                    ArrayList arrayList = new ArrayList();
                    this.f6069t = arrayList;
                    if (count > 0) {
                        arrayList.add(0);
                        String I7 = I();
                        String F02 = this.f6062o.F0(I7, 0, this.f6062o.G0(0));
                        for (int i8 = 1; i8 < count; i8++) {
                            int G02 = this.f6062o.G0(i8);
                            String F03 = this.f6062o.F0(I7, i8, G02);
                            if (F03 == null) {
                                throw new NullPointerException("Missing value for markerColumn: " + I7 + ", at row: " + i8 + ", for window: " + G02);
                            }
                            if (!F03.equals(F02)) {
                                this.f6069t.add(Integer.valueOf(i8));
                                F02 = F03;
                            }
                        }
                    }
                    this.f6068s = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract String I();

    final int T(int i8) {
        if (i8 >= 0 && i8 < this.f6069t.size()) {
            return ((Integer) this.f6069t.get(i8)).intValue();
        }
        throw new IllegalArgumentException("Position " + i8 + " is out of bounds for this buffer");
    }

    protected String e() {
        return null;
    }

    @Override // Y2.b
    public final Object get(int i8) {
        int intValue;
        int intValue2;
        X();
        int T7 = T(i8);
        int i9 = 0;
        if (i8 >= 0 && i8 != this.f6069t.size()) {
            if (i8 == this.f6069t.size() - 1) {
                intValue = ((DataHolder) r.l(this.f6062o)).getCount();
                intValue2 = ((Integer) this.f6069t.get(i8)).intValue();
            } else {
                intValue = ((Integer) this.f6069t.get(i8 + 1)).intValue();
                intValue2 = ((Integer) this.f6069t.get(i8)).intValue();
            }
            int i10 = intValue - intValue2;
            if (i10 == 1) {
                int T8 = T(i8);
                int G02 = ((DataHolder) r.l(this.f6062o)).G0(T8);
                String e8 = e();
                if (e8 == null || this.f6062o.F0(e8, T8, G02) != null) {
                    i9 = 1;
                }
            } else {
                i9 = i10;
            }
        }
        return j(T7, i9);
    }

    @Override // Y2.b
    public int getCount() {
        X();
        return this.f6069t.size();
    }

    protected abstract Object j(int i8, int i9);
}
