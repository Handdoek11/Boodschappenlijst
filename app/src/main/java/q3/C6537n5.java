package q3;

import java.util.Arrays;

/* renamed from: q3.n5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6537n5 extends K3 {
    public C6537n5() {
        super(4);
    }

    public final C6537n5 a(Object obj) {
        obj.getClass();
        int i8 = this.f41219b;
        int i9 = i8 + 1;
        Object[] objArr = this.f41218a;
        int length = objArr.length;
        if (length < i9) {
            int i10 = length + (length >> 1) + 1;
            if (i10 < i9) {
                int highestOneBit = Integer.highestOneBit(i8);
                i10 = highestOneBit + highestOneBit;
            }
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
            this.f41218a = Arrays.copyOf(objArr, i10);
            this.f41220c = false;
        } else if (this.f41220c) {
            this.f41218a = (Object[]) objArr.clone();
            this.f41220c = false;
        }
        Object[] objArr2 = this.f41218a;
        int i11 = this.f41219b;
        this.f41219b = i11 + 1;
        objArr2[i11] = obj;
        return this;
    }

    public final P6 b() {
        this.f41220c = true;
        return P6.n(this.f41218a, this.f41219b);
    }
}
