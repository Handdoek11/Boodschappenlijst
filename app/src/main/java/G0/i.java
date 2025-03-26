package g0;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class i implements Comparable {

    /* renamed from: I, reason: collision with root package name */
    private static int f35958I = 1;

    /* renamed from: A, reason: collision with root package name */
    a f35959A;

    /* renamed from: o, reason: collision with root package name */
    public boolean f35967o;

    /* renamed from: s, reason: collision with root package name */
    private String f35968s;

    /* renamed from: w, reason: collision with root package name */
    public float f35972w;

    /* renamed from: t, reason: collision with root package name */
    public int f35969t = -1;

    /* renamed from: u, reason: collision with root package name */
    int f35970u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f35971v = 0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f35973x = false;

    /* renamed from: y, reason: collision with root package name */
    float[] f35974y = new float[9];

    /* renamed from: z, reason: collision with root package name */
    float[] f35975z = new float[9];

    /* renamed from: B, reason: collision with root package name */
    C5796b[] f35960B = new C5796b[16];

    /* renamed from: C, reason: collision with root package name */
    int f35961C = 0;

    /* renamed from: D, reason: collision with root package name */
    public int f35962D = 0;

    /* renamed from: E, reason: collision with root package name */
    boolean f35963E = false;

    /* renamed from: F, reason: collision with root package name */
    int f35964F = -1;

    /* renamed from: G, reason: collision with root package name */
    float f35965G = 0.0f;

    /* renamed from: H, reason: collision with root package name */
    HashSet f35966H = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f35959A = aVar;
    }

    static void f() {
        f35958I++;
    }

    public final void a(C5796b c5796b) {
        int i8 = 0;
        while (true) {
            int i9 = this.f35961C;
            if (i8 >= i9) {
                C5796b[] c5796bArr = this.f35960B;
                if (i9 >= c5796bArr.length) {
                    this.f35960B = (C5796b[]) Arrays.copyOf(c5796bArr, c5796bArr.length * 2);
                }
                C5796b[] c5796bArr2 = this.f35960B;
                int i10 = this.f35961C;
                c5796bArr2[i10] = c5796b;
                this.f35961C = i10 + 1;
                return;
            }
            if (this.f35960B[i8] == c5796b) {
                return;
            } else {
                i8++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f35969t - iVar.f35969t;
    }

    public final void g(C5796b c5796b) {
        int i8 = this.f35961C;
        int i9 = 0;
        while (i9 < i8) {
            if (this.f35960B[i9] == c5796b) {
                while (i9 < i8 - 1) {
                    C5796b[] c5796bArr = this.f35960B;
                    int i10 = i9 + 1;
                    c5796bArr[i9] = c5796bArr[i10];
                    i9 = i10;
                }
                this.f35961C--;
                return;
            }
            i9++;
        }
    }

    public void h() {
        this.f35968s = null;
        this.f35959A = a.UNKNOWN;
        this.f35971v = 0;
        this.f35969t = -1;
        this.f35970u = -1;
        this.f35972w = 0.0f;
        this.f35973x = false;
        this.f35963E = false;
        this.f35964F = -1;
        this.f35965G = 0.0f;
        int i8 = this.f35961C;
        for (int i9 = 0; i9 < i8; i9++) {
            this.f35960B[i9] = null;
        }
        this.f35961C = 0;
        this.f35962D = 0;
        this.f35967o = false;
        Arrays.fill(this.f35975z, 0.0f);
    }

    public void i(d dVar, float f8) {
        this.f35972w = f8;
        this.f35973x = true;
        this.f35963E = false;
        this.f35964F = -1;
        this.f35965G = 0.0f;
        int i8 = this.f35961C;
        this.f35970u = -1;
        for (int i9 = 0; i9 < i8; i9++) {
            this.f35960B[i9].A(dVar, this, false);
        }
        this.f35961C = 0;
    }

    public void k(a aVar, String str) {
        this.f35959A = aVar;
    }

    public final void l(d dVar, C5796b c5796b) {
        int i8 = this.f35961C;
        for (int i9 = 0; i9 < i8; i9++) {
            this.f35960B[i9].B(dVar, c5796b, false);
        }
        this.f35961C = 0;
    }

    public String toString() {
        if (this.f35968s != null) {
            return "" + this.f35968s;
        }
        return "" + this.f35969t;
    }
}
