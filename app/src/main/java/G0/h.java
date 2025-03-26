package g0;

import g0.C5796b;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class h extends C5796b {

    /* renamed from: g, reason: collision with root package name */
    private int f35948g;

    /* renamed from: h, reason: collision with root package name */
    private i[] f35949h;

    /* renamed from: i, reason: collision with root package name */
    private i[] f35950i;

    /* renamed from: j, reason: collision with root package name */
    private int f35951j;

    /* renamed from: k, reason: collision with root package name */
    b f35952k;

    /* renamed from: l, reason: collision with root package name */
    C5797c f35953l;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f35969t - iVar2.f35969t;
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        i f35955a;

        /* renamed from: b, reason: collision with root package name */
        h f35956b;

        b(h hVar) {
            this.f35956b = hVar;
        }

        public boolean a(i iVar, float f8) {
            boolean z7 = true;
            if (!this.f35955a.f35967o) {
                for (int i8 = 0; i8 < 9; i8++) {
                    float f9 = iVar.f35975z[i8];
                    if (f9 != 0.0f) {
                        float f10 = f9 * f8;
                        if (Math.abs(f10) < 1.0E-4f) {
                            f10 = 0.0f;
                        }
                        this.f35955a.f35975z[i8] = f10;
                    } else {
                        this.f35955a.f35975z[i8] = 0.0f;
                    }
                }
                return true;
            }
            for (int i9 = 0; i9 < 9; i9++) {
                float[] fArr = this.f35955a.f35975z;
                float f11 = fArr[i9] + (iVar.f35975z[i9] * f8);
                fArr[i9] = f11;
                if (Math.abs(f11) < 1.0E-4f) {
                    this.f35955a.f35975z[i9] = 0.0f;
                } else {
                    z7 = false;
                }
            }
            if (z7) {
                h.this.G(this.f35955a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f35955a = iVar;
        }

        public final boolean c() {
            for (int i8 = 8; i8 >= 0; i8--) {
                float f8 = this.f35955a.f35975z[i8];
                if (f8 > 0.0f) {
                    return false;
                }
                if (f8 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            for (int i8 = 8; i8 >= 0; i8--) {
                float f8 = iVar.f35975z[i8];
                float f9 = this.f35955a.f35975z[i8];
                if (f9 != f8) {
                    return f9 < f8;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f35955a.f35975z, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f35955a != null) {
                for (int i8 = 0; i8 < 9; i8++) {
                    str = str + this.f35955a.f35975z[i8] + " ";
                }
            }
            return str + "] " + this.f35955a;
        }
    }

    public h(C5797c c5797c) {
        super(c5797c);
        this.f35948g = 128;
        this.f35949h = new i[128];
        this.f35950i = new i[128];
        this.f35951j = 0;
        this.f35952k = new b(this);
        this.f35953l = c5797c;
    }

    private void F(i iVar) {
        int i8;
        int i9 = this.f35951j + 1;
        i[] iVarArr = this.f35949h;
        if (i9 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f35949h = iVarArr2;
            this.f35950i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f35949h;
        int i10 = this.f35951j;
        iVarArr3[i10] = iVar;
        int i11 = i10 + 1;
        this.f35951j = i11;
        if (i11 > 1 && iVarArr3[i10].f35969t > iVar.f35969t) {
            int i12 = 0;
            while (true) {
                i8 = this.f35951j;
                if (i12 >= i8) {
                    break;
                }
                this.f35950i[i12] = this.f35949h[i12];
                i12++;
            }
            Arrays.sort(this.f35950i, 0, i8, new a());
            for (int i13 = 0; i13 < this.f35951j; i13++) {
                this.f35949h[i13] = this.f35950i[i13];
            }
        }
        iVar.f35967o = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(i iVar) {
        int i8 = 0;
        while (i8 < this.f35951j) {
            if (this.f35949h[i8] == iVar) {
                while (true) {
                    int i9 = this.f35951j;
                    if (i8 >= i9 - 1) {
                        this.f35951j = i9 - 1;
                        iVar.f35967o = false;
                        return;
                    } else {
                        i[] iVarArr = this.f35949h;
                        int i10 = i8 + 1;
                        iVarArr[i8] = iVarArr[i10];
                        i8 = i10;
                    }
                }
            } else {
                i8++;
            }
        }
    }

    @Override // g0.C5796b
    public void B(d dVar, C5796b c5796b, boolean z7) {
        i iVar = c5796b.f35911a;
        if (iVar == null) {
            return;
        }
        C5796b.a aVar = c5796b.f35915e;
        int b8 = aVar.b();
        for (int i8 = 0; i8 < b8; i8++) {
            i e8 = aVar.e(i8);
            float h8 = aVar.h(i8);
            this.f35952k.b(e8);
            if (this.f35952k.a(iVar, h8)) {
                F(e8);
            }
            this.f35912b += c5796b.f35912b * h8;
        }
        G(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // g0.C5796b, g0.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g0.i a(g0.d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.f35951j
            if (r0 >= r2) goto L32
            g0.i[] r2 = r4.f35949h
            r2 = r2[r0]
            int r3 = r2.f35969t
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            g0.h$b r3 = r4.f35952k
            r3.b(r2)
            if (r1 != r5) goto L22
            g0.h$b r2 = r4.f35952k
            boolean r2 = r2.c()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            g0.h$b r2 = r4.f35952k
            g0.i[] r3 = r4.f35949h
            r3 = r3[r1]
            boolean r2 = r2.d(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            g0.i[] r5 = r4.f35949h
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.h.a(g0.d, boolean[]):g0.i");
    }

    @Override // g0.C5796b, g0.d.a
    public void c(i iVar) {
        this.f35952k.b(iVar);
        this.f35952k.e();
        iVar.f35975z[iVar.f35971v] = 1.0f;
        F(iVar);
    }

    @Override // g0.C5796b, g0.d.a
    public void clear() {
        this.f35951j = 0;
        this.f35912b = 0.0f;
    }

    @Override // g0.C5796b, g0.d.a
    public boolean isEmpty() {
        return this.f35951j == 0;
    }

    @Override // g0.C5796b
    public String toString() {
        String str = " goal -> (" + this.f35912b + ") : ";
        for (int i8 = 0; i8 < this.f35951j; i8++) {
            this.f35952k.b(this.f35949h[i8]);
            str = str + this.f35952k + " ";
        }
        return str;
    }
}
