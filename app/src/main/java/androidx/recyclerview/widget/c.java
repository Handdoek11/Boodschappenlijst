package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class c implements k {

    /* renamed from: a, reason: collision with root package name */
    final k f11101a;

    /* renamed from: b, reason: collision with root package name */
    int f11102b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f11103c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f11104d = -1;

    /* renamed from: e, reason: collision with root package name */
    Object f11105e = null;

    public c(k kVar) {
        this.f11101a = kVar;
    }

    @Override // androidx.recyclerview.widget.k
    public void a(int i8, int i9) {
        e();
        this.f11101a.a(i8, i9);
    }

    @Override // androidx.recyclerview.widget.k
    public void b(int i8, int i9) {
        int i10;
        if (this.f11102b == 1 && i8 >= (i10 = this.f11103c)) {
            int i11 = this.f11104d;
            if (i8 <= i10 + i11) {
                this.f11104d = i11 + i9;
                this.f11103c = Math.min(i8, i10);
                return;
            }
        }
        e();
        this.f11103c = i8;
        this.f11104d = i9;
        this.f11102b = 1;
    }

    @Override // androidx.recyclerview.widget.k
    public void c(int i8, int i9) {
        int i10;
        if (this.f11102b == 2 && (i10 = this.f11103c) >= i8 && i10 <= i8 + i9) {
            this.f11104d += i9;
            this.f11103c = i8;
        } else {
            e();
            this.f11103c = i8;
            this.f11104d = i9;
            this.f11102b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.k
    public void d(int i8, int i9, Object obj) {
        int i10;
        if (this.f11102b == 3) {
            int i11 = this.f11103c;
            int i12 = this.f11104d;
            if (i8 <= i11 + i12 && (i10 = i8 + i9) >= i11 && this.f11105e == obj) {
                this.f11103c = Math.min(i8, i11);
                this.f11104d = Math.max(i12 + i11, i10) - this.f11103c;
                return;
            }
        }
        e();
        this.f11103c = i8;
        this.f11104d = i9;
        this.f11105e = obj;
        this.f11102b = 3;
    }

    public void e() {
        int i8 = this.f11102b;
        if (i8 == 0) {
            return;
        }
        if (i8 == 1) {
            this.f11101a.b(this.f11103c, this.f11104d);
        } else if (i8 == 2) {
            this.f11101a.c(this.f11103c, this.f11104d);
        } else if (i8 == 3) {
            this.f11101a.d(this.f11103c, this.f11104d, this.f11105e);
        }
        this.f11105e = null;
        this.f11102b = 0;
    }
}
