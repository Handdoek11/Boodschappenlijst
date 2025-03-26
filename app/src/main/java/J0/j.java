package j0;

import java.util.ArrayList;
import java.util.Arrays;
import k0.o;

/* loaded from: classes.dex */
public abstract class j extends e implements i {

    /* renamed from: L0, reason: collision with root package name */
    public e[] f38082L0 = new e[4];

    /* renamed from: M0, reason: collision with root package name */
    public int f38083M0 = 0;

    @Override // j0.i
    public void a(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i8 = this.f38083M0 + 1;
        e[] eVarArr = this.f38082L0;
        if (i8 > eVarArr.length) {
            this.f38082L0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f38082L0;
        int i9 = this.f38083M0;
        eVarArr2[i9] = eVar;
        this.f38083M0 = i9 + 1;
    }

    @Override // j0.i
    public void b() {
        this.f38083M0 = 0;
        Arrays.fill(this.f38082L0, (Object) null);
    }

    public void s1(ArrayList arrayList, int i8, o oVar) {
        for (int i9 = 0; i9 < this.f38083M0; i9++) {
            oVar.a(this.f38082L0[i9]);
        }
        for (int i10 = 0; i10 < this.f38083M0; i10++) {
            k0.i.a(this.f38082L0[i10], i8, arrayList, oVar);
        }
    }

    public int t1(int i8) {
        int i9;
        int i10;
        for (int i11 = 0; i11 < this.f38083M0; i11++) {
            e eVar = this.f38082L0[i11];
            if (i8 == 0 && (i10 = eVar.f37923I0) != -1) {
                return i10;
            }
            if (i8 == 1 && (i9 = eVar.f37925J0) != -1) {
                return i9;
            }
        }
        return -1;
    }

    @Override // j0.i
    public void c(f fVar) {
    }
}
