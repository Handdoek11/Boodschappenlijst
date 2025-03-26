package f5;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5786a {

    /* renamed from: a, reason: collision with root package name */
    private final List f35884a = new ArrayList();

    public C5786a a(RecyclerView.h hVar, Object obj) {
        return b(new C5787b(hVar, obj));
    }

    public C5786a b(C5787b c5787b) {
        this.f35884a.add(c5787b);
        return this;
    }

    public C5786a c(C5791f c5791f) {
        return a(c5791f.f35893a, c5791f.f35894b);
    }

    public C5786a d() {
        this.f35884a.clear();
        return this;
    }

    public C5787b e() {
        if (this.f35884a.isEmpty()) {
            return null;
        }
        return (C5787b) this.f35884a.get(r0.size() - 1);
    }

    public List f() {
        return this.f35884a;
    }
}
