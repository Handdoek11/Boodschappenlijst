package g0;

import g0.C5796b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class j implements C5796b.a {

    /* renamed from: n, reason: collision with root package name */
    private static float f35982n = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    private final int f35983a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f35984b = 16;

    /* renamed from: c, reason: collision with root package name */
    private int f35985c = 16;

    /* renamed from: d, reason: collision with root package name */
    int[] f35986d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    int[] f35987e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f35988f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    float[] f35989g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    int[] f35990h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f35991i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int f35992j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f35993k = -1;

    /* renamed from: l, reason: collision with root package name */
    private final C5796b f35994l;

    /* renamed from: m, reason: collision with root package name */
    protected final C5797c f35995m;

    j(C5796b c5796b, C5797c c5797c) {
        this.f35994l = c5796b;
        this.f35995m = c5797c;
        clear();
    }

    private void l(i iVar, int i8) {
        int[] iArr;
        int i9 = iVar.f35969t % this.f35985c;
        int[] iArr2 = this.f35986d;
        int i10 = iArr2[i9];
        if (i10 == -1) {
            iArr2[i9] = i8;
        } else {
            while (true) {
                iArr = this.f35987e;
                int i11 = iArr[i10];
                if (i11 == -1) {
                    break;
                } else {
                    i10 = i11;
                }
            }
            iArr[i10] = i8;
        }
        this.f35987e[i8] = -1;
    }

    private void m(int i8, i iVar, float f8) {
        this.f35988f[i8] = iVar.f35969t;
        this.f35989g[i8] = f8;
        this.f35990h[i8] = -1;
        this.f35991i[i8] = -1;
        iVar.a(this.f35994l);
        iVar.f35962D++;
        this.f35992j++;
    }

    private int n() {
        for (int i8 = 0; i8 < this.f35984b; i8++) {
            if (this.f35988f[i8] == -1) {
                return i8;
            }
        }
        return -1;
    }

    private void o() {
        int i8 = this.f35984b * 2;
        this.f35988f = Arrays.copyOf(this.f35988f, i8);
        this.f35989g = Arrays.copyOf(this.f35989g, i8);
        this.f35990h = Arrays.copyOf(this.f35990h, i8);
        this.f35991i = Arrays.copyOf(this.f35991i, i8);
        this.f35987e = Arrays.copyOf(this.f35987e, i8);
        for (int i9 = this.f35984b; i9 < i8; i9++) {
            this.f35988f[i9] = -1;
            this.f35987e[i9] = -1;
        }
        this.f35984b = i8;
    }

    private void q(int i8, i iVar, float f8) {
        int n8 = n();
        m(n8, iVar, f8);
        if (i8 != -1) {
            this.f35990h[n8] = i8;
            int[] iArr = this.f35991i;
            iArr[n8] = iArr[i8];
            iArr[i8] = n8;
        } else {
            this.f35990h[n8] = -1;
            if (this.f35992j > 0) {
                this.f35991i[n8] = this.f35993k;
                this.f35993k = n8;
            } else {
                this.f35991i[n8] = -1;
            }
        }
        int i9 = this.f35991i[n8];
        if (i9 != -1) {
            this.f35990h[i9] = n8;
        }
        l(iVar, n8);
    }

    private void r(i iVar) {
        int[] iArr;
        int i8;
        int i9 = iVar.f35969t;
        int i10 = i9 % this.f35985c;
        int[] iArr2 = this.f35986d;
        int i11 = iArr2[i10];
        if (i11 == -1) {
            return;
        }
        if (this.f35988f[i11] == i9) {
            int[] iArr3 = this.f35987e;
            iArr2[i10] = iArr3[i11];
            iArr3[i11] = -1;
            return;
        }
        while (true) {
            iArr = this.f35987e;
            i8 = iArr[i11];
            if (i8 == -1 || this.f35988f[i8] == i9) {
                break;
            } else {
                i11 = i8;
            }
        }
        if (i8 == -1 || this.f35988f[i8] != i9) {
            return;
        }
        iArr[i11] = iArr[i8];
        iArr[i8] = -1;
    }

    @Override // g0.C5796b.a
    public void a(i iVar, float f8) {
        float f9 = f35982n;
        if (f8 > (-f9) && f8 < f9) {
            c(iVar, true);
            return;
        }
        if (this.f35992j == 0) {
            m(0, iVar, f8);
            l(iVar, 0);
            this.f35993k = 0;
            return;
        }
        int p8 = p(iVar);
        if (p8 != -1) {
            this.f35989g[p8] = f8;
            return;
        }
        if (this.f35992j + 1 >= this.f35984b) {
            o();
        }
        int i8 = this.f35992j;
        int i9 = this.f35993k;
        int i10 = -1;
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = this.f35988f[i9];
            int i13 = iVar.f35969t;
            if (i12 == i13) {
                this.f35989g[i9] = f8;
                return;
            }
            if (i12 < i13) {
                i10 = i9;
            }
            i9 = this.f35991i[i9];
            if (i9 == -1) {
                break;
            }
        }
        q(i10, iVar, f8);
    }

    @Override // g0.C5796b.a
    public int b() {
        return this.f35992j;
    }

    @Override // g0.C5796b.a
    public float c(i iVar, boolean z7) {
        int p8 = p(iVar);
        if (p8 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f8 = this.f35989g[p8];
        if (this.f35993k == p8) {
            this.f35993k = this.f35991i[p8];
        }
        this.f35988f[p8] = -1;
        int[] iArr = this.f35990h;
        int i8 = iArr[p8];
        if (i8 != -1) {
            int[] iArr2 = this.f35991i;
            iArr2[i8] = iArr2[p8];
        }
        int i9 = this.f35991i[p8];
        if (i9 != -1) {
            iArr[i9] = iArr[p8];
        }
        this.f35992j--;
        iVar.f35962D--;
        if (z7) {
            iVar.g(this.f35994l);
        }
        return f8;
    }

    @Override // g0.C5796b.a
    public void clear() {
        int i8 = this.f35992j;
        for (int i9 = 0; i9 < i8; i9++) {
            i e8 = e(i9);
            if (e8 != null) {
                e8.g(this.f35994l);
            }
        }
        for (int i10 = 0; i10 < this.f35984b; i10++) {
            this.f35988f[i10] = -1;
            this.f35987e[i10] = -1;
        }
        for (int i11 = 0; i11 < this.f35985c; i11++) {
            this.f35986d[i11] = -1;
        }
        this.f35992j = 0;
        this.f35993k = -1;
    }

    @Override // g0.C5796b.a
    public boolean d(i iVar) {
        return p(iVar) != -1;
    }

    @Override // g0.C5796b.a
    public i e(int i8) {
        int i9 = this.f35992j;
        if (i9 == 0) {
            return null;
        }
        int i10 = this.f35993k;
        for (int i11 = 0; i11 < i9; i11++) {
            if (i11 == i8 && i10 != -1) {
                return this.f35995m.f35920d[this.f35988f[i10]];
            }
            i10 = this.f35991i[i10];
            if (i10 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // g0.C5796b.a
    public void f(i iVar, float f8, boolean z7) {
        float f9 = f35982n;
        if (f8 <= (-f9) || f8 >= f9) {
            int p8 = p(iVar);
            if (p8 == -1) {
                a(iVar, f8);
                return;
            }
            float[] fArr = this.f35989g;
            float f10 = fArr[p8] + f8;
            fArr[p8] = f10;
            float f11 = f35982n;
            if (f10 <= (-f11) || f10 >= f11) {
                return;
            }
            fArr[p8] = 0.0f;
            c(iVar, z7);
        }
    }

    @Override // g0.C5796b.a
    public void g() {
        int i8 = this.f35992j;
        int i9 = this.f35993k;
        for (int i10 = 0; i10 < i8; i10++) {
            float[] fArr = this.f35989g;
            fArr[i9] = fArr[i9] * (-1.0f);
            i9 = this.f35991i[i9];
            if (i9 == -1) {
                return;
            }
        }
    }

    @Override // g0.C5796b.a
    public float h(int i8) {
        int i9 = this.f35992j;
        int i10 = this.f35993k;
        for (int i11 = 0; i11 < i9; i11++) {
            if (i11 == i8) {
                return this.f35989g[i10];
            }
            i10 = this.f35991i[i10];
            if (i10 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // g0.C5796b.a
    public float i(C5796b c5796b, boolean z7) {
        float j8 = j(c5796b.f35911a);
        c(c5796b.f35911a, z7);
        j jVar = (j) c5796b.f35915e;
        int b8 = jVar.b();
        int i8 = 0;
        int i9 = 0;
        while (i8 < b8) {
            int i10 = jVar.f35988f[i9];
            if (i10 != -1) {
                f(this.f35995m.f35920d[i10], jVar.f35989g[i9] * j8, z7);
                i8++;
            }
            i9++;
        }
        return j8;
    }

    @Override // g0.C5796b.a
    public float j(i iVar) {
        int p8 = p(iVar);
        if (p8 != -1) {
            return this.f35989g[p8];
        }
        return 0.0f;
    }

    @Override // g0.C5796b.a
    public void k(float f8) {
        int i8 = this.f35992j;
        int i9 = this.f35993k;
        for (int i10 = 0; i10 < i8; i10++) {
            float[] fArr = this.f35989g;
            fArr[i9] = fArr[i9] / f8;
            i9 = this.f35991i[i9];
            if (i9 == -1) {
                return;
            }
        }
    }

    public int p(i iVar) {
        if (this.f35992j != 0 && iVar != null) {
            int i8 = iVar.f35969t;
            int i9 = this.f35986d[i8 % this.f35985c];
            if (i9 == -1) {
                return -1;
            }
            if (this.f35988f[i9] == i8) {
                return i9;
            }
            do {
                i9 = this.f35987e[i9];
                if (i9 == -1) {
                    break;
                }
            } while (this.f35988f[i9] != i8);
            if (i9 != -1 && this.f35988f[i9] == i8) {
                return i9;
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i8 = this.f35992j;
        for (int i9 = 0; i9 < i8; i9++) {
            i e8 = e(i9);
            if (e8 != null) {
                String str2 = str + e8 + " = " + h(i9) + " ";
                int p8 = p(e8);
                String str3 = str2 + "[p: ";
                String str4 = (this.f35990h[p8] != -1 ? str3 + this.f35995m.f35920d[this.f35988f[this.f35990h[p8]]] : str3 + "none") + ", n: ";
                str = (this.f35991i[p8] != -1 ? str4 + this.f35995m.f35920d[this.f35988f[this.f35991i[p8]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
