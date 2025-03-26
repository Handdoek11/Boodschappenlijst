package m7;

import i7.k;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f39467a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    private int[] f39468b;

    /* renamed from: c, reason: collision with root package name */
    private int f39469c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f39470a = new a();

        private a() {
        }
    }

    public w() {
        int[] iArr = new int[8];
        for (int i8 = 0; i8 < 8; i8++) {
            iArr[i8] = -1;
        }
        this.f39468b = iArr;
        this.f39469c = -1;
    }

    private final void e() {
        int i8 = this.f39469c * 2;
        Object[] copyOf = Arrays.copyOf(this.f39467a, i8);
        J6.r.d(copyOf, "copyOf(this, newSize)");
        this.f39467a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.f39468b, i8);
        J6.r.d(copyOf2, "copyOf(this, newSize)");
        this.f39468b = copyOf2;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i8 = this.f39469c + 1;
        for (int i9 = 0; i9 < i8; i9++) {
            Object obj = this.f39467a[i9];
            if (obj instanceof i7.f) {
                i7.f fVar = (i7.f) obj;
                if (!J6.r.a(fVar.e(), k.b.f36737a)) {
                    int i10 = this.f39468b[i9];
                    if (i10 >= 0) {
                        sb.append(".");
                        sb.append(fVar.h(i10));
                    }
                } else if (this.f39468b[i9] != -1) {
                    sb.append("[");
                    sb.append(this.f39468b[i9]);
                    sb.append("]");
                }
            } else if (obj != a.f39470a) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        String sb2 = sb.toString();
        J6.r.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void b() {
        int i8 = this.f39469c;
        int[] iArr = this.f39468b;
        if (iArr[i8] == -2) {
            iArr[i8] = -1;
            this.f39469c = i8 - 1;
        }
        int i9 = this.f39469c;
        if (i9 != -1) {
            this.f39469c = i9 - 1;
        }
    }

    public final void c(i7.f fVar) {
        J6.r.e(fVar, "sd");
        int i8 = this.f39469c + 1;
        this.f39469c = i8;
        if (i8 == this.f39467a.length) {
            e();
        }
        this.f39467a[i8] = fVar;
    }

    public final void d() {
        int[] iArr = this.f39468b;
        int i8 = this.f39469c;
        if (iArr[i8] == -2) {
            this.f39467a[i8] = a.f39470a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.f39468b;
        int i8 = this.f39469c;
        if (iArr[i8] != -2) {
            int i9 = i8 + 1;
            this.f39469c = i9;
            if (i9 == this.f39467a.length) {
                e();
            }
        }
        Object[] objArr = this.f39467a;
        int i10 = this.f39469c;
        objArr[i10] = obj;
        this.f39468b[i10] = -2;
    }

    public final void g(int i8) {
        this.f39468b[this.f39469c] = i8;
    }

    public String toString() {
        return a();
    }
}
