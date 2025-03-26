package z;

import t.AbstractC6764b;
import t.P;
import y6.AbstractC6980h;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private int f44668a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f44669b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    private P[] f44670c = new P[16];

    private final int b(Object obj, int i8) {
        int i9 = this.f44668a - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = this.f44669b[i11];
            if (i12 < i8) {
                i10 = i11 + 1;
            } else {
                if (i12 <= i8) {
                    P p8 = this.f44670c[i11];
                    return obj == (p8 != null ? p8.get() : null) ? i11 : c(i11, obj, i8);
                }
                i9 = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        r4 = r4 + 1;
        r0 = r3.f44668a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r4 >= r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r3.f44669b[r4] == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        return -(r4 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        r2 = r3.f44670c[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r2 = r2.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (r2 != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r4 = r3.f44668a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int c(int r4, java.lang.Object r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = 0
            r2 = -1
            if (r2 >= r0) goto L1d
            int[] r2 = r3.f44669b
            r2 = r2[r0]
            if (r2 == r6) goto Ld
            goto L1d
        Ld:
            t.P[] r2 = r3.f44670c
            r2 = r2[r0]
            if (r2 == 0) goto L17
            java.lang.Object r1 = r2.get()
        L17:
            if (r1 != r5) goto L1a
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.f44668a
        L21:
            if (r4 >= r0) goto L3f
            int[] r2 = r3.f44669b
            r2 = r2[r4]
            if (r2 == r6) goto L2d
        L29:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L2d:
            t.P[] r2 = r3.f44670c
            r2 = r2[r4]
            if (r2 == 0) goto L38
            java.lang.Object r2 = r2.get()
            goto L39
        L38:
            r2 = r1
        L39:
            if (r2 != r5) goto L3c
            return r4
        L3c:
            int r4 = r4 + 1
            goto L21
        L3f:
            int r4 = r3.f44668a
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: z.f.c(int, java.lang.Object, int):int");
    }

    public final boolean a(Object obj) {
        int i8;
        int i9 = this.f44668a;
        int a8 = AbstractC6764b.a(obj);
        if (i9 > 0) {
            i8 = b(obj, a8);
            if (i8 >= 0) {
                return false;
            }
        } else {
            i8 = -1;
        }
        int i10 = -(i8 + 1);
        P[] pArr = this.f44670c;
        int length = pArr.length;
        if (i9 == length) {
            int i11 = length * 2;
            P[] pArr2 = new P[i11];
            int[] iArr = new int[i11];
            int i12 = i10 + 1;
            AbstractC6980h.g(pArr, pArr2, i12, i10, i9);
            AbstractC6980h.j(this.f44670c, pArr2, 0, 0, i10, 6, null);
            AbstractC6980h.e(this.f44669b, iArr, i12, i10, i9);
            AbstractC6980h.i(this.f44669b, iArr, 0, 0, i10, 6, null);
            this.f44670c = pArr2;
            this.f44669b = iArr;
        } else {
            int i13 = i10 + 1;
            AbstractC6980h.g(pArr, pArr, i13, i10, i9);
            int[] iArr2 = this.f44669b;
            AbstractC6980h.e(iArr2, iArr2, i13, i10, i9);
        }
        this.f44670c[i10] = new P(obj);
        this.f44669b[i10] = a8;
        this.f44668a++;
        return true;
    }

    public final int[] d() {
        return this.f44669b;
    }

    public final int e() {
        return this.f44668a;
    }

    public final P[] f() {
        return this.f44670c;
    }

    public final void g(int i8) {
        this.f44668a = i8;
    }
}
