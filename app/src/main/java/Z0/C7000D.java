package z0;

import android.view.View;
import android.view.ViewParent;

/* renamed from: z0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7000D {

    /* renamed from: a, reason: collision with root package name */
    private ViewParent f44674a;

    /* renamed from: b, reason: collision with root package name */
    private ViewParent f44675b;

    /* renamed from: c, reason: collision with root package name */
    private final View f44676c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f44677d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f44678e;

    public C7000D(View view) {
        this.f44676c = view;
    }

    private boolean g(int i8, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        ViewParent h8;
        int i13;
        int i14;
        int[] iArr3;
        if (!l() || (h8 = h(i12)) == null) {
            return false;
        }
        if (i8 == 0 && i9 == 0 && i10 == 0 && i11 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f44676c.getLocationInWindow(iArr);
            i13 = iArr[0];
            i14 = iArr[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr2 == null) {
            int[] i15 = i();
            i15[0] = 0;
            i15[1] = 0;
            iArr3 = i15;
        } else {
            iArr3 = iArr2;
        }
        AbstractC7022e0.d(h8, this.f44676c, i8, i9, i10, i11, i12, iArr3);
        if (iArr != null) {
            this.f44676c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i13;
            iArr[1] = iArr[1] - i14;
        }
        return true;
    }

    private ViewParent h(int i8) {
        if (i8 == 0) {
            return this.f44674a;
        }
        if (i8 != 1) {
            return null;
        }
        return this.f44675b;
    }

    private int[] i() {
        if (this.f44678e == null) {
            this.f44678e = new int[2];
        }
        return this.f44678e;
    }

    private void n(int i8, ViewParent viewParent) {
        if (i8 == 0) {
            this.f44674a = viewParent;
        } else {
            if (i8 != 1) {
                return;
            }
            this.f44675b = viewParent;
        }
    }

    public boolean a(float f8, float f9, boolean z7) {
        ViewParent h8;
        if (!l() || (h8 = h(0)) == null) {
            return false;
        }
        return AbstractC7022e0.a(h8, this.f44676c, f8, f9, z7);
    }

    public boolean b(float f8, float f9) {
        ViewParent h8;
        if (!l() || (h8 = h(0)) == null) {
            return false;
        }
        return AbstractC7022e0.b(h8, this.f44676c, f8, f9);
    }

    public boolean c(int i8, int i9, int[] iArr, int[] iArr2) {
        return d(i8, i9, iArr, iArr2, 0);
    }

    public boolean d(int i8, int i9, int[] iArr, int[] iArr2, int i10) {
        ViewParent h8;
        int i11;
        int i12;
        if (!l() || (h8 = h(i10)) == null) {
            return false;
        }
        if (i8 == 0 && i9 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f44676c.getLocationInWindow(iArr2);
            i11 = iArr2[0];
            i12 = iArr2[1];
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (iArr == null) {
            iArr = i();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        AbstractC7022e0.c(h8, this.f44676c, i8, i9, iArr, i10);
        if (iArr2 != null) {
            this.f44676c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i11;
            iArr2[1] = iArr2[1] - i12;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void e(int i8, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        g(i8, i9, i10, i11, iArr, i12, iArr2);
    }

    public boolean f(int i8, int i9, int i10, int i11, int[] iArr) {
        return g(i8, i9, i10, i11, iArr, 0, null);
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i8) {
        return h(i8) != null;
    }

    public boolean l() {
        return this.f44677d;
    }

    public void m(boolean z7) {
        if (this.f44677d) {
            X.K0(this.f44676c);
        }
        this.f44677d = z7;
    }

    public boolean o(int i8) {
        return p(i8, 0);
    }

    public boolean p(int i8, int i9) {
        if (k(i9)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View view = this.f44676c;
        for (ViewParent parent = this.f44676c.getParent(); parent != null; parent = parent.getParent()) {
            if (AbstractC7022e0.f(parent, view, this.f44676c, i8, i9)) {
                n(i9, parent);
                AbstractC7022e0.e(parent, view, this.f44676c, i8, i9);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int i8) {
        ViewParent h8 = h(i8);
        if (h8 != null) {
            AbstractC7022e0.g(h8, this.f44676c, i8);
            n(i8, null);
        }
    }
}
