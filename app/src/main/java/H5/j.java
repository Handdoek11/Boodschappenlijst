package h5;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class j extends e {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView.F f36261a;

    public j(RecyclerView.F f8) {
        this.f36261a = f8;
    }

    @Override // h5.e
    public void a(RecyclerView.F f8) {
        if (this.f36261a == f8) {
            this.f36261a = null;
        }
    }

    @Override // h5.e
    public RecyclerView.F b() {
        return this.f36261a;
    }

    public String toString() {
        return "RemoveAnimationInfo{holder=" + this.f36261a + '}';
    }
}
