package j0;

import j0.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected e f37864a;

    /* renamed from: b, reason: collision with root package name */
    protected e f37865b;

    /* renamed from: c, reason: collision with root package name */
    protected e f37866c;

    /* renamed from: d, reason: collision with root package name */
    protected e f37867d;

    /* renamed from: e, reason: collision with root package name */
    protected e f37868e;

    /* renamed from: f, reason: collision with root package name */
    protected e f37869f;

    /* renamed from: g, reason: collision with root package name */
    protected e f37870g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList f37871h;

    /* renamed from: i, reason: collision with root package name */
    protected int f37872i;

    /* renamed from: j, reason: collision with root package name */
    protected int f37873j;

    /* renamed from: k, reason: collision with root package name */
    protected float f37874k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f37875l;

    /* renamed from: m, reason: collision with root package name */
    int f37876m;

    /* renamed from: n, reason: collision with root package name */
    int f37877n;

    /* renamed from: o, reason: collision with root package name */
    boolean f37878o;

    /* renamed from: p, reason: collision with root package name */
    private int f37879p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f37880q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f37881r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f37882s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f37883t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f37884u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f37885v;

    public c(e eVar, int i8, boolean z7) {
        this.f37864a = eVar;
        this.f37879p = i8;
        this.f37880q = z7;
    }

    private void b() {
        int i8 = this.f37879p * 2;
        e eVar = this.f37864a;
        this.f37878o = true;
        e eVar2 = eVar;
        boolean z7 = false;
        while (!z7) {
            this.f37872i++;
            e[] eVarArr = eVar.f37917F0;
            int i9 = this.f37879p;
            e eVar3 = null;
            eVarArr[i9] = null;
            eVar.f37915E0[i9] = null;
            if (eVar.V() != 8) {
                this.f37875l++;
                e.b u7 = eVar.u(this.f37879p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (u7 != bVar) {
                    this.f37876m += eVar.E(this.f37879p);
                }
                int f8 = this.f37876m + eVar.f37938W[i8].f();
                this.f37876m = f8;
                int i10 = i8 + 1;
                this.f37876m = f8 + eVar.f37938W[i10].f();
                int f9 = this.f37877n + eVar.f37938W[i8].f();
                this.f37877n = f9;
                this.f37877n = f9 + eVar.f37938W[i10].f();
                if (this.f37865b == null) {
                    this.f37865b = eVar;
                }
                this.f37867d = eVar;
                e.b[] bVarArr = eVar.f37941Z;
                int i11 = this.f37879p;
                if (bVarArr[i11] == bVar) {
                    int i12 = eVar.f37990y[i11];
                    if (i12 == 0 || i12 == 3 || i12 == 2) {
                        this.f37873j++;
                        float f10 = eVar.f37913D0[i11];
                        if (f10 > 0.0f) {
                            this.f37874k += f10;
                        }
                        if (c(eVar, i11)) {
                            if (f10 < 0.0f) {
                                this.f37881r = true;
                            } else {
                                this.f37882s = true;
                            }
                            if (this.f37871h == null) {
                                this.f37871h = new ArrayList();
                            }
                            this.f37871h.add(eVar);
                        }
                        if (this.f37869f == null) {
                            this.f37869f = eVar;
                        }
                        e eVar4 = this.f37870g;
                        if (eVar4 != null) {
                            eVar4.f37915E0[this.f37879p] = eVar;
                        }
                        this.f37870g = eVar;
                    }
                    if (this.f37879p == 0) {
                        if (eVar.f37986w != 0 || eVar.f37992z != 0 || eVar.f37906A != 0) {
                            this.f37878o = false;
                        }
                    } else if (eVar.f37988x != 0 || eVar.f37910C != 0 || eVar.f37912D != 0) {
                        this.f37878o = false;
                    }
                    if (eVar.f37949d0 != 0.0f) {
                        this.f37878o = false;
                        this.f37884u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f37917F0[this.f37879p] = eVar;
            }
            d dVar = eVar.f37938W[i8 + 1].f37891f;
            if (dVar != null) {
                e eVar5 = dVar.f37889d;
                d dVar2 = eVar5.f37938W[i8].f37891f;
                if (dVar2 != null && dVar2.f37889d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z7 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f37865b;
        if (eVar6 != null) {
            this.f37876m -= eVar6.f37938W[i8].f();
        }
        e eVar7 = this.f37867d;
        if (eVar7 != null) {
            this.f37876m -= eVar7.f37938W[i8 + 1].f();
        }
        this.f37866c = eVar;
        if (this.f37879p == 0 && this.f37880q) {
            this.f37868e = eVar;
        } else {
            this.f37868e = this.f37864a;
        }
        this.f37883t = this.f37882s && this.f37881r;
    }

    private static boolean c(e eVar, int i8) {
        int i9;
        return eVar.V() != 8 && eVar.f37941Z[i8] == e.b.MATCH_CONSTRAINT && ((i9 = eVar.f37990y[i8]) == 0 || i9 == 3);
    }

    public void a() {
        if (!this.f37885v) {
            b();
        }
        this.f37885v = true;
    }
}
