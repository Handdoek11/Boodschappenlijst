package h5;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class c extends e {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView.F f36250a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView.F f36251b;

    /* renamed from: c, reason: collision with root package name */
    public int f36252c;

    /* renamed from: d, reason: collision with root package name */
    public int f36253d;

    /* renamed from: e, reason: collision with root package name */
    public int f36254e;

    /* renamed from: f, reason: collision with root package name */
    public int f36255f;

    public c(RecyclerView.F f8, RecyclerView.F f9, int i8, int i9, int i10, int i11) {
        this.f36251b = f8;
        this.f36250a = f9;
        this.f36252c = i8;
        this.f36253d = i9;
        this.f36254e = i10;
        this.f36255f = i11;
    }

    @Override // h5.e
    public void a(RecyclerView.F f8) {
        if (this.f36251b == f8) {
            this.f36251b = null;
        }
        if (this.f36250a == f8) {
            this.f36250a = null;
        }
        if (this.f36251b == null && this.f36250a == null) {
            this.f36252c = 0;
            this.f36253d = 0;
            this.f36254e = 0;
            this.f36255f = 0;
        }
    }

    @Override // h5.e
    public RecyclerView.F b() {
        RecyclerView.F f8 = this.f36251b;
        return f8 != null ? f8 : this.f36250a;
    }

    public String toString() {
        return "ChangeInfo{, oldHolder=" + this.f36251b + ", newHolder=" + this.f36250a + ", fromX=" + this.f36252c + ", fromY=" + this.f36253d + ", toX=" + this.f36254e + ", toY=" + this.f36255f + '}';
    }
}
