package g0;

import g0.C5796b;
import java.util.Arrays;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5795a implements C5796b.a {

    /* renamed from: l, reason: collision with root package name */
    private static float f35899l = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final C5796b f35901b;

    /* renamed from: c, reason: collision with root package name */
    protected final C5797c f35902c;

    /* renamed from: a, reason: collision with root package name */
    int f35900a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f35903d = 8;

    /* renamed from: e, reason: collision with root package name */
    private i f35904e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f35905f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f35906g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f35907h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f35908i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f35909j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f35910k = false;

    C5795a(C5796b c5796b, C5797c c5797c) {
        this.f35901b = c5796b;
        this.f35902c = c5797c;
    }

    @Override // g0.C5796b.a
    public final void a(i iVar, float f8) {
        if (f8 == 0.0f) {
            c(iVar, true);
            return;
        }
        int i8 = this.f35908i;
        if (i8 == -1) {
            this.f35908i = 0;
            this.f35907h[0] = f8;
            this.f35905f[0] = iVar.f35969t;
            this.f35906g[0] = -1;
            iVar.f35962D++;
            iVar.a(this.f35901b);
            this.f35900a++;
            if (this.f35910k) {
                return;
            }
            int i9 = this.f35909j + 1;
            this.f35909j = i9;
            int[] iArr = this.f35905f;
            if (i9 >= iArr.length) {
                this.f35910k = true;
                this.f35909j = iArr.length - 1;
                return;
            }
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i8 != -1 && i11 < this.f35900a; i11++) {
            int i12 = this.f35905f[i8];
            int i13 = iVar.f35969t;
            if (i12 == i13) {
                this.f35907h[i8] = f8;
                return;
            }
            if (i12 < i13) {
                i10 = i8;
            }
            i8 = this.f35906g[i8];
        }
        int i14 = this.f35909j;
        int i15 = i14 + 1;
        if (this.f35910k) {
            int[] iArr2 = this.f35905f;
            if (iArr2[i14] != -1) {
                i14 = iArr2.length;
            }
        } else {
            i14 = i15;
        }
        int[] iArr3 = this.f35905f;
        if (i14 >= iArr3.length && this.f35900a < iArr3.length) {
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f35905f;
                if (i16 >= iArr4.length) {
                    break;
                }
                if (iArr4[i16] == -1) {
                    i14 = i16;
                    break;
                }
                i16++;
            }
        }
        int[] iArr5 = this.f35905f;
        if (i14 >= iArr5.length) {
            i14 = iArr5.length;
            int i17 = this.f35903d * 2;
            this.f35903d = i17;
            this.f35910k = false;
            this.f35909j = i14 - 1;
            this.f35907h = Arrays.copyOf(this.f35907h, i17);
            this.f35905f = Arrays.copyOf(this.f35905f, this.f35903d);
            this.f35906g = Arrays.copyOf(this.f35906g, this.f35903d);
        }
        this.f35905f[i14] = iVar.f35969t;
        this.f35907h[i14] = f8;
        if (i10 != -1) {
            int[] iArr6 = this.f35906g;
            iArr6[i14] = iArr6[i10];
            iArr6[i10] = i14;
        } else {
            this.f35906g[i14] = this.f35908i;
            this.f35908i = i14;
        }
        iVar.f35962D++;
        iVar.a(this.f35901b);
        int i18 = this.f35900a + 1;
        this.f35900a = i18;
        if (!this.f35910k) {
            this.f35909j++;
        }
        int[] iArr7 = this.f35905f;
        if (i18 >= iArr7.length) {
            this.f35910k = true;
        }
        if (this.f35909j >= iArr7.length) {
            this.f35910k = true;
            this.f35909j = iArr7.length - 1;
        }
    }

    @Override // g0.C5796b.a
    public int b() {
        return this.f35900a;
    }

    @Override // g0.C5796b.a
    public final float c(i iVar, boolean z7) {
        if (this.f35904e == iVar) {
            this.f35904e = null;
        }
        int i8 = this.f35908i;
        if (i8 == -1) {
            return 0.0f;
        }
        int i9 = 0;
        int i10 = -1;
        while (i8 != -1 && i9 < this.f35900a) {
            if (this.f35905f[i8] == iVar.f35969t) {
                if (i8 == this.f35908i) {
                    this.f35908i = this.f35906g[i8];
                } else {
                    int[] iArr = this.f35906g;
                    iArr[i10] = iArr[i8];
                }
                if (z7) {
                    iVar.g(this.f35901b);
                }
                iVar.f35962D--;
                this.f35900a--;
                this.f35905f[i8] = -1;
                if (this.f35910k) {
                    this.f35909j = i8;
                }
                return this.f35907h[i8];
            }
            i9++;
            i10 = i8;
            i8 = this.f35906g[i8];
        }
        return 0.0f;
    }

    @Override // g0.C5796b.a
    public final void clear() {
        int i8 = this.f35908i;
        for (int i9 = 0; i8 != -1 && i9 < this.f35900a; i9++) {
            i iVar = this.f35902c.f35920d[this.f35905f[i8]];
            if (iVar != null) {
                iVar.g(this.f35901b);
            }
            i8 = this.f35906g[i8];
        }
        this.f35908i = -1;
        this.f35909j = -1;
        this.f35910k = false;
        this.f35900a = 0;
    }

    @Override // g0.C5796b.a
    public boolean d(i iVar) {
        int i8 = this.f35908i;
        if (i8 == -1) {
            return false;
        }
        for (int i9 = 0; i8 != -1 && i9 < this.f35900a; i9++) {
            if (this.f35905f[i8] == iVar.f35969t) {
                return true;
            }
            i8 = this.f35906g[i8];
        }
        return false;
    }

    @Override // g0.C5796b.a
    public i e(int i8) {
        int i9 = this.f35908i;
        for (int i10 = 0; i9 != -1 && i10 < this.f35900a; i10++) {
            if (i10 == i8) {
                return this.f35902c.f35920d[this.f35905f[i9]];
            }
            i9 = this.f35906g[i9];
        }
        return null;
    }

    @Override // g0.C5796b.a
    public void f(i iVar, float f8, boolean z7) {
        float f9 = f35899l;
        if (f8 <= (-f9) || f8 >= f9) {
            int i8 = this.f35908i;
            if (i8 == -1) {
                this.f35908i = 0;
                this.f35907h[0] = f8;
                this.f35905f[0] = iVar.f35969t;
                this.f35906g[0] = -1;
                iVar.f35962D++;
                iVar.a(this.f35901b);
                this.f35900a++;
                if (this.f35910k) {
                    return;
                }
                int i9 = this.f35909j + 1;
                this.f35909j = i9;
                int[] iArr = this.f35905f;
                if (i9 >= iArr.length) {
                    this.f35910k = true;
                    this.f35909j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i10 = -1;
            for (int i11 = 0; i8 != -1 && i11 < this.f35900a; i11++) {
                int i12 = this.f35905f[i8];
                int i13 = iVar.f35969t;
                if (i12 == i13) {
                    float[] fArr = this.f35907h;
                    float f10 = fArr[i8] + f8;
                    float f11 = f35899l;
                    if (f10 > (-f11) && f10 < f11) {
                        f10 = 0.0f;
                    }
                    fArr[i8] = f10;
                    if (f10 == 0.0f) {
                        if (i8 == this.f35908i) {
                            this.f35908i = this.f35906g[i8];
                        } else {
                            int[] iArr2 = this.f35906g;
                            iArr2[i10] = iArr2[i8];
                        }
                        if (z7) {
                            iVar.g(this.f35901b);
                        }
                        if (this.f35910k) {
                            this.f35909j = i8;
                        }
                        iVar.f35962D--;
                        this.f35900a--;
                        return;
                    }
                    return;
                }
                if (i12 < i13) {
                    i10 = i8;
                }
                i8 = this.f35906g[i8];
            }
            int i14 = this.f35909j;
            int i15 = i14 + 1;
            if (this.f35910k) {
                int[] iArr3 = this.f35905f;
                if (iArr3[i14] != -1) {
                    i14 = iArr3.length;
                }
            } else {
                i14 = i15;
            }
            int[] iArr4 = this.f35905f;
            if (i14 >= iArr4.length && this.f35900a < iArr4.length) {
                int i16 = 0;
                while (true) {
                    int[] iArr5 = this.f35905f;
                    if (i16 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i16] == -1) {
                        i14 = i16;
                        break;
                    }
                    i16++;
                }
            }
            int[] iArr6 = this.f35905f;
            if (i14 >= iArr6.length) {
                i14 = iArr6.length;
                int i17 = this.f35903d * 2;
                this.f35903d = i17;
                this.f35910k = false;
                this.f35909j = i14 - 1;
                this.f35907h = Arrays.copyOf(this.f35907h, i17);
                this.f35905f = Arrays.copyOf(this.f35905f, this.f35903d);
                this.f35906g = Arrays.copyOf(this.f35906g, this.f35903d);
            }
            this.f35905f[i14] = iVar.f35969t;
            this.f35907h[i14] = f8;
            if (i10 != -1) {
                int[] iArr7 = this.f35906g;
                iArr7[i14] = iArr7[i10];
                iArr7[i10] = i14;
            } else {
                this.f35906g[i14] = this.f35908i;
                this.f35908i = i14;
            }
            iVar.f35962D++;
            iVar.a(this.f35901b);
            this.f35900a++;
            if (!this.f35910k) {
                this.f35909j++;
            }
            int i18 = this.f35909j;
            int[] iArr8 = this.f35905f;
            if (i18 >= iArr8.length) {
                this.f35910k = true;
                this.f35909j = iArr8.length - 1;
            }
        }
    }

    @Override // g0.C5796b.a
    public void g() {
        int i8 = this.f35908i;
        for (int i9 = 0; i8 != -1 && i9 < this.f35900a; i9++) {
            float[] fArr = this.f35907h;
            fArr[i8] = fArr[i8] * (-1.0f);
            i8 = this.f35906g[i8];
        }
    }

    @Override // g0.C5796b.a
    public float h(int i8) {
        int i9 = this.f35908i;
        for (int i10 = 0; i9 != -1 && i10 < this.f35900a; i10++) {
            if (i10 == i8) {
                return this.f35907h[i9];
            }
            i9 = this.f35906g[i9];
        }
        return 0.0f;
    }

    @Override // g0.C5796b.a
    public float i(C5796b c5796b, boolean z7) {
        float j8 = j(c5796b.f35911a);
        c(c5796b.f35911a, z7);
        C5796b.a aVar = c5796b.f35915e;
        int b8 = aVar.b();
        for (int i8 = 0; i8 < b8; i8++) {
            i e8 = aVar.e(i8);
            f(e8, aVar.j(e8) * j8, z7);
        }
        return j8;
    }

    @Override // g0.C5796b.a
    public final float j(i iVar) {
        int i8 = this.f35908i;
        for (int i9 = 0; i8 != -1 && i9 < this.f35900a; i9++) {
            if (this.f35905f[i8] == iVar.f35969t) {
                return this.f35907h[i8];
            }
            i8 = this.f35906g[i8];
        }
        return 0.0f;
    }

    @Override // g0.C5796b.a
    public void k(float f8) {
        int i8 = this.f35908i;
        for (int i9 = 0; i8 != -1 && i9 < this.f35900a; i9++) {
            float[] fArr = this.f35907h;
            fArr[i8] = fArr[i8] / f8;
            i8 = this.f35906g[i8];
        }
    }

    public String toString() {
        int i8 = this.f35908i;
        String str = "";
        for (int i9 = 0; i8 != -1 && i9 < this.f35900a; i9++) {
            str = ((str + " -> ") + this.f35907h[i8] + " : ") + this.f35902c.f35920d[this.f35905f[i8]];
            i8 = this.f35906g[i8];
        }
        return str;
    }
}
