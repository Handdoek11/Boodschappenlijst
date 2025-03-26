package h5;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: h5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5841a extends e {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView.F f36238a;

    public C5841a(RecyclerView.F f8) {
        this.f36238a = f8;
    }

    @Override // h5.e
    public void a(RecyclerView.F f8) {
        if (this.f36238a == f8) {
            this.f36238a = null;
        }
    }

    @Override // h5.e
    public RecyclerView.F b() {
        return this.f36238a;
    }

    public String toString() {
        return "AddAnimationInfo{holder=" + this.f36238a + '}';
    }
}
