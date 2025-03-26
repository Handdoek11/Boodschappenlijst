package d0;

import J6.AbstractC0650j;
import J6.r;
import java.util.Arrays;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5697c implements InterfaceC5695a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f35196c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f35197d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final float[] f35198a;

    /* renamed from: b, reason: collision with root package name */
    private final float[] f35199b;

    /* renamed from: d0.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(float f8, float[] fArr, float[] fArr2) {
            float f9;
            float f10;
            float f11;
            float a8;
            float abs = Math.abs(f8);
            float signum = Math.signum(f8);
            int binarySearch = Arrays.binarySearch(fArr, abs);
            if (binarySearch >= 0) {
                a8 = fArr2[binarySearch];
            } else {
                int i8 = -(binarySearch + 1);
                int i9 = i8 - 1;
                float f12 = 0.0f;
                if (i9 >= fArr.length - 1) {
                    float f13 = fArr[fArr.length - 1];
                    float f14 = fArr2[fArr.length - 1];
                    if (f13 == 0.0f) {
                        return 0.0f;
                    }
                    return f8 * (f14 / f13);
                }
                if (i9 == -1) {
                    float f15 = fArr[0];
                    f11 = fArr2[0];
                    f10 = f15;
                    f9 = 0.0f;
                } else {
                    float f16 = fArr[i9];
                    float f17 = fArr[i8];
                    f9 = fArr2[i9];
                    f12 = f16;
                    f10 = f17;
                    f11 = fArr2[i8];
                }
                a8 = d.f35200a.a(f9, f11, f12, f10, abs);
            }
            return signum * a8;
        }

        private a() {
        }
    }

    public C5697c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f35198a = fArr;
        this.f35199b = fArr2;
    }

    @Override // d0.InterfaceC5695a
    public float a(float f8) {
        return f35196c.b(f8, this.f35198a, this.f35199b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5697c)) {
            return false;
        }
        C5697c c5697c = (C5697c) obj;
        return Arrays.equals(this.f35198a, c5697c.f35198a) && Arrays.equals(this.f35199b, c5697c.f35199b);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f35198a) * 31) + Arrays.hashCode(this.f35199b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f35198a);
        r.d(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f35199b);
        r.d(arrays2, "toString(this)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
