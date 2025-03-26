package h5;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class i extends e {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView.F f36256a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36257b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36258c;

    /* renamed from: d, reason: collision with root package name */
    public final int f36259d;

    /* renamed from: e, reason: collision with root package name */
    public final int f36260e;

    public i(RecyclerView.F f8, int i8, int i9, int i10, int i11) {
        this.f36256a = f8;
        this.f36257b = i8;
        this.f36258c = i9;
        this.f36259d = i10;
        this.f36260e = i11;
    }

    @Override // h5.e
    public void a(RecyclerView.F f8) {
        if (this.f36256a == f8) {
            this.f36256a = null;
        }
    }

    @Override // h5.e
    public RecyclerView.F b() {
        return this.f36256a;
    }

    public String toString() {
        return "MoveAnimationInfo{holder=" + this.f36256a + ", fromX=" + this.f36257b + ", fromY=" + this.f36258c + ", toX=" + this.f36259d + ", toY=" + this.f36260e + '}';
    }
}
